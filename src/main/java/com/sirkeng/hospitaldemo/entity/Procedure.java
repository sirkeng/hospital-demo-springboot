package com.sirkeng.hospitaldemo.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Procedure {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Double price;
}
