package org.maxodiscount.services.impl;

import org.maxodiscount.generated.model.Product;
import org.maxodiscount.mapper.ProductMapper;
import org.maxodiscount.repository.ProductRepository;
import org.maxodiscount.services.ProductService;

import java.util.List;
import java.util.UUID;

public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;


    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> getAllProducts() {
        var listProduits = productRepository.findAll();
        return listProduits.stream().map(ProductMapper::mapEntityToDto).toList();
    }

    @Override
    public Product getProduct(UUID id) {
        var product = productRepository.findById(id);
        if(product.isEmpty()) throw new RuntimeException("Product not found");
        return ProductMapper.mapEntityToDto(product.get());
    }

    @Override
    public void createProduct(Product product) {
        var productEntity = ProductMapper.mapDtoToEntity(product);
        productRepository.save(productEntity);
    }

    @Override
    public void updateProduct(Product product) {
        var productEntity = productRepository.findById(product.getId());
        if(productEntity.isEmpty()) throw new RuntimeException("Impossible de mettre à jour un produit inexistant");
        productRepository.save(ProductMapper.mapDtoToEntity(product));
    }

    @Override
    public void deleteProduct(UUID id) {
        var productEntity = productRepository.findById(id);
        if(productEntity.isEmpty()) throw new RuntimeException("Impossible de supprimer un produit inexistant");
        productRepository.delete(productEntity.get());
    }
}
