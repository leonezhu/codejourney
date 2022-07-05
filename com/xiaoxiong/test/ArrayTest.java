package com.xiaoxiong.test;

import java.util.Optional;

/**
 * @author XiaoXiong
 * @date 2022/1/19 11:50
 */
public class ArrayTest {


    public static void main(String[] args) {


        String str = "sddsf";

        String arr = "A,B,C";


        String result = str != null ? str : arr.split(";")[1];

        System.out.println("result = " + result);


        final String s = Optional.ofNullable(fuck1(str)).orElse(fuck2(arr));

        System.out.println("s = " + s);


    }

    public static String fuck1(String arr) {
        System.out.println("顺序1");
        return arr;
    }

    public static String fuck2(String arr) {
        System.out.println("顺序2");
        return arr.split(";")[1];
    }

}
