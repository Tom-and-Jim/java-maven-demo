package com.example.myproject.guice.bean.car;

public class BMW implements Car {
    @Override
    public void sayName() {
        System.out.println("I am BMW.");
    }
}
