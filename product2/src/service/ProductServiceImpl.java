package service;

import model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService {
    private static Map<Integer, Product> products;
    static {
        products = new HashMap<>();
        products.put(1,new Product(1,"chó",1200,"giu nha"));
        products.put(2,new Product(2,"mèo",20,"bat chuot"));
        products.put(3,new Product(3,"gà",5,"thịt"));
        products.put(4,new Product(4,"vịt",2225,"trứng"));
    }

    @Override
    public Product findByID(int id) {
        return products.get(id);
    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }

    @Override
    public void save(Product product) {

    }

    @Override
    public void update(int id, Product product) {
        products.put(id,product);
    }

    @Override
    public List<Product> listProduct() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void create(Product product) {
        products.put(product.getId(),product);
    }
}
