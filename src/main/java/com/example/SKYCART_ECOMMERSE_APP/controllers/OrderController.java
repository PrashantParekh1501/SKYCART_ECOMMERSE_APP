package com.example.SKYCART_ECOMMERSE_APP.controllers;

import com.example.SKYCART_ECOMMERSE_APP.exceptions.idinvalidexception;
import com.example.SKYCART_ECOMMERSE_APP.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/order")
public class OrderController {

     @Autowired
    private OrderService orderService;

     public ResponseEntity placeorder(@RequestParam int customerid, @RequestParam int productid){
         try{
             return new ResponseEntity(orderService.placeorder(customerid, productid), HttpStatus.OK);
         }
         catch (idinvalidexception e){
             return new ResponseEntity(e.getmessage(), HttpStatus.BAD_REQUEST);
         }
     }


}
