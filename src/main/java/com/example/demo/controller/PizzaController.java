package com.example.demo.controller;

import com.example.demo.service.VegPizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component //this can be called as context.getBean(PizzaController.class); or (PizzaController) context.getBean("pizzaController");
@Component("pizza") //this can be called as (PizzaController) context.getBean("pizza");
public class PizzaController {

    //Below method is to demo @Component
//    public String getPizza() {
//        return "Hot Pizza!";
//    }

    //Field Injection
    @Autowired
    public VegPizza vegPizza;

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

    public String getPizza() {
        return vegPizza.getVegPizza();
    }
}
