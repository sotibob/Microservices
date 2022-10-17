package com.sotibob.OrderService.VO;

@lombok.Data
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
public class ResponseTemplate {
    private Payment payment;
    private com.sotibob.OrderService.entity.Order order;
    private java.util.List<Product> productList;
}
