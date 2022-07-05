package com.xiaoxiong.test;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

/**
 * @author XiaoXiong
 * @date 2022/4/14 11:29
 */
public class DateTest {


    public static void main(String[] args) throws Exception {

//        test1();
//        test2();
        test3();

    }

    public static void test3() throws Exception {

        String pattern = "yyyy-MM-dd";

        SimpleDateFormat format = new SimpleDateFormat(pattern);


        final LocalDate parse = LocalDate.parse("2022-04-14", DateTimeFormatter.ofPattern(pattern));


//        final Date from = Date.from(Instant.ofEpochSecond(parse));


//        System.out.println("from = " + from);


        final LocalDate now = LocalDate.now();


//        final Duration between = Duration.between(now.atStartOfDay(), parse.atStartOfDay());
        final Duration between = Duration.between(now, parse);

        System.out.println("format1 = " + between.toDays());

    }


    public static void test2() throws Exception {


        LocalDateTime now = LocalDateTime.now();
        LocalDateTime time2 = LocalDateTime.parse("2022-04-14 13:59:11", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

        LocalDate nowLocalData = LocalDate.now();
        LocalDate timeLocalDate = LocalDate.parse("2021-04-10", DateTimeFormatter.ofPattern("yyyy-MM-dd"));


        long daysDiff = ChronoUnit.DAYS.between(nowLocalData, timeLocalDate);

        long daysDiff2 = ChronoUnit.HOURS.between(now, time2);
        long daysDiff3 = ChronoUnit.MINUTES.between(now, time2);

        System.out.println("daysDiff = " + daysDiff);

        System.out.println("daysDiff2 = " + daysDiff2);
        System.out.println("daysDiff3 = " + daysDiff3/60.0);


        BigDecimal b1 = new BigDecimal(Double.toString(daysDiff3));
        BigDecimal b2 = new BigDecimal(Double.toString(60));
        final double v = b1.divide(b2, 1, BigDecimal.ROUND_HALF_UP).doubleValue(); //小数点后 scele位

        System.out.println("v = " + v);


    }

    public static void test1() throws Exception {


        SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
        Date date = formatter.parse("2020/5/15");

        Calendar c1 = Calendar.getInstance();
        Calendar c2 = Calendar.getInstance();
        c2.setTime(date);

        int year = c1.get(Calendar.YEAR);
        int oldYear = c2.get(Calendar.YEAR);

        //这里只是简单的对两个年份数字进行相减，而没有考虑月份的情况
        System.out.println("传入的日期与今年的年份差为：" + (year - oldYear));


    }

}
