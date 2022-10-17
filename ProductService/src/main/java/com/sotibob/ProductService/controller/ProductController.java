package com.sotibob.ProductService.controller;

@org.springframework.web.bind.annotation.RestController
@org.springframework.web.bind.annotation.RequestMapping("/product")
public class ProductController {

    @org.springframework.beans.factory.annotation.Autowired
    private com.sotibob.ProductService.service.ProductService productService;

    @org.springframework.web.bind.annotation.GetMapping("/")
    public java.util.List<com.sotibob.ProductService.entity.Product> selectProducts() {
        return productService.selectProducts();
    }

    @org.springframework.web.bind.annotation.GetMapping("/{id}")
    public com.sotibob.ProductService.entity.Product selectProductById(@org.springframework.web.bind.annotation.PathVariable("id") int Id) {
        return productService.selectProductById(Id);
    }

    @org.springframework.web.bind.annotation.PostMapping("/add")
    public com.sotibob.ProductService.entity.Product addProduct(@org.springframework.web.bind.annotation.RequestBody com.sotibob.ProductService.entity.Product p) {
        return productService.addProduct(p);
    }

    @org.springframework.web.bind.annotation.PutMapping("/update/{id}")
    public com.sotibob.ProductService.entity.Product updateProduct(@org.springframework.web.bind.annotation.PathVariable("id") int Id, @org.springframework.web.bind.annotation.RequestBody com.sotibob.ProductService.entity.Product p) {
        return productService.updateProduct(Id, p);
    }

    @org.springframework.web.bind.annotation.DeleteMapping("/delete/{id}")
    public java.util.List<com.sotibob.ProductService.entity.Product> deleteProduct(@org.springframework.web.bind.annotation.PathVariable("id") int Id) {
        return productService.deleteProduct(Id);
    }
}
