package com.aston.storage.exception;

/**
 * Исключение, когда товар не найден.
 */
public class ProductNotFoundException extends RuntimeException{
    public ProductNotFoundException(String message) {
        super(message);
    }
}
