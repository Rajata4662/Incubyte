package com.example.demo.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;
@Getter
@Setter
public class ProdcutResponseDTO {


    private UUID id1;
    private String title;


    private double price;

    private String category;

    private String description;

    private String image;

}
