package com.sirkeng.hospitaldemo.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class TreatmentDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "treatment_record_id")
    private TreatmentRecord treatmentRecord;

    @ManyToOne
    @JoinColumn(name = "procedure_id")
    private Procedure procedure;

    private Integer qty;
    private Double totalPrice;
}
