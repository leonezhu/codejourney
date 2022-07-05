package com.xiaoxiong.test;

import lombok.Data;

import java.util.List;

@Data
public class TagOpData {

    private String code; //数据源编码

    private String name; //数据源名称

    private List<TagOpTagInfo> tagList;//标签,如果存在tagList属性，则当前节点不能选，需要选择下一层
}
