package com.aston.webclient.request;

import java.math.BigDecimal;

public record Product(Long productId, String title, int balance, BigDecimal price) {
}
