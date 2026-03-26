package com.example.SKYCART_ECOMMERSE_APP.repository;

import com.example.SKYCART_ECOMMERSE_APP.entity.Customer;
import com.example.SKYCART_ECOMMERSE_APP.enums.Gender;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    Optional<Customer> findByAgeGreaterThan(int age);

    List<Customer> findByGender(Gender gender);
}
