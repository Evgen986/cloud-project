package com.aston.storage.dto;

import com.aston.storage.dao.ProductEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

/**
 * Интерфейс маппинга товаров.
 */
@Mapper(componentModel = "spring")
public interface ProductMapper extends Mappable<ProductEntity, ProductDto>{

    @Override
    @Mapping(source = "productId", target = "productId")
    ProductDto toDto(ProductEntity entity);

    @Override
    @Mapping(source = "productId", target = "productId")
    List<ProductDto> toDto(List<ProductEntity> entity);

    @Override
    @Mapping(source = "productId", target = "productId")
    ProductEntity toEntity(ProductDto dto);

    @Override
    @Mapping(source = "productId", target = "productId")
    List<ProductEntity> toEntity(List<ProductDto> dtos);
}
