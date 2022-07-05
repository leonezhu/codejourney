package com.xiaoxiong.test;

import com.alibaba.fastjson.JSON;
import org.apache.commons.lang3.StringUtils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author XiaoXiong
 * @date 2021/10/12 12:15
 */
public class JosnTest {


    public static boolean touchTimeRangeMatch(WoLabelActionTouchTimeCfg cfg) {
        if (StringUtils.isBlank(cfg.getBeginTime()) || StringUtils.isBlank(cfg.getEndTime())) {
            return false;
        }

        SimpleDateFormat df = new SimpleDateFormat("HH:mm");

        try {


            Date now = df.parse(df.format(new Date()));
            Date beginTime = df.parse(cfg.getBeginTime());
            Date endTime = df.parse(cfg.getEndTime());


            //当日具体时间执行 且 延迟执行时间 在触发时间段内
            if (1 == cfg.getTouchTimeType()) {
                Date detailTime = df.parse(cfg.getDetailTime());
                if (detailTime.getTime() <= endTime.getTime()) {
                    return false;
                }
            }


            return now.getTime() >= beginTime.getTime() && now.getTime() <= endTime.getTime();

        } catch (Exception e) {
            System.out.println(e);
//            log.error(LogEvent.of("WoLabelSceneServiceImpl", "时间格式转化异常", e));
        }

        return false;


    }

    public static void main(String[] args) {
//        String str = "[{\"beginTime\":\"10:57\",\"endTime\":\"11:57\",\"interValTime\":1.0,\"status\":1,\"touchTimeType\":0},{\"beginTime\":\"11:58\",\"detailTime\":\"12:58\",\"endTime\":\"12:57\",\"interValTime\":1.0,\"status\":1,\"touchTimeType\":1}]";
//        final List<WoLabelActionTouchTimeCfg> touchTimeCfgs =
//                JSON.parseArray(str, WoLabelActionTouchTimeCfg.class);
//
//        for (WoLabelActionTouchTimeCfg touchTimeCfg : touchTimeCfgs) {
//            touchTimeRangeMatch(touchTimeCfg);
//        }


        Map<String, String> map = JSON.parseObject("{\"key1\":\"value1\",\"key2\":\"value2\"}", HashMap.class);


        System.out.println("map = " + map);




    }

}
