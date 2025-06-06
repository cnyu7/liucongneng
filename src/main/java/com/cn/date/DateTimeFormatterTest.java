package com.cn.date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterTest {

    private static DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    public static void main(String[] args) {
        // 2 开启多个线程，并且欧东
        for (int i = 0; i < 10; i++) {

            Thread thread = new Thread(() -> {
                // 3 使用单例日期解析文本
                System.out.println(LocalDateTime.parse("2021-11-19 15:15:00",df));
            });
            thread.start();
        }

    }
}
