package com.example.SKYCART_ECOMMERSE_APP.repository;

import com.example.SKYCART_ECOMMERSE_APP.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address,Integer> {
}
