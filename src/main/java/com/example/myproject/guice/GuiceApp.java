package com.example.myproject.guice;

import com.example.myproject.guice.bean.People;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class GuiceApp {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new GuiceModule());
        People people = injector.getInstance(People.class);

        // linkedBind
//        people.play();

        // annotationBind
//        people.drive();

        // provideBind
//        people.code();

        // JIT bind
//        people.desk();

        // multi bind
//        people.stars();

        // map bind
//        people.manStars();

        // optional bind
//        people.money();

        // aop
        people.aop();
    }
}
