package com.aston.storage.dao;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

/**
 * Сущность товара.
 */
@Entity
@Table(name = "t_product")
@SecondaryTable(
        name = "t_product_balance",
        pkJoinColumns = @PrimaryKeyJoinColumn(name = "product_id"))
@Data
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;
    @Column(name = "c_title")
    private String title;
    @Column(table = "t_product_balance")
    private int balance;
    @Column(table = "t_product_balance")
    private BigDecimal price;

}
