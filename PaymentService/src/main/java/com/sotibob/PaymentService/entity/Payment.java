package com.sotibob.PaymentService.entity;

@javax.persistence.Entity
@lombok.Data
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
public class Payment {
    @javax.persistence.Id
    @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.AUTO)
    private int paymentId;
    private String cardHolderName;
    private long cardNumber;
    private int cvv;
    private int customerId;
}
