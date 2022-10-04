package com.codewithcaleb.spring_reactive_e1.repositories;


import com.codewithcaleb.spring_reactive_e1.model.Product;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface ProductRepository  extends ReactiveCrudRepository <Product,Integer> {
}
