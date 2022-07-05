package com.xiaoxiong.test;

import lombok.Data;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/**
 * @author XiaoXiong
 * @date 2021/11/1 14:59
 */
public class CollectionTest {


    public static void main(String[] args) {
        List<TestObj> list = new ArrayList<>();

        TestObj ob1 = new TestObj();
        ob1.setIntVal(0);
        ob1.setStr1("A880101");

        list.add(ob1);


        TestObj ob2 = new TestObj();
        ob2.setIntVal(-1);
        ob2.setStr1("A880805");

        list.add(ob2);

        TestObj ob3 = new TestObj();
        ob3.setIntVal(-2);
        ob3.setStr1("A860102");

        list.add(ob3);


        TestObj ob4 = new TestObj();
        ob4.setIntVal(2);
        ob4.setStr1("A860102");

        list.add(ob4);





//        final TestObj testObj = list.stream().filter(e -> e.getIntVal() == 2).findFirst().orElse(null);
//
//        System.out.println("testObj = " + testObj);


//        list.stream().forEach(System.out::println);
//
//
//        System.out.println(" =---------------------------");
//
//
//        list.sort(Comparator.comparing(e -> e.getIntVal(), (item1, item2) -> {
//            if (item1 > item2) {
//                return -1;
//            } else {
//                return 1;
//            }
//        }));
//
//
////                .thenComparing(TestObj::getStr1));
//
//        list.stream().forEach(System.out::println);


//        list.stream().map(obj -> obj.str1 + obj.str2).collect(Collectors.toList());
    }


    @Data
    public static class TestObj {

        private Integer intVal;
        private String str1;
//        private String str2;
    }
}

