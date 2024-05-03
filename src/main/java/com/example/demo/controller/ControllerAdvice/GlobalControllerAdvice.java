package com.example.demo.controller.ControllerAdvice;


import com.example.demo.controller.ControllerAdvice.ControllerAdvice;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
class GlobalControllerAdvice {


    @ExceptionHandler(value = NullPointerException.class)
    public ResponseEntity<String> handleNullPointerexception(@org.jetbrains.annotations.NotNull Exception ex)
    {
        String exceptionResponse = "error"+ex.getMessage() + ".code:" + HttpStatus.INTERNAL_SERVER_ERROR;
        return ResponseEntity.ok(exceptionResponse);

    }

}
