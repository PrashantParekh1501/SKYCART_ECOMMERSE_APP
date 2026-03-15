package com.example.SKYCART_ECOMMERSE_APP.enums;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum Gender {
    MALE,
    FEMALE,
    OTHER;

    @JsonCreator
    public static Gender fromString(String value){
        return Gender.valueOf(value.toUpperCase());
    }
}
