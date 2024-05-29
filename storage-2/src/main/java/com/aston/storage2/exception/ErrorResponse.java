package com.aston.storage2.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * Объект ответа об ошибках.
 */
@Getter
@Setter
@AllArgsConstructor
public class ErrorResponse {
    private String message;
}
