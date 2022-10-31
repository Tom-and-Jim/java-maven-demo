package com.example.myproject.guice.bean.computer;

public class WindowsComputer implements Computer {

    public WindowsComputer() {}

    @Override
    public void sayName() {
        System.out.println("I am a windows.");
    }
}
