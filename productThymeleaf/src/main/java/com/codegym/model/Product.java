package com.codegym.model;

public class Product {
    private int id;
    private String name;
    private String function;
    private int price;
    public  Product(){}
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

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Product(int id, String name, String function, int price) {
        this.id = id;
        this.name = name;
        this.function = function;
        this.price = price;
    }
}
