package com.example.SKYCART_ECOMMERSE_APP.entity;

import com.example.SKYCART_ECOMMERSE_APP.enums.Gender;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private String address;

    @Column(unique = true)
    private String email;

    private Integer pincode;
    private Long mobno;
    private Integer age;

    @Enumerated(EnumType.STRING)
    private Gender gender;
}