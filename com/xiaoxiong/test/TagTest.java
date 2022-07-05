package com.xiaoxiong.test;

import com.alibaba.fastjson.JSON;
import org.apache.commons.lang3.StringUtils;

import java.util.List;
import java.util.Optional;

/**
 * @author XiaoXiong
 * @date 2021/12/7 14:11
 */
public class TagTest {
    public static void main(String[] args) {

        String str = "[{\"code\":\"tag_data_global\",\"name\":\"全局参数\",\"tagList\":[{\"code\":\"入参\",\"id\":0,\"name\":\"入参\",\"tagList\":[{\"code\":\"tag_global_ordersn\",\"id\":127,\"name\":\"订单号\",\"tagPropValueType\":\"s_value\"}]}]},{\"code\":\"tag_data_multi_wo_tag\",\"name\":\"工单标签(多选)\",\"tagList\":[{\"code\":\"tag_data_multi_wo_tag_1\",\"id\":1,\"name\":\"创建工单\",\"tagPropValueType\":\"enum_many\"},{\"code\":\"tag_data_multi_wo_tag_2\",\"id\":2,\"name\":\"二线跟单\",\"tagPropValueType\":\"enum_many\"},{\"code\":\"tag_data_multi_wo_tag_3\",\"id\":3,\"name\":\"第三方回复\",\"tagPropValueType\":\"enum_many\"},{\"code\":\"tag_data_multi_wo_tag_4\",\"id\":4,\"name\":\"自助建单\",\"tagPropValueType\":\"enum_many\"}]},{\"code\":\"tag_data_om_rule_tag\",\"name\":\"规则组合标签\",\"tagList\":[{\"code\":\"工单\",\"id\":0,\"name\":\"工单\",\"tagList\":[{\"code\":\"tag_om_rule_tag_92\",\"id\":38,\"name\":\"备注问题描述否决条件\",\"tagPropValueType\":\"b_value\"}]}]},{\"code\":\"tag_data_order\",\"name\":\"订单标签\",\"tagList\":[{\"code\":\"物流信息\",\"id\":0,\"name\":\"物流信息\",\"tagList\":[{\"code\":\"tag_orderReceiveAddrProvinceName\",\"id\":11,\"name\":\"订单收货地址[省份名称]\",\"tagPropValueType\":\"enum_many\"},{\"code\":\"tag_logisticsTrackTimeOverDay\",\"id\":13,\"name\":\"当前时间减[最新订单物流轨迹时间]超期天数\",\"tagPropValueType\":\"n_value\"},{\"code\":\"tag_logisticsTrackTimeIsPresent\",\"id\":12,\"name\":\"[最新订单物流轨迹时间]是否存在\",\"tagPropValueType\":\"b_value\"}]},{\"code\":\"退货\",\"id\":0,\"name\":\"退货\",\"tagList\":[{\"code\":\"tag_selectGoods_allReturnNum\",\"id\":29,\"name\":\"[问题商品]退货申请单数量\",\"tagPropValueType\":\"n_value\"},{\"code\":\"tag_selectGoods_return_receivedTimeOverHour\",\"id\":32,\"name\":\"当前时间减[问题商品]退货单仓库收包时间超期小时数\",\"tagPropValueType\":\"n_value\"},{\"code\":\"tag_selectGoods_return_receivedTimeIsPresent\",\"id\":31,\"name\":\"[问题商品]退货单仓库是否收包\",\"tagPropValueType\":\"b_value\"},{\"code\":\"tag_way2ReturnPickupTimeOverHour\",\"id\":20,\"name\":\"当前时间减[上门揽退取件逾期时间]超期小时数\",\"tagPropValueType\":\"n_value\"},{\"code\":\"tag_way2ReturnPickupTimeIsPresent\",\"id\":19,\"name\":\"[上门揽退取件逾期时间]是否存在\",\"tagPropValueType\":\"b_value\"},{\"code\":\"tag_selectGoods_lastReturnRefundStatus\",\"id\":39,\"name\":\"[问题商品]退货申请单退款状态\",\"tagPropValueType\":\"enum_many\"},{\"code\":\"tag_selectGoods_lastReturnWay\",\"id\":30,\"name\":\"[问题商品]退货申请单退货方式\",\"tagPropValueType\":\"enum_many\"}]},{\"code\":\"换货\",\"id\":0,\"name\":\"换货\",\"tagList\":[{\"code\":\"tag_selectGoodsExchIsWay0Way5\",\"id\":33,\"name\":\"问题商品换货单为[自行寄回]或[先取后换]\",\"tagPropValueType\":\"b_value\"},{\"code\":\"tag_selectGoodsExchWay0Way5HasFlag1\",\"id\":34,\"name\":\"问题商品换货单为[自行寄回]或[先取后换]，存在商品拆包为[已申请已匹配]\",\"tagPropValueType\":\"b_value\"}]},{\"code\":\"基本信息\",\"id\":0,\"name\":\"基本信息\",\"tagList\":[{\"code\":\"tag_storeSourceIsMpOrder\",\"id\":41,\"name\":\"是否MP订单\",\"tagPropValueType\":\"b_value\"},{\"code\":\"tag_actDeliveryTimeIsPresent\",\"id\":9,\"name\":\"[实际发货时间]是否存在\",\"tagPropValueType\":\"b_value\"},{\"code\":\"tag_orderTimeOverHour\",\"id\":23,\"name\":\"当前时间减去[订单下单时间]超期小时数\",\"tagPropValueType\":\"n_value\"},{\"code\":\"tag_deliveryPromisedTimeOverHour\",\"id\":27,\"name\":\"当前时间减去[承诺订单预计送达时间]超期小时数\",\"tagPropValueType\":\"n_value\"},{\"code\":\"tag_orderTimeOverDay\",\"id\":8,\"name\":\"当前时间减去[订单下单时间]超期天数\",\"tagPropValueType\":\"n_value\"},{\"code\":\"tag_orderSourceType\",\"id\":21,\"name\":\"订单来源\",\"tagPropValueType\":\"enum_one\"},{\"code\":\"tag_expectDeliveryTimeIsPresent\",\"id\":24,\"name\":\"[预计发货时间]是否存在\",\"tagPropValueType\":\"b_value\"},{\"code\":\"tag_deliveryPromisedTimeIsPresent\",\"id\":26,\"name\":\"[承诺订单预计送达时间]是否存在\",\"tagPropValueType\":\"b_value\"},{\"code\":\"tag_specialType\",\"id\":6,\"name\":\"订单销售模式\",\"tagPropValueType\":\"enum_many\"},{\"code\":\"tag_actDeliveryTimeOverDay\",\"id\":10,\"name\":\"当前时间减[实际发货时间]超期天数\",\"tagPropValueType\":\"n_value\"},{\"code\":\"tag_orderPayTypeCscBuzType\",\"id\":14,\"name\":\"订单支付方式[客服业务]分类\",\"tagPropValueType\":\"enum_many\"},{\"code\":\"tag_orderCategory\",\"id\":1,\"name\":\"订单类型\",\"tagPropValueType\":\"enum_one\"},{\"code\":\"tag_orderStatus\",\"id\":7,\"name\":\"订单状态\",\"tagPropValueType\":\"enum_many\"},{\"code\":\"tag_expectDeliveryTimeOverHour\",\"id\":25,\"name\":\"当前时间减[预计发货时间]超期小时数\",\"tagPropValueType\":\"n_value\"},{\"code\":\"tag_orderPayType\",\"id\":35,\"name\":\"订单支付方式\",\"tagPropValueType\":\"enum_many\"},{\"code\":\"tag_way1ExchNewOrder\",\"id\":22,\"name\":\"是否上门揽换新订单\",\"tagPropValueType\":\"b_value\"}]},{\"code\":\"订单售后\",\"id\":0,\"name\":\"订单售后\",\"tagList\":[{\"code\":\"tag_allReturnNum\",\"id\":15,\"name\":\"[所有退货]申请单数量 \",\"tagPropValueType\":\"n_value\"},{\"code\":\"tag_lastRejectRefundStatus\",\"id\":18,\"name\":\"[最新拒收]申请单退款状态\",\"tagPropValueType\":\"enum_many\"},{\"code\":\"tag_allRejectNum\",\"id\":17,\"name\":\"[所有拒收]申请单数量\",\"tagPropValueType\":\"n_value\"},{\"code\":\"tag_lastReturnRefundStatus\",\"id\":16,\"name\":\"[最新退货]申请单退款状态\",\"tagPropValueType\":\"enum_many\"}]}]},{\"code\":\"tag_data_user_tag\",\"name\":\"用户标签\",\"tagList\":[{\"code\":\"会员受限标签\",\"id\":0,\"name\":\"会员受限标签\",\"tagList\":[{\"code\":\"user_hdl_refuse_create_order\",\"id\":9,\"name\":\"限制下单\",\"tagPropValueType\":\"enum\"},{\"code\":\"CSC_CUST_LIMIT_ALL\",\"id\":30,\"name\":\"客服运营可视化-受限标签\",\"tagPropValueType\":\"b_value\"}]},{\"code\":\"USP-RT接口\",\"id\":0,\"name\":\"USP-RT接口\",\"tagList\":[{\"code\":\"fr344\",\"id\":36,\"name\":\"超级VIP\",\"tagPropValueType\":\"b_value\"},{\"code\":\"ug002538188\",\"id\":44,\"name\":\"高价值用户\",\"tagPropValueType\":\"b_value\"}]},{\"code\":\"规则标签(自定义)\",\"id\":0,\"name\":\"规则标签(自定义)\",\"tagList\":[{\"code\":\"rule_17\",\"id\":35,\"name\":\"限制开通SVIP或清退svip\",\"tagPropValueType\":\"b_value\"},{\"code\":\"rule_21\",\"id\":37,\"name\":\"短信邀请评价排除用户标签\",\"tagPropValueType\":\"b_value\"},{\"code\":\"rule_22\",\"id\":42,\"name\":\"禁止补偿/原路退/特殊退款（仅规则中使用）\",\"tagPropValueType\":\"b_value\"},{\"code\":\"rule_23\",\"id\":43,\"name\":\"短信评价呼入排除人员标签\",\"tagPropValueType\":\"b_value\"},{\"code\":\"rule_34\",\"id\":131,\"name\":\"优享用户\",\"tagPropValueType\":\"b_value\"},{\"code\":\"rule_41\",\"id\":138,\"name\":\"资损黑名单(客服受限组合)\",\"tagPropValueType\":\"b_value\"}]}]},{\"code\":\"tag_data_wotag_prop\",\"name\":\"工单标签选项\",\"tagList\":[{\"code\":\"创建工单\",\"id\":0,\"name\":\"创建工单\",\"tagList\":[{\"code\":\"1_256\",\"id\":256,\"name\":\"催配送+补偿\",\"tagList\":[{\"code\":\"tag_wo_wotag_prop_1_256_103\",\"id\":103,\"name\":\"金额\",\"tagPropValueType\":\"n_value\"},{\"code\":\"tag_wo_wotag_prop_1_256_243\",\"id\":243,\"name\":\"补偿方式\",\"tagPropValueType\":\"enum_one\"}]}]},{\"code\":\"第三方回复\",\"id\":0,\"name\":\"第三方回复\",\"tagList\":[{\"code\":\"3_271\",\"id\":271,\"name\":\"已签收\",\"tagList\":[{\"code\":\"tag_wo_wotag_prop_3_271_113\",\"id\":113,\"name\":\"签收地址\",\"tagPropValueType\":\"s_value\"},{\"code\":\"tag_wo_wotag_prop_3_271_112\",\"id\":112,\"name\":\"签收人\",\"tagPropValueType\":\"s_value\"},{\"code\":\"tag_wo_wotag_prop_3_271_277\",\"id\":277,\"name\":\"签收时间\",\"tagPropValueType\":\"date\"}]},{\"code\":\"3_299\",\"id\":299,\"name\":\"已催促2\",\"tagList\":[{\"code\":\"tag_wo_wotag_prop_3_299_276\",\"id\":276,\"name\":\"预计送达时间\",\"tagPropValueType\":\"date\"},{\"code\":\"tag_wo_wotag_prop_3_299_140\",\"id\":140,\"name\":\"此单目前位置\",\"tagPropValueType\":\"s_value\"}]},{\"code\":\"3_301\",\"id\":301,\"name\":\"超区已转单\",\"tagList\":[{\"code\":\"tag_wo_wotag_prop_3_301_142\",\"id\":142,\"name\":\"转寄快递及单号\",\"tagPropValueType\":\"s_value\"},{\"code\":\"tag_wo_wotag_prop_3_301_278\",\"id\":278,\"name\":\"预计送达时间\",\"tagPropValueType\":\"date\"}]},{\"code\":\"3_305\",\"id\":305,\"name\":\"无法配送\",\"tagList\":[{\"code\":\"tag_wo_wotag_prop_3_305_150\",\"id\":150,\"name\":\"原因\",\"tagPropValueType\":\"s_value\"},{\"code\":\"tag_wo_wotag_prop_3_305_151\",\"id\":151,\"name\":\"方案\",\"tagPropValueType\":\"s_value\"}]},{\"code\":\"3_278\",\"id\":278,\"name\":\"已丢件已补寄\",\"tagList\":[{\"code\":\"tag_wo_wotag_prop_3_278_121\",\"id\":121,\"name\":\"补寄快递及单号\",\"tagPropValueType\":\"s_value\"}]},{\"code\":\"3_303\",\"id\":303,\"name\":\"疑似丢件\",\"tagList\":[{\"code\":\"tag_wo_wotag_prop_3_303_146\",\"id\":146,\"name\":\"此件路由暂无更新，目前位置\",\"tagPropValueType\":\"s_value\"}]},{\"code\":\"3_115\",\"id\":115,\"name\":\"未寄出\",\"tagList\":[{\"code\":\"tag_wo_wotag_prop_3_115_267\",\"id\":267,\"name\":\"预计寄出时间\",\"tagPropValueType\":\"date\"}]},{\"code\":\"3_304\",\"id\":304,\"name\":\"此件为双面单\",\"tagList\":[{\"code\":\"tag_wo_wotag_prop_3_304_281\",\"id\":281,\"name\":\"预计送达时间\",\"tagPropValueType\":\"date\"},{\"code\":\"tag_wo_wotag_prop_3_304_148\",\"id\":148,\"name\":\"包裹位置\",\"tagPropValueType\":\"s_value\"},{\"code\":\"tag_wo_wotag_prop_3_304_147\",\"id\":147,\"name\":\"正确单号为\",\"tagPropValueType\":\"s_value\"}]},{\"code\":\"3_302\",\"id\":302,\"name\":\"超区未转单\",\"tagList\":[{\"code\":\"tag_wo_wotag_prop_3_302_279\",\"id\":279,\"name\":\"预计转单时间\",\"tagPropValueType\":\"date\"},{\"code\":\"tag_wo_wotag_prop_3_302_280\",\"id\":280,\"name\":\"预计送达时间\",\"tagPropValueType\":\"date\"}]},{\"code\":\"3_114\",\"id\":114,\"name\":\"已寄出\",\"tagList\":[{\"code\":\"tag_wo_wotag_prop_3_114_312\",\"id\":312,\"name\":\"寄出时间\",\"tagPropValueType\":\"date\"},{\"code\":\"tag_wo_wotag_prop_3_114_17\",\"id\":17,\"name\":\"寄出快递及单号\",\"tagPropValueType\":\"s_value\"}]}]},{\"code\":\"自助建单\",\"id\":0,\"name\":\"自助建单\",\"tagList\":[{\"code\":\"4_256\",\"id\":256,\"name\":\"催配送+补偿\",\"tagList\":[{\"code\":\"tag_wo_wotag_prop_4_256_103\",\"id\":103,\"name\":\"金额\",\"tagPropValueType\":\"n_value\"},{\"code\":\"tag_wo_wotag_prop_4_256_243\",\"id\":243,\"name\":\"补偿方式\",\"tagPropValueType\":\"enum_one\"}]}]}]},{\"code\":\"tag_data_wo_prop\",\"name\":\"工单属性\",\"tagList\":[{\"code\":\"母单\",\"id\":0,\"name\":\"母单\",\"tagList\":[{\"code\":\"tag_wo_prop_wsstcm_comm\",\"id\":4,\"name\":\"母单普通备注\",\"tagPropValueType\":\"s_value\"},{\"code\":\"tag_wo_prop_wdfscm_parent\",\"id\":28,\"name\":\"回复内容\",\"tagPropValueType\":\"s_value\"},{\"code\":\"tag_wo_prop_wsstcm_call\",\"id\":3,\"name\":\"母单来电备注\",\"tagPropValueType\":\"s_value\"},{\"code\":\"tag_wo_prop_callback_way\",\"id\":46,\"name\":\"母单回复方式\",\"tagPropValueType\":\"enum_many\"},{\"code\":\"tag_wo_prop_wsstcm\",\"id\":5,\"name\":\"母单全部备注\",\"tagPropValueType\":\"s_value\"}]},{\"code\":\"工单\",\"id\":0,\"name\":\"工单\",\"tagList\":[{\"code\":\"tag_wo_prop_current_wo_scene_type\",\"id\":43,\"name\":\"工单创建场景类型\",\"tagPropValueType\":\"enum_one\"},{\"code\":\"tag_wo_prop_current_wo_problem_desc\",\"id\":37,\"name\":\"问题描述\",\"tagPropValueType\":\"s_value\"}]},{\"code\":\"子单\",\"id\":0,\"name\":\"子单\",\"tagList\":[{\"code\":\"tag_wo_prop_wdfscm\",\"id\":2,\"name\":\"回复内容\",\"tagPropValueType\":\"s_value\"}]}]}]";


        List<TagOpData> list = JSON.parseArray(str, TagOpData.class);


        System.out.println("list.size() = " + list.size());

        final Optional<TagOpData> first = list.stream().filter(e -> e.getCode().equals("tag_data_order")).findFirst();
        if (first.isPresent()) {


            final TagOpData tagOpData = first.get();

            TagOpTagInfo tagOpTagInfo = new TagOpTagInfo();
            tagOpTagInfo.setCode(tagOpTagInfo.getCode());
            tagOpTagInfo.setTagList(tagOpData.getTagList());

            TagOpTagInfo target = new TagOpTagInfo();
            getTagInfo(tagOpTagInfo, "tag_orderStatus", target);


            System.out.println(" = " + JSON.toJSONString(target));
        }

    }


    private static void getTagInfo(TagOpTagInfo tagOpTagInfo, String paramCode, TagOpTagInfo target) {


        if (StringUtils.isNotBlank(target.getCode())) {
            return;
        }

        for (TagOpTagInfo opTagInfo : tagOpTagInfo.getTagList()) {

            if (opTagInfo.getTagList() != null) {
                getTagInfo(opTagInfo, paramCode, target);
            } else {

                if (opTagInfo.getCode().equals(paramCode)) {
                    target.setCode(opTagInfo.getCode());
                    target.setId(opTagInfo.getId());
                    target.setName(opTagInfo.getName());
                    return;
                }

            }

        }

    }

}
