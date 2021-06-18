package com.example.util;

public class StringUtils {

    public static boolean isEmpty(String str) {
        return str == null || "".equals(str);
    }

    public static String join(String split, String[] strArray) {
        if (strArray == null || strArray.length == 0) {
            return "";
        }

        String result = "";

        for (int i = 0; i < strArray.length; i++) {
            result = result + split + strArray[i];
        }

        return result.substring(split.length());
    }
}