package com.bidrush.config;

import com.bidrush.catalog.ProductService;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class BeanLifecycleProbe {
    private final ProductService productService;
    BeanLifecycleProbe(ProductService productService) {
        this.productService = productService;
        System.out.println("1. Constructor executed");
    }
    @PostConstruct
    public void intialize() {
        System.out.println("2. @PostConstruct executed");
    }
    @PreDestroy
    public void destroy() {
        System.out.println("4. @PreDestroy executed");
    }
}
