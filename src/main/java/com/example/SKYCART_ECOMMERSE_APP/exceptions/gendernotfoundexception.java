package com.example.SKYCART_ECOMMERSE_APP.exceptions;

import org.springframework.http.HttpHeaders;

public class gendernotfoundexception extends RuntimeException {
    public gendernotfoundexception(String message) {
        super(message);
    }

    public String getmessage() {
        return "this gender's data not in the database";
    }
}
