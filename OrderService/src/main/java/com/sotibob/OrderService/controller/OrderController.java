package com.sotibob.OrderService.controller;

@org.springframework.web.bind.annotation.RestController
@org.springframework.web.bind.annotation.RequestMapping("/order")
public class OrderController {

    @org.springframework.beans.factory.annotation.Autowired
    private com.sotibob.OrderService.service.OrderService orderService;

    @org.springframework.web.bind.annotation.GetMapping("/")
    public java.util.List<com.sotibob.OrderService.entity.Order> selectOrders() {
        return orderService.selectOrders();
    }

    @org.springframework.web.bind.annotation.GetMapping("/{id}")
    public com.sotibob.OrderService.VO.ResponseTemplate selectOrderById(@org.springframework.web.bind.annotation.PathVariable("id") int Id) {
        return orderService.selectOrderById(Id);
    }

    @org.springframework.web.bind.annotation.PostMapping("/add")
    public com.sotibob.OrderService.entity.Order addOrder(@org.springframework.web.bind.annotation.RequestBody com.sotibob.OrderService.entity.Order o) {
        o.setOrderDate(java.sql.Date.valueOf(java.time.LocalDate.now()).toString());
        return orderService.addOrder(o);
    }

    @org.springframework.web.bind.annotation.PutMapping("/update/{id}")
    public com.sotibob.OrderService.entity.Order updateOrder(@org.springframework.web.bind.annotation.PathVariable("id") int Id, @org.springframework.web.bind.annotation.RequestBody com.sotibob.OrderService.entity.Order o) {
        o.setOrderDate(java.sql.Date.valueOf(java.time.LocalDate.now()).toString());
        return orderService.updateOrder(Id, o);
    }

    @org.springframework.web.bind.annotation.DeleteMapping("/delete/{id}")
    public java.util.List<com.sotibob.OrderService.entity.Order> deleteOrder(@org.springframework.web.bind.annotation.PathVariable("id") int Id) {
        return orderService.deleteOrder(Id);
    }
}
