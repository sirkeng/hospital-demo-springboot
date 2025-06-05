package com.sirkeng.hospitaldemo.dto;

import lombok.Data;

@Data
public class DoctorDrugReportDTO {
    private String doctorName;
    private String patientName;
    private String procedureName;
    private int qty;
    private String treatmentDate;

    // ใบสั่งยา/หัตถการในแต่ละวัน – ใครเป็นคนจ่าย ใครเป็นคนรับ
    public DoctorDrugReportDTO(String doctorName, String patientName, String procedureName, int qty,
            String treatmentDate) {
        this.doctorName = doctorName;
        this.patientName = patientName;
        this.procedureName = procedureName;
        this.qty = qty;
        this.treatmentDate = treatmentDate;
    }
}
