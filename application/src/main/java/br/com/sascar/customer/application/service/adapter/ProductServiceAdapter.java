package br.com.sascar.customer.application.service.adapter;

import br.com.sascar.customer.application.service.api.ProductService;
import br.com.sascar.customer.domain.model.Product;
import br.com.sascar.customer.domain.spi.ProductPersistencePort;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProductServiceAdapter implements ProductService {

    private ProductPersistencePort productPersistencePort;

    @Autowired
    public ProductServiceAdapter(ProductPersistencePort productPersistencePort) {
        this.productPersistencePort = productPersistencePort;
    }

    @Override
    public void addProduct(Product product) {
        productPersistencePort.addProduct(product);
    }

    @Override
    public void removeProduct(Product product) {
        productPersistencePort.removeProduct(product);
    }

    @Override
    public List<Product> getProducts() {
        return productPersistencePort.getProducts();
    }

    @Override
    public Product getProductById(Integer productId) {
        return productPersistencePort.getProductById(productId);
    }
}
