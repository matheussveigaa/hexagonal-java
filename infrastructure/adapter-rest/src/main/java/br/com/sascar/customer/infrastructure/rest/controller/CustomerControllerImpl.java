package br.com.sascar.customer.infrastructure.rest.controller;

import br.com.sascar.customer.application.service.api.CustomerService;
import br.com.sascar.customer.domain.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerControllerImpl implements CustomerController {

    private CustomerService customerService;

    @Autowired
    public CustomerControllerImpl(CustomerService customerService) {
        this.customerService = customerService;
    }

    public ResponseEntity<List<Customer>> getCustomers() {
        return new ResponseEntity<List<Customer>>(customerService.getCustomers(), HttpStatus.OK);
    }

    public ResponseEntity<Void> add(Customer customer) {
        customerService.add(customer);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> remove(Customer customer) {
        customerService.remove(customer);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Customer> getById(String uuid) {
        return new ResponseEntity<Customer>(customerService.getById(uuid), HttpStatus.OK);
    }
}
