package com.company.mz.demoapp;

public class MainApp {
    public static void main(String[] args) {
        Cylinder cylinder1 = new Cylinder();
        Cylinder cylinder2 = new Cylinder();
        Cylinder cylinder3 = new Cylinder();
        Cylinder cylinder4 = new Cylinder();
        Engine engine = new Engine(cylinder1, cylinder2, cylinder3, cylinder4);

        Wheel wheel1 = new Wheel(22, true);
        Wheel wheel2 = new Wheel(22, true);
        Wheel wheel3 = new Wheel(22, true);
        Wheel wheel4 = new Wheel(22, true);
        Wheel[] wheels = new Wheel[]{wheel1,wheel2,wheel3, wheel4};
        Car car = new Car(engine, wheels, "ford focus");

        car.drive();
    }
}
