package com.example.SKYCART_ECOMMERSE_APP.transformer;

import com.example.SKYCART_ECOMMERSE_APP.dto.request.CustomerRequest;
import com.example.SKYCART_ECOMMERSE_APP.dto.response.CustomerResponse;
import com.example.SKYCART_ECOMMERSE_APP.entity.Customer;
import lombok.experimental.UtilityClass;

@UtilityClass
public class CustomerTransformer {

    public static CustomerResponse customertocustomerresponse(Customer customer){
        return CustomerResponse.builder()
                .name(customer.getName())
                .address(customer.getAddress())
                .build();
    }

    public static Customer customerrequesttocustomer(CustomerRequest customerRequest){
        return Customer.builder()
                .name(customerRequest.getName())
                .address(customerRequest.getAddress())
                .pincode(customerRequest.getPincode())
                .age(customerRequest.getAge())
                .mobno(customerRequest.getMobno())
                .email(customerRequest.getEmail())
                .build();
    }



}
