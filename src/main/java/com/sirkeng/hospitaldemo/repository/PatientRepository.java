package com.sirkeng.hospitaldemo.repository;

import com.sirkeng.hospitaldemo.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}
