package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Product;
import com.example.demo.Repository.ProductRepository;

@Service
public class ProductServiceImplementation implements ProductService {

    @Autowired
    ProductRepository repository;

    @Override
    public Product saveProduct(Product product) {
        return repository.save(product);
    }

    @Override
    public List<Product> getAllProducts() {
        return repository.findAll();
    }

    @Override
    public void deleteProduct(int id) {
        repository.deleteById(id);
    }
}