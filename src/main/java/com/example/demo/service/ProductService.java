package com.example.demo.service;

import com.example.demo.dto.ProdcutResponseDTO;
import com.example.demo.dto.ProductRequestDTO;
import com.example.demo.dto.ProductResponseDTOList;

public interface ProductService{

    public ProdcutResponseDTO getAllProducts(int id);


    public ProductResponseDTOList getAllProducts();

  public ProdcutResponseDTO createProduct(ProductRequestDTO productRequestDTO);

  public boolean deleteProduct(int id);



}
