package com.aston.storage.dto;

import java.math.BigDecimal;

/**
 * Объект передачи данных.
 * @param productId идентификатор товара.
 * @param title наименование товара.
 * @param balance остаток товара.
 * @param price стоимость товара.
 */
public record ProductDto(Long productId, String title, int balance, BigDecimal price) {
}
