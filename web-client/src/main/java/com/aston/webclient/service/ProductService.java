package com.aston.webclient.service;

import com.aston.webclient.request.Product;

import java.util.List;

public interface ProductService {

    List<Product> getProductsStorageOne();
    List<Product> getProductsStorageTwo();
}
