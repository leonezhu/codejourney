package com.xiaoxiong.test;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author XiaoXiong
 * @date 2021/9/17 10:18
 */
public class PrintWriterTest {


    public static void main(String[] args) throws IOException {

        File csvOutFile = new File("testFileName.csv");

        List<String[]> dataLines = new ArrayList<>();
        dataLines.add(new String[]
                {"John", "熊", "38", "Comment Data\nAnother十分士大夫 data"});
        dataLines.add(new String[]
                {"Jane", "Doe, Jr.", "19", "She said \"I'm being quoted\""});

        try (PrintWriter pw = new PrintWriter(csvOutFile,"GBK")) {


            final List<String> headList = getHeadList();
            final String[] strings = headList.toArray(new String[]{});


            final String s = convertToCSV(strings);

            pw.println(s);

            dataLines.stream().map(e -> convertToCSV(e)).forEach(pw::println);


        }


        System.out.println("csvOutFile = " + csvOutFile.getName());
        System.out.println("csvOutFile = " + csvOutFile.getAbsolutePath());

    }

    public static List<String> getHeadList() {

        return Stream.of("Name", "FullName", "年龄", "宣言").collect(Collectors.toList());
    }

    public static String convertToCSV(String[] data) {
        return Stream.of(data)
                .map(e -> escapeSpecialCharacters(e))
                .collect(Collectors.joining(","));
    }

    public static String escapeSpecialCharacters(String data) {
        String escapedData = data.replaceAll("\\R", " ");
        if (data.contains(",") || data.contains("\"") || data.contains("'")) {
            data = data.replace("\"", "\"\"");
            escapedData = "\"" + data + "\"";
        }
        return escapedData;
    }
}
