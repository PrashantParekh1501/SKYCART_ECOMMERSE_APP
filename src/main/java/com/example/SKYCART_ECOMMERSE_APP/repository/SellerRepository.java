package com.example.SKYCART_ECOMMERSE_APP.repository;

import com.example.SKYCART_ECOMMERSE_APP.entity.Seller;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SellerRepository extends JpaRepository<Seller,Integer> {


}
