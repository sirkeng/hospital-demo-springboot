package com.sirkeng.hospitaldemo.service;

import com.sirkeng.hospitaldemo.entity.TreatmentDetail;
import com.sirkeng.hospitaldemo.repository.TreatmentDetailRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TreatmentDetailService {
    private final TreatmentDetailRepository treatmentDetailRepository;

    public TreatmentDetailService(TreatmentDetailRepository treatmentDetailRepository) {
        this.treatmentDetailRepository = treatmentDetailRepository;
    }

    public TreatmentDetail saveTreatmentDetail(TreatmentDetail treatmentDetail) {
        return treatmentDetailRepository.save(treatmentDetail);
    }

    public List<TreatmentDetail> getAllTreatmentDetails() {
        return treatmentDetailRepository.findAll();
    }

    public Optional<TreatmentDetail> getTreatmentDetailById(Long id) {
        return treatmentDetailRepository.findById(id);
    }
}
