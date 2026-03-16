package com.example.SKYCART_ECOMMERSE_APP.services;

import com.example.SKYCART_ECOMMERSE_APP.entity.Product;
import com.example.SKYCART_ECOMMERSE_APP.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    static ProductRepository productRepository;

    public static Product addproduct(int sellerid, Product product) {
        return productRepository.addproduct(sellerid, product);
    }
}
