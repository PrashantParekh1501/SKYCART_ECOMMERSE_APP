package com.example.SKYCART_ECOMMERSE_APP.repository;

import com.example.SKYCART_ECOMMERSE_APP.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    String addcustomer(int id);
}
