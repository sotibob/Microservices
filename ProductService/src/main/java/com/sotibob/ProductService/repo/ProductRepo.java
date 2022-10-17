package com.sotibob.ProductService.repo;

@org.springframework.stereotype.Repository
public interface ProductRepo extends org.springframework.data.jpa.repository.JpaRepository<com.sotibob.ProductService.entity.Product, Integer> {

    com.sotibob.ProductService.entity.Product findByProductId(int id);
}
