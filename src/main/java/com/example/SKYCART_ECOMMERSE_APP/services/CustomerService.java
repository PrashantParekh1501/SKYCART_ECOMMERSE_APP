package com.example.SKYCART_ECOMMERSE_APP.services;

import com.example.SKYCART_ECOMMERSE_APP.dto.request.CustomerRequest;
import com.example.SKYCART_ECOMMERSE_APP.dto.response.CustomerResponse;
import com.example.SKYCART_ECOMMERSE_APP.entity.Customer;
import com.example.SKYCART_ECOMMERSE_APP.enums.Gender;
import com.example.SKYCART_ECOMMERSE_APP.exceptions.Customeralreadyexistexception;
import com.example.SKYCART_ECOMMERSE_APP.exceptions.customernotfoundexception;
import com.example.SKYCART_ECOMMERSE_APP.exceptions.gendernotfoundexception;
import com.example.SKYCART_ECOMMERSE_APP.exceptions.idinvalidexception;
import com.example.SKYCART_ECOMMERSE_APP.repository.CustomerRepository;
import com.example.SKYCART_ECOMMERSE_APP.transformer.CustomerTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.lang.module.ResolutionException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

   public Customer getcustomerbyid(int id){
        Optional<Customer>optionalCustomer = customerRepository.findById(id);

        if(optionalCustomer.isEmpty()){
            throw new idinvalidexception("this customer is invalid for this id"+id);
        }
        return optionalCustomer.get();
   }

    public Customer addcustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @GetMapping("/gender/{gender}")
    public List<Customer> getcustomerbygender(Gender gender) {
       List<Customer> customers = customerRepository.findByGender(gender);

       if(customers.isEmpty()){
           throw new gendernotfoundexception("no customers found for this gender"+ gender);
       }
       return customers;
    }

    public Customer getcustomerbyagegreaterthan(int age) {
       Optional<Customer> optinalcustomer = customerRepository.findByAgeGreaterThan(age);
       if(optinalcustomer.isEmpty()){
           throw new customernotfoundexception("customers not found for this age"+ age);
       }
       return optinalcustomer.get();
    }


    public CustomerResponse addcustomer(CustomerRequest customerRequest) {
        // Step 1 - Request DTO to Entity
        Customer customer = CustomerTransformer.customerrequesttocustomer(customerRequest);

        // Step 2 - Save entity
        Customer savedCustomer = customerRepository.save(customer);

        // Step 3 - Convert saved entity to Response
        return CustomerTransformer.customertocustomerresponse(savedCustomer);
    }
}
