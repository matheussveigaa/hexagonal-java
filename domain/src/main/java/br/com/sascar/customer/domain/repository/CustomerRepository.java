package br.com.sascar.customer.domain.repository;

import br.com.sascar.customer.domain.model.Customer;

import java.util.List;

public interface CustomerRepository {

    void add(Customer customer);

    void remove(Customer customer);

    List<Customer> getCustomers();

    Customer getById(String uuid);
}
