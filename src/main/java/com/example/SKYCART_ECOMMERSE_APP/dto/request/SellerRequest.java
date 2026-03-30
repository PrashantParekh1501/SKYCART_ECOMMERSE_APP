package com.example.SKYCART_ECOMMERSE_APP.dto.request;

import jakarta.persistence.Entity;
import lombok.*;
import lombok.experimental.FieldDefaults;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SellerRequest {
     String name;

     String city;

     String state;

     String gstno;
}
