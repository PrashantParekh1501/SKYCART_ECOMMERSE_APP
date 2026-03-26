package com.example.SKYCART_ECOMMERSE_APP.entity;

import com.example.SKYCART_ECOMMERSE_APP.enums.OrderStatus;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "orders")
public class Order {

    @Id
    int id;

    @Column(unique = true)
    String name;

    @Column(nullable = false)
    int price;

    @Column
    @Enumerated(value = EnumType.STRING)
    OrderStatus orderStatus;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    Customer customer;

    @ManyToMany
    @JoinTable
    List<Product> products = new ArrayList<>();

}
