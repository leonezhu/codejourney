package com.xiaoxiong.test;

import lombok.Data;

import java.util.List;

@Data
public class TagOpTagInfo {

    /**
     * <p>标签表主键ID
     */
    private long id;

    /**
     * <p>标签编码
     */
    private String code;

    /**
     * <p>标签名称
     */
    private String name;

    /**
     * <p>标签属性取值类型：enum枚举,b_value:boolean类型值,s_value字符类型值,n_value:数字类型的值，只有enum有具体的取值列表
     */
    private String tagPropValueType;

    private List<TagOpTagInfo> tagList;//标签,如果存在
}