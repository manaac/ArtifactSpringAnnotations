package com.example.demo.Bean;

public class Book {
    private String id;
    private String bookName;
    private String bookDescription;

    public Book(String id, String bookName, String bookDescription) {
        this.id = id;
        this.bookName = bookName;
        this.bookDescription = bookDescription;
    }

    public String getId() {
        return id;
    }

    public String getBookName() {
        return bookName;
    }

    public String getBookDescription() {
        return bookDescription;
    }
}
