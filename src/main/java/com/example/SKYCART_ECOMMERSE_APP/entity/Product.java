package com.example.SKYCART_ECOMMERSE_APP.entity;

import com.example.SKYCART_ECOMMERSE_APP.enums.Category;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column(unique = true)
    String name;

    @Column(nullable = false)
    int price;

    @Column(nullable = false)
    String brandname;

    @Column
    @Enumerated(value = EnumType.STRING)
    Category category;

    Seller seller;
}
