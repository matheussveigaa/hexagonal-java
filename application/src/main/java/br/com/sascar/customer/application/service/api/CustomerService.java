package br.com.sascar.customer.application.service.api;

import br.com.sascar.customer.domain.model.Customer;

import java.util.List;

public interface CustomerService {

    void add(Customer customer);

    void remove(Customer customer);

    List<Customer> getCustomers();

    Customer getById(String uuid);
}
