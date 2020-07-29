package com.company.mz.demoapp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppContext {
    @Bean
    @Scope(value = "prototype")
    public Cylinder cylinder(){
        return  new Cylinder();
    }
    @Bean
    @Scope(value = "prototype")
    public Wheel wheel(){
        return new Wheel(22, true);
    }
    @Bean
    public Engine engine(){
        return new Engine(
                cylinder(),
                cylinder(),
                cylinder(),
                cylinder()
        );
    }
    @Bean
    public Car car(){
        Wheel[] wheels = new Wheel[]{wheel(), wheel(),wheel(),wheel()};
        return new Car(
                engine(),
                wheels,
                "ford focus"
        );
    }

}
