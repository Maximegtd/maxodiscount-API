package org.maxodiscount.repository;

import org.maxodiscount.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, UUID> {

    @Override
    List<ProductEntity> findAll();

    @Override
    Optional<ProductEntity> findById(UUID integer);
}
