package org.maxodiscount.controller;

import org.maxodiscount.generated.api.ProductsApi;
import org.maxodiscount.generated.model.Product;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/product")
public class ProductController implements ProductsApi {

    @Override
    public ResponseEntity<Product> getProduct(Integer id) {
        var product = new Product();
        product.setId(UUID.randomUUID());
        product.setName("product name");
        product.setDescription("product description");
        product.setPrice(10.00);
        return ResponseEntity.ok(product);
    }

    @Override
    public ResponseEntity<List<Product>> getProducts() {
        var listProduits = new ArrayList<Product>();
        var product = new Product();
        product.setId(UUID.randomUUID());
        product.setName("product name");
        product.setDescription("product description");
        product.setPrice(10.00);
        listProduits.add(product);
        return ResponseEntity.ok(listProduits);
    }
}
