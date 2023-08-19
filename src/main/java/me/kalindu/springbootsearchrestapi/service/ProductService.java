package me.kalindu.springbootsearchrestapi.service;

import me.kalindu.springbootsearchrestapi.entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> searchProducts(String query);

    Product createProduct(Product product);
}
