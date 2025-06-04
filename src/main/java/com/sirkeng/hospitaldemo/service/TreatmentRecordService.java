package com.sirkeng.hospitaldemo.service;

import com.sirkeng.hospitaldemo.entity.TreatmentRecord;
import com.sirkeng.hospitaldemo.repository.TreatmentRecordRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TreatmentRecordService {
    private final TreatmentRecordRepository treatmentRecordRepository;

    public TreatmentRecordService(TreatmentRecordRepository treatmentRecordRepository) {
        this.treatmentRecordRepository = treatmentRecordRepository;
    }

    public TreatmentRecord saveTreatmentRecord(TreatmentRecord treatmentRecord) {
        return treatmentRecordRepository.save(treatmentRecord);
    }

    public List<TreatmentRecord> getAllTreatmentRecords() {
        return treatmentRecordRepository.findAll();
    }

    public Optional<TreatmentRecord> getTreatmentRecordById(Long id) {
        return treatmentRecordRepository.findById(id);
    }
}
