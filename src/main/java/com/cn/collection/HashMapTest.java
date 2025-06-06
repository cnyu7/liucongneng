package com.cn.collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>(17);
        map.put("1", "1");
        System.out.println(map.size());
    }
}
