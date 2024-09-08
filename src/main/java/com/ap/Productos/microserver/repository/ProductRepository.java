package com.ap.Productos.microserver.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ap.Productos.microserver.entity.Product;

public interface ProductRepository extends MongoRepository<Product, String> {

}

