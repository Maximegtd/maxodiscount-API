package org.maxodiscount.controller;

import org.maxodiscount.generated.api.ProductsApi;
import org.maxodiscount.generated.model.Product;
import org.maxodiscount.services.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/product")
public class ProductController implements ProductsApi {

    ProductService productService;

    @Override
    public ResponseEntity<Product> getProduct(UUID id) {
        var product = productService.getProduct(id);
        return ResponseEntity.ok(product);
    }

    @Override
    public ResponseEntity<List<Product>> getProducts() {
        var listProduits = productService.getAllProducts();
        return ResponseEntity.ok(listProduits);
    }

    @Override
    public ResponseEntity<Void> updateProduct(Product product) {
        productService.updateProduct(product);
        return ResponseEntity.ok().build();
    }

    @Override
    public ResponseEntity<Void> deleteProduct(UUID id) {
        productService.deleteProduct(id);
        return ResponseEntity.ok().build();
    }
}
