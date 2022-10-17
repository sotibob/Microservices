package com.sotibob.CustomerService.controller;


@org.springframework.web.bind.annotation.RestController
@org.springframework.web.bind.annotation.RequestMapping("/customer")
public class CustomerController {

    @org.springframework.beans.factory.annotation.Autowired
    private com.sotibob.CustomerService.service.CustomerService customerService;

    @org.springframework.web.bind.annotation.GetMapping("/")
    public java.util.List<com.sotibob.CustomerService.entity.Customer> selectCustomers() {
        return customerService.selectCustomers();
    }

    @org.springframework.web.bind.annotation.GetMapping("/{id}")
    public com.sotibob.CustomerService.entity.Customer selectCustomerById(@org.springframework.web.bind.annotation.PathVariable("id") int Id) {
        return customerService.selectCustomerById(Id);
    }

    @org.springframework.web.bind.annotation.PostMapping("/add")
    public com.sotibob.CustomerService.entity.Customer addCustomer(@org.springframework.web.bind.annotation.RequestBody com.sotibob.CustomerService.entity.Customer c) {
        return customerService.addCustomer(c);
    }

    @org.springframework.web.bind.annotation.PutMapping("/update/{id}")
    public com.sotibob.CustomerService.entity.Customer updateCustomer(@org.springframework.web.bind.annotation.PathVariable("id") int Id, @org.springframework.web.bind.annotation.RequestBody com.sotibob.CustomerService.entity.Customer c) {
        return customerService.updateCustomer(Id, c);
    }

    @org.springframework.web.bind.annotation.DeleteMapping("/delete/{id}")
    public java.util.List<com.sotibob.CustomerService.entity.Customer> deleteCustomer(@org.springframework.web.bind.annotation.PathVariable("id") int Id) {
        return customerService.deleteCustomer(Id);
    }


}
