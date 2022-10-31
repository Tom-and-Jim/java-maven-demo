package com.example.myproject.guice.bean.aop;

public class AOPObject {

    @AOPTag
    public void sayName() {
        System.out.println("I am AOPObject.");
    }
}
