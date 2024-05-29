package com.aston.webclient.client;

import com.aston.webclient.request.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "storage-2")
public interface Storage2ClientApi {

    @GetMapping("/api/v-1/product")
    List<Product> getProducts();

}
