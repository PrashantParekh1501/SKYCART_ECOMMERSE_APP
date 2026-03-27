package com.example.SKYCART_ECOMMERSE_APP.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.annotations.AnyDiscriminatorImplicitValues;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Seller {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column(nullable = false)
    String name;

    @Column(unique = true)
    String city;

    @Column(nullable = false)
    String state;

    @Column(length = 15)
    String gstno;
}
