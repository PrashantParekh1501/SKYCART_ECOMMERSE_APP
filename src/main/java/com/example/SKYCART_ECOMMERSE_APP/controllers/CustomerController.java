package com.example.SKYCART_ECOMMERSE_APP.controllers;

import com.example.SKYCART_ECOMMERSE_APP.entity.Customer;
import com.example.SKYCART_ECOMMERSE_APP.enums.Gender;
import com.example.SKYCART_ECOMMERSE_APP.exceptions.Customeralreadyexistexception;
import com.example.SKYCART_ECOMMERSE_APP.exceptions.customernotfoundexception;
import com.example.SKYCART_ECOMMERSE_APP.exceptions.gendernotfoundexception;
import com.example.SKYCART_ECOMMERSE_APP.exceptions.idinvalidexception;
import com.example.SKYCART_ECOMMERSE_APP.services.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
@Slf4j
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @PostMapping("/customer")
    public ResponseEntity<?> addCustomer(@RequestBody Customer customer) {
        try {
            return new ResponseEntity<>(customerService.addcustomer(customer), HttpStatus.CREATED);
        }
        catch (Customeralreadyexistexception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/customer2")
    public ResponseEntity<?> getCustomerById(@RequestParam("id") int id) {
        try {
            return new ResponseEntity<>(customerService.getcustomerbyid(id), HttpStatus.OK);
        }
        catch (idinvalidexception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

    //filter based on gender
    //ip- gender , op-List<Customerresponse>

   @GetMapping("customer3")
    public ResponseEntity getcustomerbygender(@PathVariable Gender gender){
        try{
            return new ResponseEntity(customerService.getcustomerbygender(gender), HttpStatus.OK);
        }
        catch (gendernotfoundexception e){
            return new ResponseEntity(e.getmessage(), HttpStatus.NOT_FOUND);
        }
    }

    //getcustomerbyagegeretrthan


    @GetMapping("customer4")
    public ResponseEntity getcustomerbyagegreaterthan(@RequestParam("age")int age){
        try{
            return new ResponseEntity(customerService.getcustomerbyagegreaterthan(age), HttpStatus.OK);
        }
        catch (customernotfoundexception e){
            return new ResponseEntity(e.getmessage(), HttpStatus.NOT_FOUND);
        }
    }




}