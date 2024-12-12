package com.feedback.gestionpedidos;

import com.feedback.gestionpedidos.Order;
import com.feedback.gestionpedidos.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/orders")
public class controller {

    @Autowired
    private service service;

    @PostMapping
    public Order createOrder(@RequestBody Order order) {
        return service.createOrder(order);
    }

    @GetMapping
    public Iterable<Order> getAllOrders() {
        return service.findAllOrders();
    }
}
