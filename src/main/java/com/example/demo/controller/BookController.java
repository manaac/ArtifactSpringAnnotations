package com.example.demo.controller;

import com.example.demo.Bean.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BookController {

    @RequestMapping("hello-world")
    @ResponseBody
    public String helloWorld(){
        return "Hello World!";
    }

    @RequestMapping("getBookDetails")
    @ResponseBody
    public Book getBook(){
        return new Book("1","book name","book description");
    }
}
