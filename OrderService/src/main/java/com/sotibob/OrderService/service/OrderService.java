package com.sotibob.OrderService.service;

@org.springframework.stereotype.Service
public class OrderService {

    @org.springframework.beans.factory.annotation.Autowired
    private com.sotibob.OrderService.repo.OrderRepo orderRepo;

    @org.springframework.beans.factory.annotation.Autowired
    org.springframework.web.client.RestTemplate restTemplate;

    public java.util.List<com.sotibob.OrderService.entity.Order> selectOrders() {
        return orderRepo.findAll();
    }

    public com.sotibob.OrderService.VO.ResponseTemplate selectOrderById(int id) {
        com.sotibob.OrderService.VO.ResponseTemplate vo = new com.sotibob.OrderService.VO.ResponseTemplate();
        com.sotibob.OrderService.entity.Order ord = orderRepo.findByOrderId(id);
        com.sotibob.OrderService.VO.Payment payment = restTemplate.getForObject("http://localhost:9004/payment/" + ord.getPaymentId(), com.sotibob.OrderService.VO.Payment.class);
        java.util.List<com.sotibob.OrderService.VO.Product> products = new java.util.ArrayList<com.sotibob.OrderService.VO.Product>();
        for (Integer p : ord.getProductIds()) {
            com.sotibob.OrderService.VO.Product product = restTemplate.getForObject("http://localhost:9002/product/" + p, com.sotibob.OrderService.VO.Product.class);
            products.add(product);
        }
        vo.setOrder(ord);
        vo.setPayment(payment);
        vo.setProductList(products);
        return vo;
    }

    public com.sotibob.OrderService.entity.Order addOrder(com.sotibob.OrderService.entity.Order o) {
        return orderRepo.save(o);
    }

    public com.sotibob.OrderService.entity.Order updateOrder(int id, com.sotibob.OrderService.entity.Order o) {
        com.sotibob.OrderService.entity.Order ord = orderRepo.findByOrderId(id);
        ord.setProductIds(o.getProductIds());
        ord.setOrderDate(o.getOrderDate());
        ord.setPaymentId(o.getPaymentId());
        return orderRepo.save(ord);
    }

    public java.util.List<com.sotibob.OrderService.entity.Order> deleteOrder(int id) {
        com.sotibob.OrderService.entity.Order ord = orderRepo.findByOrderId(id);
        orderRepo.delete(ord);
        return selectOrders();
    }
}
