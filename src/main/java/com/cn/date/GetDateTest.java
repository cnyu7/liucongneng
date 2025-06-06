package com.cn.date;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.TimeZone;

public class GetDateTest {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now(ZoneId.of("America/Los_Angeles"));
        System.out.println(now);

        System.out.println("--------------");
        System.out.println(Calendar.getInstance(TimeZone.getTimeZone("America/Los_Angeles")).getTime());

    }
}
