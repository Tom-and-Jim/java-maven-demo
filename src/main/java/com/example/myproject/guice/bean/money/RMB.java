package com.example.myproject.guice.bean.money;

public class RMB implements Money {
    @Override
    public void sayName() {
        System.out.println("I am RMB.");
    }
}
