package com.example.demo.controller.ControllerAdvice;


import com.example.demo.controller.ControllerAdvice.ControllerAdvice;
import com.example.demo.dto.ErrorResponseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
class GlobalControllerAdvice {


    @ExceptionHandler(value = ProductNotFoundException.class)
    public ResponseEntity<ErrorResponseDTO> ProductNotFoundException(Exception ex)
    {
        ErrorResponseDTO errorResponse = new ErrorResponseDTO();
        errorResponse.setMessage(ex.getMessage());
        errorResponse.setMessageCode("404");
        String exceptionResponse = "error"+ex.getMessage() + ".code:" + HttpStatus.INTERNAL_SERVER_ERROR;
        return ResponseEntity.ok(errorResponse);

    }

}
