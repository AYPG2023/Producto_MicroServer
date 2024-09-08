package com.ap.Productos.microserver.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document(collection = "product")
@Data
public class Product {

    @Id
    private String id;
    private String nombre;
    private double precio;
    private int strock;
}