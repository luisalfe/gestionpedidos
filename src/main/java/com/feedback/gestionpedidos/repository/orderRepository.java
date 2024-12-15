package com.feedback.gestionpedidos.repository;

import com.feedback.gestionpedidos.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface orderRepository extends JpaRepository<Order, Long> {
}

