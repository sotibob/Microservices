package com.sotibob.CustomerService.entity;

@javax.persistence.Entity
@lombok.Data
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
public class Customer {

    @javax.persistence.Id
    @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.AUTO)
    private int customerId;
    private String firstName;
    private String lastName;
    private long phone;
    private String street;
    private String city;
    private String state;
    private String country;
    private int zip;
}
