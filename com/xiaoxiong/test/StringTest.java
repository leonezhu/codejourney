package com.xiaoxiong.test;

import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author XiaoXiong
 * @date 2021/9/26 10:55
 */
public class StringTest {
    public static Pattern p = Pattern.compile("[\u4e00-\u9fa5]");


    public static boolean isContainChinese(String str) {
        Matcher m = p.matcher(str);
        return m.find();
    }

    public static void main(String[] args) {

        System.out.println(1<<1);
        System.out.println(1>>1);

//        String url = "http://csm.vip.vip.com/report/ruleScenes/index.do?sceneCode=%s&id=%s";
//
//
//        String xxxx = String.format(url, "xxxx", 1243);
//
//
//        System.out.println("xxxx = " + xxxx);


//        Optional<String> userName = Optional.empty();
//        String defaultEmail = userName
//                .map(e -> e + "@xjjdog.cn")
//                .orElse("");
//
//        System.out.println("defaultEmail = " + defaultEmail);

//        String str = null;
//
//        System.out.println("str = " + "1".equals(str));


//
//        String str = "hahah,%s是大%s";
//
//
//        String result = String.format(str, "小熊", "帅哥");
//
//        System.out.println("result = " + result);


//        String str = null;
//
//
//        boolean b = "sdfgs".equals(str);
//
//        System.out.println("b = " + b);

//        String str1 = "你好111";
//        System.out.println("isContainChinese(str1) = " + isContainChinese(str1));
//        String str2 = "你好ab111";
//        System.out.println("isContainChinese(str2) = " + isContainChinese(str2));
//        String str3 = "abc2345";
//        System.out.println("isContainChinese(str3) = " + isContainChinese(str3));


//        String str = "tag_capital_loss_prop_100_11";
//
//
//        System.out.println("str = " + str.indexOf("tag_capital_loss_prop"));

//        String str = "tag_capital_loss_defective_reason";
//
//
//        str = str.replace("tag_capital_loss_","");
//
//
//        System.out.println("str = " + str);
//
//
//        final String to = CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, str);
//
//
//        System.out.println("to = " + to);
//

//        String str = " jsdfj skdjfkj ";
//
//        System.out.println(str.trim());


//        String str = "[";
//
//
//        final int i = str.lastIndexOf(",");
//
//        if (i > 0) {
//            str = str.substring(0, i);
//        }
//
//
//
//        System.out.println("substring = " + str);


//        String str = UUID.randomUUID().toString();
//
//        System.out.println("str.length() = " + str.length());
//        System.out.println("str = " + str.replaceAll("-", ""));


//        String typeId = "20201107010423685128800290000017";
//        String typeId = "1";
//        System.out.println("typeId.substring(2) = " + typeId.substring(typeId.length() - 2));


//        String str = "auditFailReason";
//        String str = "是打卡练腹肌打算离开房间数量的开发建设是";

//        str = str.substring(0, 1).toUpperCase() + str.substring(1);
//
//        System.out.println("str = " + str);


//        final String substring = str.substring(0, 5);
//        System.out.println("substring = " + substring);


//        String str = "{\"background-color\":\"#ff2626\";\"color\":\"#ffffff\"}";
//
//        str = str.replaceAll("\"", "")
//                .replaceAll("\\{", "")
//                .replaceAll("\\}", "")
//                .replaceAll(",", ";");
//
//
//        System.out.println("str = " + str);


//        String str = "此款商品由于（）原因，无法提供维修。现供应商可补偿（）元维修费用，请会员线下自行维修，造成的不变敬请谅解";
//
//        if (str.lastIndexOf("。") != (str.length() - 1)) {
//
//            System.out.println(str.length());
//        }else {
//
//            System.out.println("hahah");
//        }


//        String a = "张三";
//
//        String b = a;
//
//        a = "李四";
//
//        System.out.println("a = " + a);
//        System.out.println("b = " + b);
//        System.out.println("b.equals(a) = " + b.equals(a));

    }
}
