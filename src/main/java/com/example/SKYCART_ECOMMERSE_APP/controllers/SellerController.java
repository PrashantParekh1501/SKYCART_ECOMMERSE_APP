package com.example.SKYCART_ECOMMERSE_APP.controllers;

import com.example.SKYCART_ECOMMERSE_APP.dto.request.SellerRequest;
import com.example.SKYCART_ECOMMERSE_APP.dto.response.SellerResponse;
import com.example.SKYCART_ECOMMERSE_APP.entity.Seller;
import com.example.SKYCART_ECOMMERSE_APP.exceptions.selleralreadyexistexception;
import com.example.SKYCART_ECOMMERSE_APP.exceptions.sellerinvalidexception;
import com.example.SKYCART_ECOMMERSE_APP.services.SellerService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@RestController
@RequestMapping("/api/v1/seller")
public class SellerController {

    @Autowired
    private SellerService sellerService;

    @PostMapping
    public ResponseEntity addseller(@RequestBody SellerRequest sellerRequest){
       try{
           SellerResponse response = sellerService.addSeller(sellerRequest);
           return new ResponseEntity(response, HttpStatus.OK);
       }
       catch (sellerinvalidexception e){
           return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
       }
    }
}
