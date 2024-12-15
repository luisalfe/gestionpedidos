package com.feedback.gestionpedidos.service;

import com.feedback.gestionpedidos.model.Order;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;


@Service

public class OrderService {

    @Autowired
    private com.feedback.gestionpedidos.repository.orderRepository orderRepository;

    @Transactional
    public Order createOrder(Order order) {
        return orderRepository.save(order);
    }

    @Transactional(readOnly = true)
    public Iterable<Order> findAllOrders() {
        return orderRepository.findAll();
    }

    @Transactional(rollbackFor = Exception.class)
    public void updateOrder(Order order) throws Exception {
            orderRepository.save(order);
            if(someConditionFails()){
            throw new Exception("Simulated error");
        }
    }

    private boolean someConditionFails() {
        return true;
    }

}
