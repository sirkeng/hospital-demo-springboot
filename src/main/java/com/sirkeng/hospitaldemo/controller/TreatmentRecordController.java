package com.sirkeng.hospitaldemo.controller;

import com.sirkeng.hospitaldemo.entity.TreatmentRecord;
import com.sirkeng.hospitaldemo.service.TreatmentRecordService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/treatment-records")
public class TreatmentRecordController {

    private final TreatmentRecordService treatmentRecordService;

    public TreatmentRecordController(TreatmentRecordService treatmentRecordService) {
        this.treatmentRecordService = treatmentRecordService;
    }

    @PostMapping
    public TreatmentRecord createTreatmentRecord(@RequestBody TreatmentRecord treatmentRecord) {
        return treatmentRecordService.saveTreatmentRecord(treatmentRecord);
    }

    @GetMapping
    public List<TreatmentRecord> getAllTreatmentRecords() {
        return treatmentRecordService.getAllTreatmentRecords();
    }

    @GetMapping("/{id}")
    public Optional<TreatmentRecord> getTreatmentRecordById(@PathVariable Long id) {
        return treatmentRecordService.getTreatmentRecordById(id);
    }
}
