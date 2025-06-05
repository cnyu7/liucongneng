package com.cn.serializable.apache.commons;

import org.apache.commons.collections4.CollectionUtils;

import java.util.LinkedList;
import java.util.List;
public class CollectionUtilsTester {
    public static void main(String[] args) {
        List<String> list = new LinkedList<String>();
        CollectionUtils.addIgnoreNull(list, null);
        CollectionUtils.addIgnoreNull(list, "a");
        System.out.println(list);
        if(list.contains(null)) {
            System.out.println("Null value is present");
        } else {
            System.out.println("Null value is not present");
        }
    }
}
