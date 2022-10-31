package com.example.myproject.guice.intecerptor;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class AOPIntecerptor implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("You are intercepted.");
        return methodInvocation.proceed();
    }
}
