package com.feedback.gestionpedidos.model;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(name = "pedidos")
@Data
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Cambiado a IDENTITY
    private Long id;

    private String description;

    public String getDescription() {
        return description;
    }
}
