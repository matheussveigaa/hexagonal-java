package br.com.sascar.customer.application.service;

import br.com.sascar.customer.application.service.adapter.CustomerServiceAdapter;
import br.com.sascar.customer.application.service.api.CustomerService;
import br.com.sascar.customer.domain.repository.CustomerRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfiguration {

/*    @Bean
    public CustomerService getCustomerService(CustomerRepository customerRepository) {
        return new CustomerServiceAdapter(customerRepository);
    }*/
}
