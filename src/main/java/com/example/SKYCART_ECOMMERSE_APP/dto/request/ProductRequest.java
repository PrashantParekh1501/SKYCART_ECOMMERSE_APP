package com.example.SKYCART_ECOMMERSE_APP.dto.request;

import com.example.SKYCART_ECOMMERSE_APP.enums.Category;
import lombok.*;
import lombok.experimental.FieldDefaults;

@NoArgsConstructor
@AllArgsConstructor
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProductRequest {
    String name;
    int price;
    Category category;
}
