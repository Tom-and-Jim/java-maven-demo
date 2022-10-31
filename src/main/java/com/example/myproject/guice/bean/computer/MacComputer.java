package com.example.myproject.guice.bean.computer;

public class MacComputer implements Computer {

    @Override
    public void sayName() {
        System.out.println("I am a Mac.");
    }
}
