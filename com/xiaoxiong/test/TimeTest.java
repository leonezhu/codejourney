package com.xiaoxiong.test;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * @author XiaoXiong
 * @date 2021/9/1 14:34
 */
public class TimeTest {

    public static final String DEFAULT_PATTERN = "HH:mm";

    public static void main(String[] args) {


        test();


    }

    public static void test() {


//        String targetTimeStr = "08:00";
//        String targetTimeStr = "08:01";
        String targetTimeStr = "08:30";
//        String targetTimeStr = "08:29";

        String time1 = "08:00";
        String time2 = "08:30";

        LocalTime targetTime = LocalTime.parse(targetTimeStr, DateTimeFormatter.ofPattern(DEFAULT_PATTERN));

        LocalTime begin = LocalTime.parse(time1, DateTimeFormatter.ofPattern(DEFAULT_PATTERN));
        LocalTime end = LocalTime.parse(time2, DateTimeFormatter.ofPattern(DEFAULT_PATTERN));


        boolean b = (targetTime.isAfter(begin) || targetTime.equals(begin)) && (targetTime.isBefore(end) || targetTime.equals(end));
        System.out.println("b = " + b);
    }
}
