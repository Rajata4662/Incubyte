package com.example.demo.Mapping;

import com.example.demo.dto.FakeStoreProductRequestDTO;
import com.example.demo.dto.FakeStoreProductResponseDTO;
import com.example.demo.dto.ProdcutResponseDTO;
import com.example.demo.dto.ProductRequestDTO;

public class Mapping {


   public static ProdcutResponseDTO mapping(FakeStoreProductResponseDTO fakestoreResponseDTO) {

      ProdcutResponseDTO productResponse = new ProdcutResponseDTO();
      //productResponse.setId(fakestoreResponseDTO.getUUI());
      productResponse.setCategory(fakestoreResponseDTO.getCategory());
      productResponse.setDescription(fakestoreResponseDTO.getDescription());
      productResponse.setDescription(fakestoreResponseDTO.getDescription());
      productResponse.setTitle(fakestoreResponseDTO.getTitle());
      return productResponse;


   }

   public static FakeStoreProductRequestDTO converter(ProductRequestDTO productRequestDTO) {

      ProductRequestDTO productRequest = new  ProductRequestDTO();
      FakeStoreProductRequestDTO fakeStoreProductRequestDTO = new FakeStoreProductRequestDTO();
      //productResponse.setId(fakestoreResponseDTO.getUUI());
      fakeStoreProductRequestDTO.setCategory(productRequestDTO.getCategory());
      fakeStoreProductRequestDTO.setDescription(productRequestDTO.getDescription());
      fakeStoreProductRequestDTO.setDescription(productRequestDTO.getDescription());
      fakeStoreProductRequestDTO.setTitle(productRequestDTO.getTitle());
      return fakeStoreProductRequestDTO;


   }
   }









