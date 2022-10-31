package com.example.myproject.guice.bean;

import com.example.myproject.guice.bean.animal.Animal;
import com.example.myproject.guice.bean.aop.AOPObject;
import com.example.myproject.guice.bean.car.Car;
import com.example.myproject.guice.bean.car.annotation.BMWTag;
import com.example.myproject.guice.bean.car.annotation.BYDTag;
import com.example.myproject.guice.bean.computer.Computer;
import com.example.myproject.guice.bean.manstart.ManStar;
import com.example.myproject.guice.bean.money.Money;
import com.example.myproject.guice.bean.star.Star;
import com.google.inject.Inject;

import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class People {

    Animal animal;
    Car car;
    Computer computer;
    Desk desk;

    Set<Star> stars;
    Map<String, ManStar> manStarMap;
    Optional<Money> money;
    AOPObject aopObject;

    @Inject
    public People(
            Animal animal,
            @BYDTag Car car,
            Computer computer,
            Desk desk,
            Set<Star> stars,
            Map<String, ManStar> manStarMap,
            Optional<Money> money,
            AOPObject aopObject
    ) {
        this.animal = animal;
        this.car = car;
        this.computer = computer;
        this.desk = desk;
        this.stars = stars;
        this.manStarMap = manStarMap;
        this.money = money;
        this.aopObject = aopObject;
    }

    public void play() {
        animal.sayName();
    }

    public void drive() {
        car.sayName();
    }

    public void code() {
        computer.sayName();
    }

    public void desk() {
        desk.sayName();
    }

    public void stars() {
        stars.forEach(Star::sayName);
    }

    public void manStars() {
        manStarMap.forEach((key, value) -> {
            System.out.println("ManStart: " + key);
            value.sayName();
        });
    }

    public void money() {
        if (money.isPresent()) {
            money.get().sayName();
        } else  {
            System.out.println("No money.");
        }
    }

    public void aop() {
        aopObject.sayName();
    }
}
