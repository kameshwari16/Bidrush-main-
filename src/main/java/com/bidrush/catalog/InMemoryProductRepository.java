package com.bidrush.catalog;

import org.springframework.stereotype.Repository;

import java.util.Map;
import java.util.Optional;

@Repository
public class InMemoryProductRepository implements ProductRepository {
    Map<String, Product> products=Map.of(
            "p-101",new Product("p-101","Wireless Headphones")
    );
    @Override
    public Optional<Product> findById(String id) {
        return Optional.ofNullable(products.get(id));
    }
}
