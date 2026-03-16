package com.example.SKYCART_ECOMMERSE_APP.controllers;

import com.example.SKYCART_ECOMMERSE_APP.entity.Product;
import com.example.SKYCART_ECOMMERSE_APP.exceptions.sellernotfoundexception;
import com.example.SKYCART_ECOMMERSE_APP.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/product")
public class ProductController {

    @Autowired
    ProductService productService;

    @PostMapping
    public ResponseEntity addproduct(@RequestParam("sellerid")int sellerid, @RequestBody Product product){
        try{
            return new ResponseEntity(ProductService.addproduct(sellerid, product), HttpStatus.OK);
        }
        catch(sellernotfoundexception e){
            return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

}
