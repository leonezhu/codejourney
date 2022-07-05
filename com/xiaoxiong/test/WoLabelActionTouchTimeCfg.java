package com.xiaoxiong.test;

import lombok.Data;

/**
 * 工单场景自动操作触发时间配置
 *
 * @author XiaoXiong
 * @date 2021/9/27 11:02
 */
@Data
public class WoLabelActionTouchTimeCfg {

    /**
     * 触发时间段：开始时间 时：分
     */
    private String beginTime;
    /**
     * 触发时间段：结束时间 时：分
     */
    private String endTime;
    /**
     * 触发时间类型 0延迟多少小时，1当日某时分触发，2隔日某时分触发
     */
    private Integer touchTimeType;

    /**
     * 间隔时间，当touchTimeType=0时有值
     */
    private Float interValTime;
    /**
     * 触发具体时间：当touchTimeType=1/2时有值
     */
    private String detailTime;

    /**
     * 状态：0不生效，1生效
     */
    private Integer status;

}
