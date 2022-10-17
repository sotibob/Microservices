package com.sotibob.ProductService.service;

@org.springframework.stereotype.Service
public class ProductService {

    @org.springframework.beans.factory.annotation.Autowired
    private com.sotibob.ProductService.repo.ProductRepo productRepo;

    public java.util.List<com.sotibob.ProductService.entity.Product> selectProducts() {
        return productRepo.findAll();
    }

    public com.sotibob.ProductService.entity.Product selectProductById(int id) {
        return productRepo.findByProductId(id);
    }

    public com.sotibob.ProductService.entity.Product addProduct(com.sotibob.ProductService.entity.Product p) {
        return productRepo.save(p);
    }

    public com.sotibob.ProductService.entity.Product updateProduct(int id, com.sotibob.ProductService.entity.Product p) {
        com.sotibob.ProductService.entity.Product pro = productRepo.findByProductId(id);
        pro.setProductName(p.getProductName());
        pro.setProductBrand(p.getProductBrand());
        pro.setPrice(p.getPrice());
        return productRepo.save(pro);
    }

    public java.util.List<com.sotibob.ProductService.entity.Product> deleteProduct(int id) {
        com.sotibob.ProductService.entity.Product pro = productRepo.findByProductId(id);
        productRepo.delete(pro);
        return selectProducts();
    }
}
