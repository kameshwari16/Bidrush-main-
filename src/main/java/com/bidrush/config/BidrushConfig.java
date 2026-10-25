package com.bidrush.config;

import com.bidrush.auction.AuctionService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BidrushConfig {
    @Bean
    CommandLineRunner demo(
            AuctionService auctionService,
            ApplicationContext applicationContext
    ){
        return args -> {
//            System.out.println(auctionService.previewAuction("p-101"));
//            System.out.println("Product Service bean exists:"+applicationContext.containsBean("productService"));
//            System.out.println(
//                    "AuctionService exists: " +
//                            applicationContext.containsBean("auctionService")
//            );
//
//            System.out.println(
//                    "ProductService exists: " +
//                            applicationContext.containsBean("productService")
//            );
//
//            System.out.println(
//                    "Repository exists: " +
//                            applicationContext.containsBean("inMemoryProductRepository")
//            );
            System.out.println(
                    "3. CommandLineRunner executed"
            );
        };
    }
}
