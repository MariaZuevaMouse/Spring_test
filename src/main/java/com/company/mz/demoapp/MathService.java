package com.company.mz.demoapp;

import org.springframework.stereotype.Service;

@Service
public class MathService {

    public int calculateSum(int a, int b){
        return a+b;
    }
}
