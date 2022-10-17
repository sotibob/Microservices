package com.sotibob.CustomerService.repo;

@org.springframework.stereotype.Repository
public interface CustomerRepo extends org.springframework.data.jpa.repository.JpaRepository<com.sotibob.CustomerService.entity.Customer, Integer> {

    com.sotibob.CustomerService.entity.Customer findByCustomerId(int id);
}
