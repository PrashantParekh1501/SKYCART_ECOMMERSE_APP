package com.example.SKYCART_ECOMMERSE_APP.dto.request;

import com.example.SKYCART_ECOMMERSE_APP.enums.Gender;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.*;
import lombok.experimental.FieldDefaults;

@NoArgsConstructor
@AllArgsConstructor
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CustomerRequest {
     String name;
     String address;
     String email;

    Integer pincode;
    Long mobno;
     Integer age;

     Gender gender;

}
