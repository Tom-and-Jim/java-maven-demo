package com.example.myproject.subpackage;

import com.example.myproject.Greeting;
import com.google.common.primitives.Ints;

public class SubApp {

    public static int compare(int a, int b) {
        return Ints.compare(a, b);
    }

    public static void main(String... args) throws Exception {
        SubApp app = new SubApp();
        int greetingInt = Greeting.getInt();
        System.out.println("Success: " + app.compare(2, greetingInt));
    }
}
