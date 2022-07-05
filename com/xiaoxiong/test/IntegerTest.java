package com.xiaoxiong.test;

import org.apache.commons.lang3.math.NumberUtils;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * @author XiaoXiong
 * @date 2021/9/15 16:54
 */
public class IntegerTest {


    public static void main(String[] args) {

        String str = "-1.11";

        final double v = NumberUtils.toDouble(str);
        final double ceil = Math.ceil(v);

        System.out.println("ceil = " + ceil);

//
//        System.out.println("v = " + v);
//
//        final long l = NumberUtils.toLong(str);
//
//        System.out.println("l = " + l);


//        Integer a = 3;
//
//
//        System.out.println( a == 3  );

//        Long l = null;
//
//
//        boolean b = 3 > l;
//
//        System.out.println("b = " + b);

//        Integer a = Integer.parseInt("0.1");
//        Integer b = 1 / 4 * 3;
//
//
//        System.out.println("b = " + b);


//        long total = 202, queryTotal = 200;
//        long total = 401, queryTotal = 200;
//
//        System.out.println("total % queryTotal = " + total % queryTotal);
//        System.out.println("total / queryTotal = " + total / queryTotal);
//
//        long circulationNum = total % queryTotal == 0 ? total / queryTotal
//                : total / queryTotal + 1;
//
//
//        System.out.println("circulationNum = " + circulationNum);


//        Set<Integer> set = new HashSet<>();
//
//        set.add(1);
//        set.add(2);
//
//        Long l = 2L;
//
//        final boolean contains = set.contains(l.intValue());
//
//        System.out.println("contains = " + contains);

//        Random random = new Random();
//        for (int i = 0; i < 1000 ; i++) {
//            int rInt = random.nextInt(60);
//            String str = "";
//            if (rInt < 10) {
//                str = "0" + rInt;
//            }else {
//                str = "" + rInt;
//            }
//
//            System.out.println("str = " + str);
//        }





    }
}
