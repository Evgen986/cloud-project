package com.aston.storage.controller;

import com.aston.storage.exception.ErrorResponse;
import com.aston.storage.exception.ProductNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * Контроллер обработки исключений.
 */
@RestControllerAdvice
public class AdviceController {

    @ExceptionHandler(ProductNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ErrorResponse handleProductNotFoundException(ProductNotFoundException e) {
        return new ErrorResponse(e.getMessage());
    }

}
