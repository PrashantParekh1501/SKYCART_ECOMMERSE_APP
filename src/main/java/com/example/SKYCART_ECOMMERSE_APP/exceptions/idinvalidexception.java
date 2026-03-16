package com.example.SKYCART_ECOMMERSE_APP.exceptions;

import org.springframework.http.HttpHeaders;

public class idinvalidexception extends RuntimeException {
    public idinvalidexception(String message) {
        super(message);
    }

    public String getmessage() {
        return "id is invalid";
    }
}
