package br.com.sascar.customer.application.service.adapter;

import br.com.sascar.customer.application.service.api.CustomerService;
import br.com.sascar.customer.domain.model.Customer;
import br.com.sascar.customer.domain.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceAdapter implements CustomerService {

    private CustomerRepository customerRepository;

    @Autowired
    public CustomerServiceAdapter(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void add(Customer customer) {
        customerRepository.add(customer);
    }

    public void remove(Customer customer) {
        customerRepository.remove(customer);
    }

    public List<Customer> getCustomers() {
        return customerRepository.getCustomers();
    }

    public Customer getById(String uuid) {
        return customerRepository.getById(uuid);
    }
}
