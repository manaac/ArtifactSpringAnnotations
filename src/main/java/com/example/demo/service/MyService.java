package com.example.demo.service;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@Service
public class MyService {

    public String hello() {
        return "Hello Service";
    }
}
