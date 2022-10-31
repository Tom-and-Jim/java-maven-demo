package com.example.myproject.guice;

import com.example.myproject.guice.bean.animal.Animal;
import com.example.myproject.guice.bean.animal.Dog;
import com.example.myproject.guice.bean.aop.AOPObject;
import com.example.myproject.guice.bean.aop.AOPTag;
import com.example.myproject.guice.bean.car.BMW;
import com.example.myproject.guice.bean.car.BYD;
import com.example.myproject.guice.bean.car.Car;
import com.example.myproject.guice.bean.car.annotation.BMWTag;
import com.example.myproject.guice.bean.car.annotation.BYDTag;
import com.example.myproject.guice.bean.computer.Computer;
import com.example.myproject.guice.bean.computer.MacComputer;
import com.example.myproject.guice.bean.computer.WindowsComputer;
import com.example.myproject.guice.bean.manstart.JingWu;
import com.example.myproject.guice.bean.manstart.ManStar;
import com.example.myproject.guice.bean.manstart.YoubinLi;
import com.example.myproject.guice.bean.money.Money;
import com.example.myproject.guice.bean.money.RMB;
import com.example.myproject.guice.bean.star.QinxiaLiu;
import com.example.myproject.guice.bean.star.Star;
import com.example.myproject.guice.bean.star.YifeiLiu;
import com.example.myproject.guice.intecerptor.AOPIntecerptor;
import com.google.inject.*;
import com.google.inject.matcher.Matchers;
import com.google.inject.multibindings.MapBinder;
import com.google.inject.multibindings.Multibinder;
import com.google.inject.multibindings.MultibinderBinding;
import com.google.inject.multibindings.OptionalBinder;

public class GuiceModule extends AbstractModule {
    @Override
    protected void configure() {
        super.configure();

//        bind(Animal.class).to(Cat.class);
//        bind(Animal.class).toInstance(new Dog());

        bind(Car.class).annotatedWith(BMWTag.class).to(BMW.class);
        bind(Car.class).annotatedWith(BYDTag.class).to(BYD.class);

//        bind(Computer.class).toProvider(ComputerProvider.class);

        // untargetedBind
//        bind(BYD.class).annotatedWith(BMWTag.class).to(BYD.class).in(Singleton.class);

        // constructorBind
        try {
            bind(Computer.class).toConstructor(WindowsComputer.class.getConstructor());
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }

        Multibinder<Star> starMultibinder = Multibinder.newSetBinder(binder(), Star.class);
        starMultibinder.addBinding().to(QinxiaLiu.class);
        starMultibinder.addBinding().to(YifeiLiu.class);

        MapBinder<String, ManStar> manStarMapBinder = MapBinder.newMapBinder(binder(), String.class, ManStar.class);
        manStarMapBinder.addBinding("JingWu").to(JingWu.class);
        manStarMapBinder.addBinding("YoubinLi").to(YoubinLi.class);

        OptionalBinder.newOptionalBinder(binder(), Money.class);

        bind(AOPObject.class);
        bindInterceptor(Matchers.any(), Matchers.annotatedWith(AOPTag.class),
                new AOPIntecerptor());
    }

    @Provides
    @Singleton
    public Animal provideAnimal() {
        return new Dog();
    }

    @Provides
    public Money providerMoney() {
        return new RMB();
    }

    static class ComputerProvider implements Provider<Computer> {

        @Override
        public Computer get() {
            return new MacComputer();
        }
    }
}
