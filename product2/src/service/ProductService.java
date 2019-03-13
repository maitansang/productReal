package service;

import model.Product;

import java.util.List;

public interface ProductService {
    List<Product> listProduct();
    void create(Product product);
    void update(int id,Product product);
    Product findByID(int id);
    void remove(int id);
    void save (Product product);
}