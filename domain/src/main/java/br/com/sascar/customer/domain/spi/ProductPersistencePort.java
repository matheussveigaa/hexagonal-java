package br.com.sascar.customer.domain.spi;

import br.com.sascar.customer.domain.model.Product;

import java.util.List;

public interface ProductPersistencePort {

    void addProduct(Product product);

    void removeProduct(Product product);

    List<Product> getProducts();

    Product getProductById(Integer productId);
}
