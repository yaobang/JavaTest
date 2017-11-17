package com.fisheryc.hello;

import java.io.Serializable;

/**
 * 这是一个我的第一个Java程序
 * Created by fisheryc on 2017/11/17.
 */
public class HelloWorld {
    public static void main(String[] args) {
        //System.out.println("HelloWorld!");
        String greating = "Hello";
        if (greating.equals("Hello")){
            System.out.println("通过");
        }
        else{
            System.out.println("不相等");
        }

        System.out.println("HelloWorld!");

    }
}

