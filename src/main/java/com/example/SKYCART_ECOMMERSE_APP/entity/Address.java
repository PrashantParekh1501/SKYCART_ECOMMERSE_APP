package com.example.SKYCART_ECOMMERSE_APP.entity;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column(length = 6)
    Integer pincode;

    @Column(unique = true)
    String landmark;

    @Column(nullable = false)
    String city;

    @Column
    String state;
}
