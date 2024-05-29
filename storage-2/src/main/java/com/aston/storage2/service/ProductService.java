package com.aston.storage2.service;


import com.aston.storage2.dto.ProductDto;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ProductService {

    ProductDto getProductById(Long id);

    List<ProductDto> getProducts();
}
