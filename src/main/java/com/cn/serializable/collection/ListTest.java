package com.cn.serializable.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List<String> userNames = new ArrayList<String>() {{
            add("Hollis");
            add("hollis");
            add("HollisChuang");
            add("H");
        }};
        forEach(userNames);
        forEach(userNames);
            // iterator(userNames);
    }

    private static void forEach(List<String> userNames) {
        for (String userName : userNames) {
            if (userName.equals("hollis")) {
                userNames.remove(userName);
            }
            System.out.println(userName);
        }
        System.out.println(userNames);
    }

    private static void iterator(List<String> userNames) {
        Iterator<String> iterator = userNames.iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            if (name.equals("hollis")) {
                iterator.remove();
            }
            System.out.println(name);
        }
        System.out.println(userNames);
    }
}


