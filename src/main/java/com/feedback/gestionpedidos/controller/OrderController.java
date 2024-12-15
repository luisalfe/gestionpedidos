package com.feedback.gestionpedidos.controller;

import com.feedback.gestionpedidos.model.Order;
import com.feedback.gestionpedidos.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService OrderService;

    @PostMapping
    public Order createOrder(@RequestBody Order order) {
        System.out.println("Descripción recibida: " + order.getDescription()); // Log para depuración porque me esta amargando la vida
        return OrderService.createOrder(order);
    }

    @GetMapping
    public Iterable<Order> getAllOrders() {
        return OrderService.findAllOrders();
    }
}
