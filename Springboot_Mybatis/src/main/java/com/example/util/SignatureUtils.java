package com.example.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map.Entry;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

public class SignatureUtils {

    public static String sign(final String jsonString, final String IgnoreItemName) {
        if (StringUtils.isEmpty(jsonString)) {
            return null;
        }

        final JSONObject jsonObject = JSON.parseObject(jsonString);
        final String sortedStr = convertObjectToSortedString(jsonObject, IgnoreItemName);
        return "{" + sortedStr + "}";
    }

    public static String sign(final String jsonString, final String signKey, final String IgnoreItemName) {
        if (StringUtils.isEmpty(jsonString) || StringUtils.isEmpty(signKey)) {
            return null;
        }

        final JSONObject jsonObject = JSON.parseObject(jsonString);
        final String sortedStr = convertObjectToSortedString(jsonObject, IgnoreItemName);
        return "{" + sortedStr + "&key=" + signKey + "}";
    }

    public static String signForCpay(final String jsonString, final String IgnoreItemName) {
        if (StringUtils.isEmpty(jsonString)) {
            return null;
        }
        final JSONObject jsonObject = JSON.parseObject(jsonString);
        final String sortedStr = convertObjectToSortedStringForCpay(jsonObject, IgnoreItemName);
        return sortedStr;
    }

    private static String convertJsonArrayToSortedString(final JSONArray array, final String IgnoreItemName) {
        if (array.size() == 0) {
            return "[]";
        }

        final String arrayItemClassName = array.get(0).getClass().getSimpleName();
        String tmp = "";

        if ("String".equals(arrayItemClassName)) {
            for (final Object arrayItem : array) {
                tmp = tmp + "," + (String)arrayItem;
            }

            return "[" + tmp.substring(1) + "]";
        } else {
            for (final Object arrayItem : array) {
                tmp = tmp + ",{" + convertObjectToSortedString(arrayItem, IgnoreItemName) + "}";
            }

            return "[" + tmp.substring(1) + "]";
        }
    }

    public static String signForCommonIssue(final String jsonString, final String signKey,
        final String IgnoreItemName) {
        if (StringUtils.isEmpty(jsonString) || StringUtils.isEmpty(signKey)) {
            return null;
        }

        final JSONObject jsonObject = JSON.parseObject(jsonString);
        final String sortedStr = convertObjectToSortedString(jsonObject, IgnoreItemName);
        return "{" + sortedStr + signKey + "}";
    }

    private static String convertJsonObjectToSortedString(final JSONObject object, final String IgnoreItemName) {
        final ArrayList<String> entities = new ArrayList<>();

        for (final Entry<String, Object> o : (object).entrySet()) {
            if (!o.getKey().equals(IgnoreItemName)) {
                final String objectItemClassName = o.getValue().getClass().getSimpleName();
                final String tmpResult = convertObjectToSortedString(o.getValue(), IgnoreItemName);

                if ("JSONObject".equals(objectItemClassName)) {
                    entities.add(o.getKey() + "={" + tmpResult + "}");
                } else {
                    entities.add(o.getKey() + "=" + tmpResult);
                }
            }
        }

        final String[] entityArray = entities.toArray(new String[entities.size()]);
        Arrays.sort(entityArray, String.CASE_INSENSITIVE_ORDER);
        return StringUtils.join("&", entityArray);
    }

    private static String convertJsonObjectToSortedStringForCpay(final JSONObject object, final String IgnoreItemName) {
        final ArrayList<String> entities = new ArrayList<>();

        for (final Entry<String, Object> o : (object).entrySet()) {
            if (!o.getKey().equals(IgnoreItemName)) {
                final String objectItemClassName = o.getValue().getClass().getSimpleName();
                final String tmpResult = convertObjectToSortedStringForCpay(o.getValue(), IgnoreItemName);
                if (!StringUtils.isEmpty(tmpResult)) {
                    if ("JSONObject".equals(objectItemClassName)) {
                        entities.add(o.getKey() + "={" + tmpResult + "}");
                    } else {
                        entities.add(o.getKey() + "=" + tmpResult);
                    }
                }
            }
        }

        final String[] entityArray = entities.toArray(new String[entities.size()]);
        Arrays.sort(entityArray);
        return StringUtils.join("&", entityArray);
    }

    private static String convertObjectToSortedString(final Object object, final String IgnoreItemName) {
        final String className = object.getClass().getSimpleName();

        if ("JSONArray".equals(className)) {
            return convertJsonArrayToSortedString((JSONArray)object, IgnoreItemName);
        } else if ("JSONObject".equals(className)) {
            return convertJsonObjectToSortedString((JSONObject)object, IgnoreItemName);
        } else {
            return String.valueOf(object);
        }
    }

    private static String convertObjectToSortedStringForCpay(final Object object, final String IgnoreItemName) {
        final String className = object.getClass().getSimpleName();

        if ("JSONArray".equals(className)) {
            return convertJsonArrayToSortedString((JSONArray)object, IgnoreItemName);
        } else if ("JSONObject".equals(className)) {
            return convertJsonObjectToSortedStringForCpay((JSONObject)object, IgnoreItemName);
        } else {
            return String.valueOf(object);
        }
    }
}