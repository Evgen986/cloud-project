package com.aston.webclient.service.impl;

import com.aston.webclient.client.Storage2ClientApi;
import com.aston.webclient.client.StorageClientApi;
import com.aston.webclient.request.Product;
import com.aston.webclient.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final StorageClientApi storageClientApi;
    private final Storage2ClientApi storage2ClientApi;

    /**
     * Получение списка товаров от удаленных api.
     * @return список товаров.
     */
    @Override
    public List<Product> getProductsStorageOne() {
        return storageClientApi.getProducts();
    }

    /**
     * Получение товаров из второго хранилища.
     * @return список товаров.
     */
    @Override
    public List<Product> getProductsStorageTwo() {
        return storage2ClientApi.getProducts();
    }
}
