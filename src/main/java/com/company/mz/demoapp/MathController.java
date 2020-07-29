package com.company.mz.demoapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathController {
    @Autowired
    private MathService service;

    @GetMapping
    public int getSum(@RequestParam int a, @RequestParam int b ){
        return service.calculateSum(a, b);
    }
}
