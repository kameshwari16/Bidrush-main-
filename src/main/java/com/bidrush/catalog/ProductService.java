package com.bidrush.catalog;

import com.bidrush.auction.AuctionService;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    private final ProductRepository productRepository;
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product getProduct(String id) {
        return productRepository.findById(id)
                .orElseThrow(()->
                        new IllegalArgumentException("Product not found!"+id));
    }
}
