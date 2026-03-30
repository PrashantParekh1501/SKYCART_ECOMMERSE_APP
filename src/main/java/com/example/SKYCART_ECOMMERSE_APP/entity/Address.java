package com.example.SKYCART_ECOMMERSE_APP.entity;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Builder
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column
    String houseno;

    @Column(length = 6)
    Integer pincode;

    @Column(unique = true)
    String landmark;

    @Column(nullable = false)
    String city;

    @Column
    String state;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "customer_id")
    Customer customer;
}
