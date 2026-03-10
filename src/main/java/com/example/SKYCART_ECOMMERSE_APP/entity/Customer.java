package com.example.SKYCART_ECOMMERSE_APP.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.antlr.v4.runtime.misc.NotNull;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Customer {

    @Id
    int id;

    @Column(nullable = false,unique = true)
    String name;

    @NotNull
    String aderess;

    @Column(unique = true)
    String email;

    @Column(length = 5)
    int pincode;

    @Column(length = 10)
    int mobno;

    @Column
    int age;
}
