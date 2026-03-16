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
    int id;

    @Column(length = 6)
    int pincode;

    @Column(unique = true)
    String landmark;

    @Column(nullable = false)
    String city;

    @Column
    String state;
}
