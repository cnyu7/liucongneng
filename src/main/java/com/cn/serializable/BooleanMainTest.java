package com.cn.serializable;

import com.alibaba.fastjson2.JSON;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

import java.io.IOException;
import java.io.Serializable;

public class BooleanMainTest {

    public static void main(String[] args) throws IOException {
        //定一个Model3类型
        Model3 model3 = new Model3();
        model3.setSuccess(true);

        //使用fastjson(1.2.16)序列化model3成字符串并输出
        System.out.println("Serializable Result With fastjson :" + JSON.toJSONString(model3));

        //使用Gson(2.8.5)序列化model3成字符串并输出
        Gson gson =new Gson();
        System.out.println("Serializable Result With Gson :" +gson.toJson(model3));

        //使用jackson(2.9.7)序列化model3成字符串并输出
        ObjectMapper om = new ObjectMapper();
        System.out.println("Serializable Result With jackson :" +om.writeValueAsString(model3));
    }

}

class Model3 implements Serializable {

    private static final long serialVersionUID = 1836697963736227954L;
    private boolean isSuccess;
    public boolean isSuccess() {
        return isSuccess;
    }
    public void setSuccess(boolean success) {
        isSuccess = success;
    }
    public String getHollis(){
        return "hollischuang";
    }
}

