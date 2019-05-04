package com.codegym.service;

import com.codegym.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService{
    private static Map <Integer,Product> products;

    static{
        products= new HashMap<>();
        products.put(1,new Product(1,"gà","thịt gà",100000));
        products.put(2,new Product(2,"vịt","thịt vịt",200000));
        products.put(3,new Product(3,"chó","giữ nhà",300000));
        products.put(4,new Product(4,"trâu","cày ruộng",400000));
        products.put(5,new Product(5,"heo","thịt heo",500000));
    }
    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(),product);
    }

    @Override
    public void create(Product product) {
        products.put(product.getId(),product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id,product);
    }
}
