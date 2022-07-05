package com.xiaoxiong.test;

/**
 * @author XiaoXiong
 * @date 2022/3/3 9:47
 */
public class BoolTest {


    public static void main(String[] args) {


        Boolean a = true;

        String str = "1";

        int i = a != null  && "1".equals(str) ? 1 : 0;

        System.out.println("i = " + i);

    }




}
