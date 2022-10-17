package com.sotibob.PaymentService.repo;

@org.springframework.stereotype.Repository
public interface PaymentRepo extends org.springframework.data.jpa.repository.JpaRepository<com.sotibob.PaymentService.entity.Payment, Integer> {

    com.sotibob.PaymentService.entity.Payment findByPaymentId(int id);
}
