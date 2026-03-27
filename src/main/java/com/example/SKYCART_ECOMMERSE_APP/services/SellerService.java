package com.example.SKYCART_ECOMMERSE_APP.services;

import com.example.SKYCART_ECOMMERSE_APP.entity.Seller;
import com.example.SKYCART_ECOMMERSE_APP.repository.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SellerService {

    @Autowired
   private SellerRepository sellerRepository;

    public Seller addseller(Seller seller) {
        return sellerRepository.save(seller);
    }
}
