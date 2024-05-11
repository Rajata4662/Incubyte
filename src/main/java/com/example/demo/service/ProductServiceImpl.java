package com.example.demo.service;

import com.example.demo.Client.FakeStoreAPIClient;
import com.example.demo.Mapping.Mapping;
import com.example.demo.dto.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;

import static java.util.Objects.isNull;

@Service
public class ProductServiceImpl implements ProductService  {

@Autowired
  private  RestTemplateBuilder restTemplateBuilder;

@Autowired
private FakeStoreAPIClient fakeStoreAPIClient;


    public ProductResponseDTOList getAllProducts() {

        String getAllProductUrl = "https://fakestoreapi.com/products/";
        RestTemplate restTemplate = restTemplateBuilder.build();
       ProductResponseDTOList productRespsone1 = new ProductResponseDTOList();
        ResponseEntity<ProdcutResponseDTO[]> productRespsone = restTemplate.getForEntity(getAllProductUrl, ProdcutResponseDTO[].class);

        for(ProdcutResponseDTO productResponseDto: productRespsone.getBody()) {


            productRespsone1.getProductResponseDTO().add(productResponseDto);
        }


        return productRespsone1;
    }


    /*public ProdcutResponseDTO createProduct(ProductRequestDTO productRequestDTO) {
        String getAllProductUrl = "https://fakestoreapi.com/products/";
        RestTemplate restTemplate = restTemplateBuilder.build();
        ResponseEntity<ProdcutResponseDTO> productRespsone = restTemplate.postForEntity(getAllProductUrl, productRequestDTO,ProdcutResponseDTO.class);
        return productRespsone.getBody();


    }
    */



    public ProdcutResponseDTO getAllProducts(int id) {

        String getAllProductUrl = "https://fakestoreapi.com/products/" +id;
        RestTemplate restTemplate = restTemplateBuilder.build();
        ResponseEntity<ProdcutResponseDTO> productRespsone = restTemplate.getForEntity(getAllProductUrl, ProdcutResponseDTO.class);
        if(isNull(productRespsone))
        {
            throw new ProductNotFoundException("Product not found with id : " + id);
        }
        return productRespsone.getBody();
    }


    public boolean  deleteProduct(int id) {

        String getAllProductUrl = "https://fakestoreapi.com/products/" +id;
        RestTemplate restTemplate = restTemplateBuilder.build();
        restTemplate.delete(getAllProductUrl);
        return true;
    }

    public ProdcutResponseDTO createProduct(ProductRequestDTO productRequestDTO)
    {

        FakeStoreProductRequestDTO fakeStoreProductRequestDTO = Mapping.converter(productRequestDTO);
     FakeStoreProductResponseDTO fakeStoreProductResponseDTO =  fakeStoreAPIClient.createProduct(fakeStoreProductRequestDTO);

     return Mapping.mapping(fakeStoreProductResponseDTO);


    }


    public ProdcutResponseDTO getAllProducts() {

        String getAllProductUrl = "https://fakestoreapi.com/products/" +id;
        RestTemplate restTemplate = restTemplateBuilder.build();
        ResponseEntity<ProdcutResponseDTO> productRespsone = restTemplate.getForEntity(getAllProductUrl, ProdcutResponseDTO.class);
        return productRespsone.getBody();
    }




    }






