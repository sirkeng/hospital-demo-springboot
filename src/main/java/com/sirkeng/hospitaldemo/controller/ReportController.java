package com.sirkeng.hospitaldemo.controller;

import com.sirkeng.hospitaldemo.dto.DoctorDrugReportDTO;
import com.sirkeng.hospitaldemo.dto.DrugUsageReportDTO;
import com.sirkeng.hospitaldemo.entity.TreatmentDetail;
import com.sirkeng.hospitaldemo.service.ReportService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reports")
public class ReportController {

    private final ReportService reportService;

    public ReportController(ReportService reportService) {
        this.reportService = reportService;
    }

    @GetMapping("/treatment-details")
    public List<TreatmentDetail> getTreatmentDetailsReport() {
        return reportService.getAllTreatmentDetailsForReport();
    }

    @GetMapping("/doctor-drug")
    public List<DoctorDrugReportDTO> doctorDrugReport() {
        return reportService.doctorDrugReport();
    }

    @GetMapping("/drug-usage")
    public List<DrugUsageReportDTO> drugUsageReport() {
        return reportService.drugUsageReport();
    }
}
