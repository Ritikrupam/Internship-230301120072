package com.example.demo.Service;

import java.util.List;

import com.example.demo.Model.Product;

public interface ProductService {

    Product saveProduct(Product product);

    List<Product> getAllProducts();

    void deleteProduct(int id);
}