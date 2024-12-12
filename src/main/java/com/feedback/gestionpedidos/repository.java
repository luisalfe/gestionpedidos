package com.feedback.gestionpedidos;

import org.springframework.data.jpa.repository.JpaRepository;

public interface repository extends JpaRepository<Order, Long> {
}

