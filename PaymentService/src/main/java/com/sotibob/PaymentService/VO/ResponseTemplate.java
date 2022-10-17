package com.sotibob.PaymentService.VO;

@lombok.Data
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
public class ResponseTemplate {
    private com.sotibob.PaymentService.entity.Payment payment;
    private Customer customer;
}
