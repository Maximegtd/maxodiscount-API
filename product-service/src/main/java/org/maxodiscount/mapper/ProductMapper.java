package org.maxodiscount.mapper;

import org.maxodiscount.entity.ProductEntity;
import org.maxodiscount.generated.model.Product;

public class ProductMapper {

    public static ProductEntity mapDtoToEntity(Product product) {
        ProductEntity productEntity = new ProductEntity();
        productEntity.setId(product.getId());
        productEntity.setName(product.getName());
        productEntity.setDescription(product.getDescription());
        productEntity.setPrice(product.getPrice());
        return productEntity;
    }

    public static Product mapEntityToDto(ProductEntity productEntity){
        Product product = new Product();
        product.setId(productEntity.getId());
        product.setName(productEntity.getName());
        product.setDescription(productEntity.getDescription());
        product.setPrice(productEntity.getPrice());
        return product;
    }
}
