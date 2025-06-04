package com.sirkeng.hospitaldemo.controller;

import com.sirkeng.hospitaldemo.entity.TreatmentDetail;
import com.sirkeng.hospitaldemo.service.TreatmentDetailService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/treatment-details")
public class TreatmentDetailController {

    private final TreatmentDetailService treatmentDetailService;

    public TreatmentDetailController(TreatmentDetailService treatmentDetailService) {
        this.treatmentDetailService = treatmentDetailService;
    }

    @PostMapping
    public TreatmentDetail createTreatmentDetail(@RequestBody TreatmentDetail treatmentDetail) {
        return treatmentDetailService.saveTreatmentDetail(treatmentDetail);
    }

    @GetMapping
    public List<TreatmentDetail> getAllTreatmentDetails() {
        return treatmentDetailService.getAllTreatmentDetails();
    }

    @GetMapping("/{id}")
    public Optional<TreatmentDetail> getTreatmentDetailById(@PathVariable Long id) {
        return treatmentDetailService.getTreatmentDetailById(id);
    }
}
