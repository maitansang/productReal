package com.codegym.service;

import com.codegym.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();
    void save (Product product);
    void create(Product product);
    Product findById(int id);
    void remove(int id);
    void update(int id, Product product);
}
