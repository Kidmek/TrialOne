package com.example.projectone;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptHandler {

    @ExceptionHandler(RuntimeException.class)
    @ResponseStatus(HttpStatus.ALREADY_REPORTED)
    public String handleException(RuntimeException exception){
        return exception.getMessage();
    }
}
