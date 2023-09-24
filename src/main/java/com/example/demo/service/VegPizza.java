package com.example.demo.service;

import org.springframework.stereotype.Component;

//@Component
public class VegPizza implements Pizza{
//    public String getVegPizza() {
//        return "Veg Pizza!";
//    }

    @Override
    public String getPizza() {
        return "Veg Pizza!";
    }
}
