package br.com.sascar.customer.infrastructure.data.repository;

import br.com.sascar.customer.domain.model.Customer;
import br.com.sascar.customer.domain.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CustomerRepositoryImpl implements CustomerRepository {

    private MongoTemplate mongoTemplate;

    @Autowired
    public CustomerRepositoryImpl(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    public void add(Customer customer) {
        mongoTemplate.save(customer, "customers");
    }

    public void remove(Customer customer) {
        mongoTemplate.remove(customer, "customers");
    }

    public List<Customer> getCustomers() {
        return mongoTemplate.findAll(Customer.class, "customers");
    }

    public Customer getById(String uuid) {
        return mongoTemplate.findById(uuid, Customer.class, "customers");
    }
}
