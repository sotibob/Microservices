package com.sotibob.PaymentService.controller;

@org.springframework.web.bind.annotation.RestController
@org.springframework.web.bind.annotation.RequestMapping("/payment")
public class PaymentController {

    @org.springframework.beans.factory.annotation.Autowired
    private com.sotibob.PaymentService.service.PaymentService paymentService;

    @org.springframework.web.bind.annotation.GetMapping("/")
    public java.util.List<com.sotibob.PaymentService.entity.Payment> selectPayments() {
        return paymentService.selectPayments();
    }

    @org.springframework.web.bind.annotation.GetMapping("/{id}")
    public com.sotibob.PaymentService.VO.ResponseTemplate selectPaymentById(@org.springframework.web.bind.annotation.PathVariable("id") int Id) {
        return paymentService.selectPaymentById(Id);
    }

    @org.springframework.web.bind.annotation.PostMapping("/add")
    public com.sotibob.PaymentService.entity.Payment addPayment(@org.springframework.web.bind.annotation.RequestBody com.sotibob.PaymentService.entity.Payment p) {
        return paymentService.addPayment(p);
    }

    @org.springframework.web.bind.annotation.PutMapping("/update/{id}")
    public com.sotibob.PaymentService.entity.Payment updatePayment(@org.springframework.web.bind.annotation.PathVariable("id") int Id, @org.springframework.web.bind.annotation.RequestBody com.sotibob.PaymentService.entity.Payment p) {
        return paymentService.updateCustomer(Id, p);
    }

    @org.springframework.web.bind.annotation.DeleteMapping("/delete/{id}")
    public java.util.List<com.sotibob.PaymentService.entity.Payment> deletePayment(@org.springframework.web.bind.annotation.PathVariable("id") int Id) {
        return paymentService.deleteCustomer(Id);
    }
}

