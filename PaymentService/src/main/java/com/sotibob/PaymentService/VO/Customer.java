package com.sotibob.PaymentService.VO;

@lombok.Data
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
public class Customer {
    private long phone;
    private String street;
    private String city;
    private String state;
    private String country;
    private int zip;
}
