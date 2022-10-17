package com.sotibob.PaymentService.service;

@org.springframework.stereotype.Service
public class PaymentService {

    @org.springframework.beans.factory.annotation.Autowired
    private com.sotibob.PaymentService.repo.PaymentRepo paymentRepo;

    @org.springframework.beans.factory.annotation.Autowired
    private org.springframework.web.client.RestTemplate restTemplate;

    public java.util.List<com.sotibob.PaymentService.entity.Payment> selectPayments() {
        return paymentRepo.findAll();
    }

    public com.sotibob.PaymentService.VO.ResponseTemplate selectPaymentById(int id) {
        com.sotibob.PaymentService.VO.ResponseTemplate vo = new com.sotibob.PaymentService.VO.ResponseTemplate();
        com.sotibob.PaymentService.entity.Payment payment = paymentRepo.findByPaymentId(id);
        com.sotibob.PaymentService.VO.Customer customer = restTemplate.getForObject("http://localhost:9001/customer/" + payment.getCustomerId(), com.sotibob.PaymentService.VO.Customer.class);
        vo.setCustomer(customer);
        vo.setPayment(payment);
        return vo;
    }

    public com.sotibob.PaymentService.entity.Payment addPayment(com.sotibob.PaymentService.entity.Payment p) {
        return paymentRepo.save(p);
    }

    public com.sotibob.PaymentService.entity.Payment updateCustomer(int id, com.sotibob.PaymentService.entity.Payment p) {
        com.sotibob.PaymentService.entity.Payment pay = paymentRepo.findByPaymentId(id);
        pay.setCardHolderName(p.getCardHolderName());
        pay.setCardNumber(p.getCardNumber());
        pay.setPaymentId(p.getPaymentId());
        pay.setCustomerId(p.getCustomerId());
        return  paymentRepo.save(pay);
    }

    public java.util.List<com.sotibob.PaymentService.entity.Payment> deleteCustomer(int id) {
        com.sotibob.PaymentService.entity.Payment p = paymentRepo.findByPaymentId(id);
        paymentRepo.delete(p);
        return selectPayments();
    }
}
