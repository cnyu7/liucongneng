package com.cn.enums;

public class SexTest {
    public static void main(String[] args) {
       Sex sex = Sex.Male;
        System.out.println(sex.name());
        switch (sex){
            case Male:
                System.out.println("nan");
                break;
                case Female:
                    System.out.println("nv");
        }
    }
}
