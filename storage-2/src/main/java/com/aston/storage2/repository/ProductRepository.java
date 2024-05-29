package com.aston.storage2.repository;

import com.aston.storage2.dao.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Репозиторий для работы с товарами.
 */
public interface ProductRepository extends JpaRepository<ProductEntity, Long> {

}
