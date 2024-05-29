package com.aston.storage.service;

import com.aston.storage.dto.ProductDto;

import java.util.List;

public interface ProductService {

    ProductDto getProductById(Long id);

    List<ProductDto> getProducts();
}
