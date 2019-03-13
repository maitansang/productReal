package service;

import model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl  implements ProductSevice {

    private static Map<Integer,Product> products;
    static {
        products= new HashMap<>();
        products.put(1,new Product(1,"chicken","eggs"));
        products.put(2,new Product(1,"dog","guard"));
        products.put(3,new Product(1,"pig","meat"));
        products.put(4,new Product(4,"cow","milk"));
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
    public Product findByName(String name) {
        return products.get(name);
    }

    @Override
    public void update(int id, Product product) {

    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }
}
