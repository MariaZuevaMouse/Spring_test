package com.company.mz.demoapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainAppWithDI {
    public static void main(String[] args) {
        //container IOC (inversion of control)
        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppContext.class);

        Car car = context.getBean("car", Car.class);
        car.drive();
    }


}
