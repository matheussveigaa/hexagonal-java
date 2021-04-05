package br.com.sascar.customer.crosscutting;

import br.com.sascar.customer.application.service.ApplicationConfiguration;
import br.com.sascar.customer.infrastructure.data.MongoDbConfiguration;
import br.com.sascar.customer.infrastructure.rest.controller.CustomerController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses = { MongoDbConfiguration.class, CustomerController.class, ApplicationConfiguration.class })
public class HexagonalDemoApplicationLauncher {
    public static void main(String[] args) {
        SpringApplication.run(HexagonalDemoApplicationLauncher.class, args);
    }
}
