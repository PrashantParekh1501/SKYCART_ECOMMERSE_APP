package com.example.SKYCART_ECOMMERSE_APP.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<?> handleRuntime(RuntimeException e){

        Map<String, Object> error = new HashMap<>();
        error.put("message", e.getMessage());
        error.put("status", HttpStatus.BAD_REQUEST.value());
        error.put("time", LocalDateTime.now());

        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }
}