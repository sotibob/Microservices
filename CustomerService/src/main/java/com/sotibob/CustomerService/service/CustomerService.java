package com.sotibob.CustomerService.service;

@org.springframework.stereotype.Service
public class CustomerService {

    @org.springframework.beans.factory.annotation.Autowired
    private com.sotibob.CustomerService.repo.CustomerRepo customerRepo;


    public java.util.List<com.sotibob.CustomerService.entity.Customer> selectCustomers() {
        return customerRepo.findAll();
    }

    public com.sotibob.CustomerService.entity.Customer selectCustomerById(int id) {
        return customerRepo.findByCustomerId(id);
    }

    public com.sotibob.CustomerService.entity.Customer addCustomer(com.sotibob.CustomerService.entity.Customer c) {
        return customerRepo.save(c);
    }

    public com.sotibob.CustomerService.entity.Customer updateCustomer(int id, com.sotibob.CustomerService.entity.Customer c) {
        com.sotibob.CustomerService.entity.Customer cus = customerRepo.findByCustomerId(id);
        cus.setFirstName(c.getFirstName());
        cus.setLastName(c.getLastName());
        cus.setPhone(c.getPhone());
        cus.setStreet(c.getStreet());
        cus.setCity(c.getCity());
        cus.setState(c.getState());
        cus.setCountry(c.getCountry());
        cus.setZip(c.getZip());
        return customerRepo.save(cus);
    }

    public java.util.List<com.sotibob.CustomerService.entity.Customer> deleteCustomer(int id) {
        com.sotibob.CustomerService.entity.Customer cus = customerRepo.findByCustomerId(id);
        customerRepo.delete(cus);
        return selectCustomers();
    }
}
