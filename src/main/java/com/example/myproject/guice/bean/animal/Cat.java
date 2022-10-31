package com.example.myproject.guice.bean.animal;

public class Cat implements Animal {
    @Override
    public void sayName() {
        System.out.println("I am a cat.");
    }
}
