package com.sotibob.ProductService.entity;

@javax.persistence.Entity
@lombok.Data
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
public class Product {

    @javax.persistence.Id
    @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.AUTO)
    private int productId;
    private String productName;
    private String productBrand;
    private double price;
}