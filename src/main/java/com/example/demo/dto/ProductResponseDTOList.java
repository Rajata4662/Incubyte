package com.example.demo.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
@Getter
@Setter
public class ProductResponseDTOList {

    private ArrayList<ProdcutResponseDTO> productResponseDTO;


    public ProductResponseDTOList() {
        this.productResponseDTO = new ArrayList<>();
    }
}
