package com.example.SKYCART_ECOMMERSE_APP.services;

import com.example.SKYCART_ECOMMERSE_APP.entity.Address;
import com.example.SKYCART_ECOMMERSE_APP.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

    @Autowired
    AddressRepository addressRepository;

    public Address addaddress(int id, Address address) {
        return addressRepository.save(address);
    }
}
