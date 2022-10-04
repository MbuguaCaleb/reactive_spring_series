package com.codewithcaleb.spring_reactive_e1.controllers;


import com.codewithcaleb.spring_reactive_e1.model.Product;
import com.codewithcaleb.spring_reactive_e1.service.ProductService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }


    //Without adding event mediaType stream my endpoints will still be non-reactive
    //I will get everything at the end instead of sequencially since i am in a stream
    //It means that the request will wait for the whole duration so as to return responses
    @GetMapping(value = "/product", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<Product> getProduct(){
        return productService.getProducts();
    }


}
