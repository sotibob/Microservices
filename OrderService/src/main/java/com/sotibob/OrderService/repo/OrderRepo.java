package com.sotibob.OrderService.repo;

@org.springframework.stereotype.Repository
public interface OrderRepo extends org.springframework.data.jpa.repository.JpaRepository<com.sotibob.OrderService.entity.Order, Integer> {
    com.sotibob.OrderService.entity.Order findByOrderId(int id);
}
