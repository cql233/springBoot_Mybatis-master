package com.example;

import java.io.IOException;

/**
 * 〈〉
 *
 * @author cql
 * @create 2021/1/21
 * @since 1.0.0
 */
public class Test {
    public static void main(String[] args) throws IOException {
     String one="abc2";
    final String two="abc";
    final String three=two+2;
        System.out.println(one.hashCode());
        System.out.println(two.hashCode());
        System.out.println(three.hashCode());
        System.out.println(one==three);
    }


}