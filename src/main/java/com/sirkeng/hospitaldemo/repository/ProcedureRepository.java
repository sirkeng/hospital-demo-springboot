package com.sirkeng.hospitaldemo.repository;

import com.sirkeng.hospitaldemo.entity.Procedure;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProcedureRepository extends JpaRepository<Procedure, Long> {

}
