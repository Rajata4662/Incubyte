package com.example.demo.service;

import com.example.demo.dto.ProdcutResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ProductServiceImpl implements ProductService  {

@Autowired
  private  RestTemplateBuilder restTemplateBuilder;
    public ProdcutResponseDTO getAllProducts(int id) {

        String getAllProductUrl = "https://fakestoreapi.com/products/" +id;
        RestTemplate restTemplate = restTemplateBuilder.build();
        ResponseEntity<ProdcutResponseDTO> productRespsone = restTemplate.getForEntity(getAllProductUrl, ProdcutResponseDTO.class);
        return productRespsone.getBody();
    }









    }






