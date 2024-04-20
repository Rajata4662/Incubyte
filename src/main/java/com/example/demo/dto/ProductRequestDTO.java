package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductRequestDTO {


    private int id;

    private String title;


    private double price;

    private String category;

    private String description;

    private String image;

}
