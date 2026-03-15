package com.example.SKYCART_ECOMMERSE_APP.exceptions;

public class customernotfoundexception extends RuntimeException {
    public customernotfoundexception(String message) {
        super(message);
    }

  public String getmessage() {
      return "customer not found for this age";
  }
}
