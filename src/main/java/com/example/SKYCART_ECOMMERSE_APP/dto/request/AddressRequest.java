package com.example.SKYCART_ECOMMERSE_APP.dto.request;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.*;
import lombok.experimental.FieldDefaults;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AddressRequest {

    @Column(length = 6)
   int pincode;

    @Column(nullable = false)
   String landmark;

    @Column
   String city;

    @Column
   String state;
}
