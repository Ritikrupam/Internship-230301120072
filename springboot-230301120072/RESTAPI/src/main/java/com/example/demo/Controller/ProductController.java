package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.Model.Product;
import com.example.demo.Service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    ProductService service;

    @PostMapping
    public Product saveProduct(@RequestBody Product product) {

        return service.saveProduct(product);
    }

    @GetMapping
    public List<Product> getAllProducts() {

        return service.getAllProducts();
    }

    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable int id, @RequestBody Product product) {
        product.setId(id);
        return service.saveProduct(product);
    }

    @DeleteMapping("/{id}")
    public String deleteProduct(@PathVariable int id) {
        service.deleteProduct(id);
        return "Product Deleted Successfully";
    }
}