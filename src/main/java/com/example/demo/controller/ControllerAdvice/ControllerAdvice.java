package com.example.demo.controller.ControllerAdvice;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ControllerAdvice {


    @ExceptionHandler(value = NullPointerException.class)
    public ResponseEntity<String> handleNullPointerexception(Exception ex)
    {
String exceptionResponse = "error"+ex.getMessage() + ".code:" + HttpStatus.INTERNAL_SERVER_ERROR;
 return ResponseEntity.ok(exceptionResponse);

    }

}
