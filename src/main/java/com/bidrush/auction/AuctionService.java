package com.bidrush.auction;

import com.bidrush.catalog.Product;
import com.bidrush.catalog.ProductService;
import org.springframework.stereotype.Service;

@Service
public class AuctionService {
    private final ProductService productService;
    public AuctionService(ProductService productService) {
        this.productService = productService;
    }
    public String previewAuction(String productId){
        Product product=productService.getProduct(productId);
        return "Auction ready for:"+product.name();
    }
}
