package com.example.demo.config;

import com.example.demo.controller.PizzaController;
import com.example.demo.service.NonVegPizza;
import com.example.demo.service.Pizza;
import com.example.demo.service.VegPizza;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name = "vegPizzaBean")
    public Pizza vegPizza() {
        return new VegPizza();
    }

    @Bean
    public Pizza nonVegPizza() {
        return new NonVegPizza();
    }

    @Bean
    public PizzaController pizzaController() {
        return new PizzaController(nonVegPizza());
    }
}
