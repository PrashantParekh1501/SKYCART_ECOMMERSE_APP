package com.example.SKYCART_ECOMMERSE_APP.services;

import com.example.SKYCART_ECOMMERSE_APP.dto.request.SellerRequest;
import com.example.SKYCART_ECOMMERSE_APP.dto.response.SellerResponse;
import com.example.SKYCART_ECOMMERSE_APP.entity.Seller;
import com.example.SKYCART_ECOMMERSE_APP.exceptions.sellerinvalidexception;
import com.example.SKYCART_ECOMMERSE_APP.repository.SellerRepository;
import com.example.SKYCART_ECOMMERSE_APP.transformer.SellerTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SellerService {

    @Autowired
    private SellerRepository sellerRepository;

    public SellerResponse addSeller(SellerRequest sellerRequest) {

        if (sellerRequest == null) {
            throw new sellerinvalidexception("Seller is not valid");
        }

        Seller seller = SellerTransformer.sellerrequesttoseller(sellerRequest);

        Seller savedSeller = sellerRepository.save(seller);

        return SellerTransformer.sellertosellerresponse(savedSeller);
    }
}


