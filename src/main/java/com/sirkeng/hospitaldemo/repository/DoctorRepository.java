package com.sirkeng.hospitaldemo.repository;

import com.sirkeng.hospitaldemo.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {

}
