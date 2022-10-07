package com.codewithcaleb.spring_reactive_e1.model;



import org.springframework.data.annotation.Id;


public class Product {


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Id
    private int id;
    private String name;
}
