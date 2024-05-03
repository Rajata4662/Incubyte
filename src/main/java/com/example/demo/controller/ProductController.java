package com.example.demo.controller;

import com.example.demo.dto.ProductRequestDTO;
import com.example.demo.dto.ProductResponseDTOList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.demo.dto.ProdcutResponseDTO;
import com.example.demo.service.ProductService;

import java.util.UUID;

@RestController
public class ProductController {

    @Autowired
    ProductService productservice;

    @GetMapping("/products/{id}")

    public ResponseEntity getAllproducts(@PathVariable("id") int id) {
       /* ProdcutResponseDTO p1 = new ProdcutResponseDTO();
        UUID id1 = UUID.fromString("d824e1d9-4993-4936-ab09-b99bb90a2f5d");
        p1.setId1(id1);
        p1.setTitle("Hello");
        p1.setPrice(600000);
        p1.setCategory("Iphone");
        p1.setImage("www.google.com/images/iphone");
        p1.setDescription("Expensive Phone");


        ProdcutResponseDTO p2 = new ProdcutResponseDTO();
        UUID id2 = UUID.fromString("c3241abe-ae78-4579-938f-27fd69ca6231");
        p2.setId1(id2);
        p2.setTitle("Hello");
        p2.setPrice(700000);
        p2.setCategory("Mackbook");
        p2.setImage("www.google.com/images/mackbook");
        p2.setDescription("Expensive mackboook hein");*/

        ProdcutResponseDTO products = productservice.getAllProducts(id);
        return ResponseEntity.ok(products);
    }

    @GetMapping("/products/")

    public ResponseEntity getAllproducts() {

        ProductResponseDTOList products = productservice.getAllProducts();
        return ResponseEntity.ok(products);
    }


    @PostMapping("/products/")

    public ResponseEntity createProducts(@RequestBody ProductRequestDTO productRequestDTO) {

        ProdcutResponseDTO products = productservice.createProduct(productRequestDTO);
        return ResponseEntity.ok(products);
    }

    @DeleteMapping("/products/{id}")
    public ResponseEntity deleteProduct(@PathVariable("id") int id) {

        boolean result = productservice.deleteProduct(id);
        return ResponseEntity.ok(result);

    }
}







