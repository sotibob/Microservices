package com.sotibob.OrderService.VO;

@lombok.Data
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
public class Payment {
    private String cardHolderName;
    private long cardNumber;
    private int cvv;
    private int customerId;
}

