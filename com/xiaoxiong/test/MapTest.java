package com.xiaoxiong.test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author XiaoXiong
 * @date 2021/10/28 10:53
 */
public class MapTest {


    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

        map.put(1, "哈哈");
        map.put(1, "嘻嘻");


        System.out.println("map = " + map);


    }
}
