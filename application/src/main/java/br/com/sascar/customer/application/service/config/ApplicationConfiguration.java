package br.com.sascar.customer.application.service.config;

import br.com.sascar.customer.application.service.adapter.ProductServiceAdapter;
import br.com.sascar.customer.application.service.api.ProductService;
import br.com.sascar.customer.domain.spi.ProductPersistencePort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfiguration {

    @Bean
    public ProductService getProductService(ProductPersistencePort productPersistencePort) {
        return new ProductServiceAdapter(productPersistencePort);
    }
}
