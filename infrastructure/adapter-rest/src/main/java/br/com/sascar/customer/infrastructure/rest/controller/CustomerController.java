package br.com.sascar.customer.infrastructure.rest.controller;


import br.com.sascar.customer.domain.model.Customer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface CustomerController {

    @GetMapping("/customers")
    ResponseEntity<List<Customer>> getCustomers();

    @PostMapping("/customers")
    ResponseEntity<Void> add(@RequestBody Customer customer);

    @DeleteMapping("/customers")
    ResponseEntity<Void> remove(@RequestBody Customer customer);

    @GetMapping("/customers/{uuid}")
    ResponseEntity<Customer> getById(@PathVariable String uuid);
}
