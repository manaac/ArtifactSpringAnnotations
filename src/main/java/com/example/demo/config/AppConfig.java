package com.example.demo.config;

import com.example.demo.service.VegPizza;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public VegPizza getVegPizza() {
        return new VegPizza();
    }
}
