package com.example.demo.controller;

import org.springframework.stereotype.Component;

//@Component //this can be called as context.getBean(PizzaController.class); or (PizzaController) context.getBean("pizzaController");
@Component("pizza") //this can be called as (PizzaController) context.getBean("pizza");
public class PizzaController {

    public String getPizza() {
        return "Hot Pizza!";
    }
}
