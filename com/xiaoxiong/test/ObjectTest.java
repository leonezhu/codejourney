package com.xiaoxiong.test;

import lombok.Data;
import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author XiaoXiong
 * @date 2022/3/4 18:14
 */
public class ObjectTest {


    public static void main(String[] args) throws Exception {

//        List<Man> manList = new ArrayList<>();
//
//
//        Man m1 = new Man();
//        m1.setAge(1);
//        m1.setName("xiao");
//
//
//        System.out.println("m1 = " + m1);
//
//
//        WoMan woMan = new WoMan();
//        BeanUtils.copyProperties(m1, woMan);
//
//
//        System.out.println("woMan = " + woMan);


//        manList.add(m1);


//        Man m2 = new Man();
//        m2.setAge(2);
//        m2.setName("名");
//        manList.add(m2);
//
//        manList.stream().forEach(System.out::println);
//
//
//        System.out.println("----------------");
//
//        final Man man = manList.get(0);
//        man.setName("hahah");
//
//
//        manList.stream().forEach(System.out::println);

    }


    @Data
    static
    class Man {

        private Integer age;
        private String name;

    }

    @Data
    static
    class WoMan {

        private int age;
        private String name;

    }




}
