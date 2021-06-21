package com.example.util;

/**
 * 〈为了知道是访问onepay 还是访问paytree做的一个小工具〉
 *
 * @author cql
 * @create 2021/6/21
 * @since 1.0.0
 */
public class UrlCompareUtil {
    public static boolean  isPaytree(String url){
        if(StringUtils.isEmpty(url)){
            System.out.println("参数为空");
        }
        if(url.contains(Url.OnepayUrl_1.toString())||url.contains(Url.OnepayUrl_2.toString())){
            return false;
        }
        return true;
    }

}