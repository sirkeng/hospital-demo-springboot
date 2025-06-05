package com.sirkeng.hospitaldemo.service;

import com.sirkeng.hospitaldemo.dto.DoctorDrugReportDTO;
import com.sirkeng.hospitaldemo.dto.DrugUsageReportDTO;
import com.sirkeng.hospitaldemo.entity.TreatmentDetail;
import com.sirkeng.hospitaldemo.repository.TreatmentDetailRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReportService {

    private final TreatmentDetailRepository treatmentDetailRepository;

    public ReportService(TreatmentDetailRepository treatmentDetailRepository) {
        this.treatmentDetailRepository = treatmentDetailRepository;
    }

    public List<TreatmentDetail> getAllTreatmentDetailsForReport() {
        return treatmentDetailRepository.findAll();
    }

    public List<DoctorDrugReportDTO> doctorDrugReport() {
        return treatmentDetailRepository.doctorDrugReport();
    }

    public List<DrugUsageReportDTO> drugUsageReport() {
        return treatmentDetailRepository.drugUsageReport();
    }

}
