package com.xiaoxiong.arrays;

import java.util.*;

/**
 * @author XiaoXiong
 * @date 2021/7/12 10:07
 */
public class HashSetDemo {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
//
        List<String> copy = new ArrayList<>(list);


        List<String> list2 = new ArrayList<>();
        list2.add("1");
        list2.add("2");
//
//        list.removeAll(list2);


        copy.removeAll(list2);
//
        list.stream().forEach(System.out::println);

        System.out.println("-------------");
        copy.stream().forEach(System.out::println);
//
//        String str = "20210812189681661404";
//        String str1 = "2632678518764867585";
//
////        Long.parseLong(str);
//        final long l = Long.parseLong(str1);
//        System.out.println("l = " + l);
    }
}
