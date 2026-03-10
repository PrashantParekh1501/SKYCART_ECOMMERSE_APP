package com.example.SKYCART_ECOMMERSE_APP.services;

import com.example.SKYCART_ECOMMERSE_APP.repository.CustomerRepository;
import jdk.dynalink.beans.StaticClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    static CustomerRepository customerRepository;

    public static String addcustomer(int id) {
        return customerRepository.addcustomer(id);
    }
}
