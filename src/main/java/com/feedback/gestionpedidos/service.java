package com.feedback.gestionpedidos;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.feedback.gestionpedidos.repository;
import com.feedback.gestionpedidos.Order;


@Service

public class service {

    @Autowired
    private repository repository;

    @Transactional
    public Order createOrder(Order order) {
        return repository.save(order);
    }

    @Transactional(readOnly = true)
    public Iterable<Order> findAllOrders() {
        return repository.findAll();
    }

    @Transactional(rollbackFor = Exception.class)
    public void updateOrder(Order order) throws Exception {
            repository.save(order);
            if(someConditionFails()){
            throw new Exception("Simulated error");
        }
    }

    private boolean someConditionFails() {
        return true;
    }

}
