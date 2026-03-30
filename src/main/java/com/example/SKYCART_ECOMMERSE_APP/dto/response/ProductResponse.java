package com.example.SKYCART_ECOMMERSE_APP.dto.response;

import com.example.SKYCART_ECOMMERSE_APP.enums.Category;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class ProductResponse {
    String name;
    int price;
    Category category;
    SellerResponse seller;
}
