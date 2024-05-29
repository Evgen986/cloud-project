package com.aston.storage2.exception;

/**
 * Исключение, когда товар не найден.
 */
public class ProductNotFoundException extends RuntimeException{
    public ProductNotFoundException(String message) {
        super(message);
    }
}
