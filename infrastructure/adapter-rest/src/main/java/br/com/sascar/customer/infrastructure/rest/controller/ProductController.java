package br.com.sascar.customer.infrastructure.rest.controller;


import br.com.sascar.customer.domain.model.Product;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface ProductController {

    @GetMapping("/product")
    ResponseEntity<List<Product>> getProducts();

    @PostMapping("/product")
    ResponseEntity<Void> addProduct(@RequestBody Product product);

    @DeleteMapping("/product")
    ResponseEntity<Void> removeProduct(@RequestBody Product product);

    @GetMapping("/product/{productId}")
    ResponseEntity<Product> getProductById(@PathVariable Integer productId);
}
