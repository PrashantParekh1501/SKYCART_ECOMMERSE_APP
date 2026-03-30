package com.example.SKYCART_ECOMMERSE_APP.controllers;

import com.example.SKYCART_ECOMMERSE_APP.dto.request.ProductRequest;
import com.example.SKYCART_ECOMMERSE_APP.dto.response.ProductResponse;
import com.example.SKYCART_ECOMMERSE_APP.entity.Product;
import com.example.SKYCART_ECOMMERSE_APP.exceptions.productalreadyaddedexception;
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
   private ProductService productService;

    @PostMapping
    public ResponseEntity<?> addproduct(@RequestBody ProductRequest productRequest){
        try {
            ProductResponse Response = productService.addproduct(productRequest);
            return new ResponseEntity<>( Response, HttpStatus.CREATED);
        }
        catch(productalreadyaddedexception e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

    //getproduct
    @GetMapping("/{sellerid}/{productid}")
    public ResponseEntity<?> getproduct(@PathVariable  int sellerid,@PathVariable int productid){
        try{
            return new ResponseEntity<>(ProductService.getproduct(sellerid, productid), HttpStatus.OK);
        }
        catch(sellernotfoundexception e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }


    //getproductbyreqparam
    @GetMapping
    public ResponseEntity<?> getproductbyreqparam(@RequestParam("sellerid") int sellerid, @RequestParam("productid") int productid){
        try{
            return new ResponseEntity(ProductService.getproduct(sellerid, productid), HttpStatus.OK);
        }
        catch(sellernotfoundexception e){
            return new ResponseEntity(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }






}
