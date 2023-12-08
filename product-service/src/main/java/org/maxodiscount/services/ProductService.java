package org.maxodiscount.services;

import org.maxodiscount.generated.model.Product;

import java.util.List;
import java.util.UUID;

public interface ProductService {

    List<Product> getAllProducts();
    Product getProduct(UUID id);
    void createProduct(Product product);
    void updateProduct(Product product);
    void deleteProduct(UUID id);
}
