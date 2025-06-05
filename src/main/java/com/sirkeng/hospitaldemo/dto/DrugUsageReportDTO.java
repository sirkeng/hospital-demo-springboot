package com.sirkeng.hospitaldemo.dto;

import lombok.Data;

@Data
public class DrugUsageReportDTO {
    private String procedureName;
    private Long totalQty;

    // สรุปยอดจ่ายยาแต่ละชนิด (ทุกหมอ ทุกวัน)
    public DrugUsageReportDTO(String procedureName, Long totalQty) {
        this.procedureName = procedureName;
        this.totalQty = totalQty;
    }
}