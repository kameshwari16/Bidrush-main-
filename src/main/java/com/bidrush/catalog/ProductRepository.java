package com.bidrush.catalog;

import java.util.Optional;

public interface ProductRepository {
    Optional<Product> findById(String id);
}
