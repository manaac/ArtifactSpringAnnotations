package com.example.demo.repository;

import org.springframework.stereotype.Service;

@Service
public class MyRepository {

    public String hello() {
        return "Hello Repository";
    }
}
