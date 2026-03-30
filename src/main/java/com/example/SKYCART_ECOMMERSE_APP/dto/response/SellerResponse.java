package com.example.SKYCART_ECOMMERSE_APP.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class SellerResponse {
    String name;

    String city;

    String state;
}
