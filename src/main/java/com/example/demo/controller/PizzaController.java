package com.example.demo.controller;

import com.example.demo.service.Pizza;
import com.example.demo.service.VegPizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.security.PublicKey;

//@Component //this can be called as context.getBean(PizzaController.class); or (PizzaController) context.getBean("pizzaController");
@Component("pizza") //this can be called as (PizzaController) context.getBean("pizza");
public class PizzaController {

    //Below method is to demo @Component
//    public String getPizza() {
//        return "Hot Pizza!";
//    }

    //Field Injection
//    @Autowired
//    public VegPizza vegPizza;

    //Constructor Injection
//    @Autowired
//    public PizzaController(VegPizza pizza) {
//        this.vegPizza = pizza;
//    }

    //Setter Injection
//    @Autowired
//    public void setVegPizza(VegPizza pizza) {
//        this.vegPizza = pizza;
//    }

    public Pizza pizza;

    @Autowired
    public PizzaController(@Qualifier("vegPizza") Pizza pizza1) {
        this.pizza = pizza1;
    }

    public String getPizza() {
        return pizza.getPizza();
    }
}
