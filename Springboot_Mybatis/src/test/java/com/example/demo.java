package com.example;

/**
 * 〈〉
 *
 * @author cql
 * @create 2021/2/9
 * @since 1.0.0
 */
public class demo{
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<2048;i++){
            sb.append(2);
        }
        System.out.println(sb.toString());
    }
}