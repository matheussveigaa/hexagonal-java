package br.com.sascar.customer.application.service.api;

import br.com.sascar.customer.domain.model.Product;

import java.util.List;

public interface ProductService {

    void addProduct(Product product);

    void removeProduct(Product product);

    List<Product> getProducts();

    Product getProductById(Integer productId);
}
