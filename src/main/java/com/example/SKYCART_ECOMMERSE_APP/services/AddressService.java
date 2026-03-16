package com.example.SKYCART_ECOMMERSE_APP.services;

import com.example.SKYCART_ECOMMERSE_APP.entity.Address;
import com.example.SKYCART_ECOMMERSE_APP.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

    @Autowired
    AddressRepository addressRepository;

    public static String addaddress(int id, Address address) {
        return "add address to this customer successfully"+id;
    }
}
