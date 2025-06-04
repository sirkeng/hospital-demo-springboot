package com.sirkeng.hospitaldemo.repository;

import com.sirkeng.hospitaldemo.entity.TreatmentRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TreatmentRecordRepository extends JpaRepository<TreatmentRecord, Long> {
}
