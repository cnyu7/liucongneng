package com.cn.serializable;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializableDemo1 {
    public static void main(String[] args) {
        //Initializes The Object
        User1 user = new User1();
        user.setName("hollis");
        //Write Obj to File
        try ( ObjectOutputStream oos
                      = new ObjectOutputStream(new FileOutputStream("tempFile"))){
            oos.writeObject(user);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class User1 /*implements Serializable*/ {
    // private static final long serialVersionUID = 1L;
    private String name;
    private int age;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}


