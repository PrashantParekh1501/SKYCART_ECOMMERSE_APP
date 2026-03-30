package com.example.SKYCART_ECOMMERSE_APP.transformer;

import com.example.SKYCART_ECOMMERSE_APP.dto.request.SellerRequest;
import com.example.SKYCART_ECOMMERSE_APP.dto.response.SellerResponse;
import com.example.SKYCART_ECOMMERSE_APP.entity.Seller;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class SellerTransformer {

    private SellerTransformer(){};

    public static Seller sellerrequesttoseller(SellerRequest sellerRequest){
        return Seller.builder()
                .name(sellerRequest.getName())
                .city(sellerRequest.getCity())
                .state(sellerRequest.getState())
                .gstno(sellerRequest.getGstno())
                .build();
    }

    public static SellerResponse sellertosellerresponse(Seller seller){
        return SellerResponse.builder()
                .state(seller.getState())
                .city(seller.getCity())
                .name(seller.getName())
                .build();
    }
}
