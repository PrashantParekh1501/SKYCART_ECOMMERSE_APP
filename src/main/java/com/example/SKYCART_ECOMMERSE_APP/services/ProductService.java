package com.example.SKYCART_ECOMMERSE_APP.services;

import com.example.SKYCART_ECOMMERSE_APP.entity.Product;
import com.example.SKYCART_ECOMMERSE_APP.entity.Seller;
import com.example.SKYCART_ECOMMERSE_APP.exceptions.Productnotfoundexception;
import com.example.SKYCART_ECOMMERSE_APP.exceptions.sellernotfoundexception;
import com.example.SKYCART_ECOMMERSE_APP.repository.ProductRepository;
import com.example.SKYCART_ECOMMERSE_APP.repository.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private SellerRepository sellerRepository;

    @Autowired
    private static ProductRepository productRepository;

    public static Product getproduct(int sellerid, int productid) {
        Optional<Product> optionalProduct = productRepository.findById(productid);
        if(optionalProduct.isEmpty()){
            throw new Productnotfoundexception("product not found for this id"+ productid);
        }
        return optionalProduct.get();
    }

    @PostMapping
    public ResponseEntity<?> addproduct(@RequestBody Product product) {

        Integer sellerId = product.getSeller().getId();

        if(productRepository.existsById(sellerId)){
            throw new RuntimeException("Product already exists");
        }


        if(productRepository.existsByNameAndSellerId(product.getName(), sellerId)){
            throw new RuntimeException("Product already exists for this seller");
        }

        Seller seller = sellerRepository.findById(sellerId)
                .orElseThrow(() -> new RuntimeException("Seller not found"));

        product.setSeller(seller);

        Product saved = productRepository.save(product);

        return new ResponseEntity<>(saved, HttpStatus.CREATED);
    }
}
