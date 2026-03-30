package com.example.SKYCART_ECOMMERSE_APP.services;

import com.example.SKYCART_ECOMMERSE_APP.dto.request.ProductRequest;
import com.example.SKYCART_ECOMMERSE_APP.dto.response.ProductResponse;
import com.example.SKYCART_ECOMMERSE_APP.entity.Product;
import com.example.SKYCART_ECOMMERSE_APP.entity.Seller;
import com.example.SKYCART_ECOMMERSE_APP.exceptions.Productnotfoundexception;
import com.example.SKYCART_ECOMMERSE_APP.exceptions.sellernotfoundexception;
import com.example.SKYCART_ECOMMERSE_APP.repository.ProductRepository;
import com.example.SKYCART_ECOMMERSE_APP.repository.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private SellerRepository sellerRepository;

    @Autowired
    private static ProductRepository productRepository;

    public static Product getproduct(int sellerid, int productid) {
        Optional<Product> optionalProduct = productRepository.findById(productid);
        if(optionalProduct.isEmpty()){
            throw new Productnotfoundexception("product not found for this id"+ productid);
        }
        return optionalProduct.get();
    }


    public ProductResponse addproduct(ProductRequest productRequest) {
        //validate
        if(productRequest == null){
            throw  new IllegalArgumentException("productrequest can not be null");
        }

        //dto to entity mapping
        Product product = new Product();
        product.setName(product.getName());
        product.setCategory(product.getCategory());
        product.setBrandname(product.getBrandname());
        product.setPrice(product.getPrice());
        product.setId(product.getId());

        //save the entity
        Product savedproduct = productRepository.save(product);

        //convert entity to response
        ProductResponse response = new ProductResponse();
        response.setCategory(response.getCategory());
        response.setName(response.getName());
        response.setPrice(response.getPrice());
        response.setSeller(response.getSeller());

        return response;
    }
}
