package com.example.SKYCART_ECOMMERSE_APP.transformer;

import com.example.SKYCART_ECOMMERSE_APP.dto.request.AddressRequest;
import com.example.SKYCART_ECOMMERSE_APP.dto.response.AddressReponse;
import com.example.SKYCART_ECOMMERSE_APP.entity.Address;
import lombok.experimental.UtilityClass;

@UtilityClass
public class AddressTransformer {


    public static Address addressRequestToAddress(AddressRequest addressRequest) {
        return Address.builder()
                .city(addressRequest.getCity())
                .state(addressRequest.getState())
                .landmark(addressRequest.getLandmark())
                .pincode(addressRequest.getPincode())
                .build();
    }

    public static AddressReponse addressToAddressResponse(Address savedAddress) {
        return AddressReponse.builder()
                .city(savedAddress.getCity())
                .state(savedAddress.getState())
                .houseno(savedAddress.getHouseno())
                .pincode(savedAddress.getPincode())
                .landmark(savedAddress.getLandmark())
                .build();
    }
}
