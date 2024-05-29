package com.aston.storage.repository;

import com.aston.storage.dao.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

/**
 * Репозиторий для работы с товарами.
 */
public interface ProductRepository extends JpaRepository<ProductEntity, Long> {

}
