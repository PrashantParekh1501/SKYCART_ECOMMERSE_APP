package com.example.SKYCART_ECOMMERSE_APP.controllers;

import com.example.SKYCART_ECOMMERSE_APP.dto.request.AddressRequest;
import com.example.SKYCART_ECOMMERSE_APP.dto.response.AddressReponse;
import com.example.SKYCART_ECOMMERSE_APP.services.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/address")
public class AderessController {

    @Autowired
   private AddressService addressService;


    @PostMapping("{id}")
    public ResponseEntity addaddress(@PathVariable("customerid")int customerid, @RequestBody AddressRequest addressRequest){
        try{
            AddressReponse response = addressService.addaddress(customerid, addressRequest);
            return new ResponseEntity<>(response,HttpStatus.CREATED);
        }
        catch(Exception e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }








}
