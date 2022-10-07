package com.codewithcaleb.spring_reactive_e1.service;

import com.codewithcaleb.spring_reactive_e1.model.Product;
import com.codewithcaleb.spring_reactive_e1.repositories.ProductRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.time.Duration;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {

        this.productRepository = productRepository;
    }

    public Flux<Product> getProducts(){
        return productRepository.findAll().delayElements(Duration.ofSeconds(5));
    }
}
