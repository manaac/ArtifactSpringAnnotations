package com.example.demo;

import com.example.demo.controller.PizzaController;
import com.example.demo.service.VegPizza;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NameSpringAnnotationsApplication {

    public static void main(String[] args) {

        var context = SpringApplication.run(NameSpringAnnotationsApplication.class, args);//this run method returns application context object. Here application context act as a spring IOC container
//		PizzaController pizzaController = context.getBean(PizzaController.class);
//		PizzaController pizzaController = (PizzaController) context.getBean("pizzaController");
//      PizzaController pizzaController = (PizzaController) context.getBean("pizza");
        PizzaController pizzaController = (PizzaController) context.getBean("pizzaController");
        System.out.println(pizzaController.getPizza());

        VegPizza vegPizza = context.getBean(VegPizza.class);
        System.out.println(vegPizza.getPizza());
    }

}
