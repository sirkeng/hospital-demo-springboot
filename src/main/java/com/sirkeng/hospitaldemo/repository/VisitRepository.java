package com.sirkeng.hospitaldemo.repository;

import com.sirkeng.hospitaldemo.entity.Visit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VisitRepository extends JpaRepository<Visit, Long> {
}
