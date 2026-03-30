package com.example.SKYCART_ECOMMERSE_APP.services;

import com.example.SKYCART_ECOMMERSE_APP.dto.request.AddressRequest;
import com.example.SKYCART_ECOMMERSE_APP.dto.response.AddressReponse;
import com.example.SKYCART_ECOMMERSE_APP.entity.Address;
import com.example.SKYCART_ECOMMERSE_APP.entity.Customer;
import com.example.SKYCART_ECOMMERSE_APP.exceptions.idinvalidexception;
import com.example.SKYCART_ECOMMERSE_APP.repository.AddressRepository;
import com.example.SKYCART_ECOMMERSE_APP.repository.CustomerRepository;
import com.example.SKYCART_ECOMMERSE_APP.transformer.AddressTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

    @Autowired
    AddressRepository addressRepository;

    @Autowired
    CustomerRepository customerRepository;

    public AddressReponse addaddress(int id, AddressRequest addressRequest) {
        // Step 1 - Customer find karo by id
        Customer customer = customerRepository.findById(id)
                .orElseThrow(() -> new idinvalidexception("Customer not found"));

        // Step 2 - Request to Entity
        Address address = AddressTransformer.addressRequestToAddress(addressRequest);
        address.setCustomer(customer);

        // Step 3 - Save
        Address savedAddress = addressRepository.save(address);

        // Step 4 - Return Response
        return AddressTransformer.addressToAddressResponse(savedAddress);
    }
}
