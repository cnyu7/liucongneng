package com.cn.date;


import java.text.ParseException;
import java.text.SimpleDateFormat;

public class SimpleDateFormatTest {

    // 1 创建单例实例
    private static SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");

    public static void main(String[] args) {
        // 2 开启多个线程，并且欧东
        for (int i = 0; i < 10; i++) {

            Thread thread = new Thread(() -> {
                try {
                    // 3 使用单例日期解析文本
                    System.out.println(sdf.parse("2021-11-19 15:15:00"));
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            });
            thread.start();
        }

    }
}

