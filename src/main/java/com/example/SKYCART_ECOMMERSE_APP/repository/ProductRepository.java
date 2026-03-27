package com.example.SKYCART_ECOMMERSE_APP.repository;

import com.example.SKYCART_ECOMMERSE_APP.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
    boolean existsByNameAndSellerId(String name, Integer sellerId);
}
