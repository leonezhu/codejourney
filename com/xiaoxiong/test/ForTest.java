package com.xiaoxiong.test;

/**
 * @author XiaoXiong
 * @date 2022/3/31 11:47
 */
public class ForTest {
    public static void main(String[] args) {


        for (int i = 0; i < 10; i++) {


            System.out.println("out before i=" + i);

            for (int j = 0; j < 10; j++) {


                if (j == 4) {
                    continue;
                }

                if (j == 6) {
                    break;
                }

                System.out.println("inner  j=" + j);

            }

            System.out.println("out after i=" + i);
        }


    }
}
