package com.cn.genericity;

import java.util.HashMap;
import java.util.Map;

public class GenericityTest {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("name", "hollis");
        map.put("age", "22");
        System.out.println(map.get("name"));
        System.out.println(map.get("age"));
    }

}
