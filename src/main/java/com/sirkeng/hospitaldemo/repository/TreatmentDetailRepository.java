package com.sirkeng.hospitaldemo.repository;

import com.sirkeng.hospitaldemo.dto.DoctorDrugReportDTO;
import com.sirkeng.hospitaldemo.dto.DrugUsageReportDTO;
import com.sirkeng.hospitaldemo.entity.TreatmentDetail;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface TreatmentDetailRepository extends JpaRepository<TreatmentDetail, Long> {
    @Query("SELECT new com.sirkeng.hospitaldemo.dto.DoctorDrugReportDTO(" +
            "td.treatmentRecord.doctor.name, " +
            "td.treatmentRecord.visit.patient.name, " +
            "td.procedure.name, " +
            "td.qty, " +
            "str(td.treatmentRecord.treatmentDate)) " +
            "FROM TreatmentDetail td " +
            "ORDER BY td.treatmentRecord.treatmentDate DESC")
    List<DoctorDrugReportDTO> doctorDrugReport();

    @Query("SELECT new com.sirkeng.hospitaldemo.dto.DrugUsageReportDTO(td.procedure.name, SUM(td.qty)) " +
            "FROM TreatmentDetail td GROUP BY td.procedure.name")
    List<DrugUsageReportDTO> drugUsageReport();
}
