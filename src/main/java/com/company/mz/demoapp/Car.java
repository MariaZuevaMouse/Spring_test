package com.company.mz.demoapp;

public class Car {
    private Engine engine;
    private Wheel[] wheels;
    private String model;

    public Car(Engine engine, Wheel[] wheels, String model) {
        this.engine = engine;
        this.wheels = wheels;
        this.model = model;
    }
    public void drive(){
        System.out.println("Im driving with DI");
    }
}
