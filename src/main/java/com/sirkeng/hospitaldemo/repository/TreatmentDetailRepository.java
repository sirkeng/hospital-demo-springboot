package com.sirkeng.hospitaldemo.repository;

import com.sirkeng.hospitaldemo.entity.TreatmentDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TreatmentDetailRepository extends JpaRepository<TreatmentDetail, Long> {
}
