package com.cn.exception;

/**
 * 栈内存的覆盖
 */
public class ReturnTest {
    public static void main(String[] args) {
        System.out.println(f3());
        System.out.println("------------");
        System.out.println(f2()[0]);
    }
    // 测试 修改值类型
    static int f() {
        int ret = 0;
        try {
            return ret;  // 返回 0，finally内的修改效果不起作用
        } finally {
            ret++;
            System.out.println("finally执行");
        }
    }

    // 测试 修改引用类型
    static int[] f2(){
        int[] ret = new int[]{0};
        try {
            return ret;  // 返回 [1]，finally内的修改效果起了作用
        } finally {
            ret[0] = 3;
            System.out.println("finally执行");
        }
    }

    static int f3() {
        int ret = 0;
        try {
            return ret;  // 返回
        } finally {
            ret = 5;
            System.out.println("finally执行");
            return ret;
        }
    }

    static int[] f4(){
        int[] ret = new int[]{0};
        try {
            return ret;  // 返回 [1]，finally内的修改效果起了作用
        } finally {
            ret[0] = 3;
            System.out.println("finally执行");
        }
    }
}
