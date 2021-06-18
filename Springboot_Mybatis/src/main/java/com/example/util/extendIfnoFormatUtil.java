package com.example.util;

/**
 * 〈〉
 *为了将extendInfo 转化为 string类型的json
 * @author cql
 * @create 2020/7/2
 * @since 1.0.0
 */
public class extendIfnoFormatUtil {
    public static String getNewStordStr(String str){
        if(StringUtils.isEmpty(str)){
            return "";
        }
        int startIndex=str.indexOf("{",1);
        int endIndex=str.indexOf("}",1);
        if(startIndex<=-1){
            return str;
        }
        String aatwo=str.substring(startIndex+1,endIndex);
        String aathree="\""+aatwo.replaceAll("=","\":\"").replaceAll("&","\",\"")+"\"";
        String newStr=str.replace(aatwo,aathree);
        return newStr;
    }
}