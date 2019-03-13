package service;

import model.Product;

import java.util.List;

public interface ProductSevice {
    List<Product>findAll();
    void save (Product product);
    Product findByName (String name);
    void update(int id, Product product);
    void remove(int id);
}
