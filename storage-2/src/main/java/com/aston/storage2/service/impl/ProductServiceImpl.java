package com.aston.storage2.service.impl;


import com.aston.storage2.dao.ProductEntity;
import com.aston.storage2.dto.ProductDto;
import com.aston.storage2.dto.ProductMapper;
import com.aston.storage2.exception.ProductNotFoundException;
import com.aston.storage2.repository.ProductRepository;
import com.aston.storage2.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Сервис работы с товарами.
 */
@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductMapper productMapper;
    private final ProductRepository productRepository;

    /**
     * Получение всех товаров.
     * @return список товаров в представлении объектов передачи данных.
     */
    @Override
    public List<ProductDto> getProducts() {
        return productMapper.toDto(productRepository.findAll());
    }

    /**
     * Получение товара по идентификатору.
     * @param id идентификатор товара.
     * @return объект передачи данных с найденным товаром.
     * @throws ProductNotFoundException исключение при отсутствии товара.
     */
    @Override
    public ProductDto getProductById(Long id) throws ProductNotFoundException {
        ProductEntity productEntity = productRepository.findById(id)
                .orElseThrow(() ->
                        new ProductNotFoundException(
                                "Product by %d not found!".formatted(id)));
        return productMapper.toDto(productEntity);
    }
}
