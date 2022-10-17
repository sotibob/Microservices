package com.sotibob.OrderService.entity;

@javax.persistence.Entity
@lombok.Data
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
public class Order {

    @javax.persistence.Id
    @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.AUTO)
    private int orderId;
    private String orderDate;
    @javax.persistence.ElementCollection
    private java.util.List<Integer> productIds;
    private int paymentId;
}
