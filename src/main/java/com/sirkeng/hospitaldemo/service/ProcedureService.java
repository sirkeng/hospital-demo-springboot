package com.sirkeng.hospitaldemo.service;

import com.sirkeng.hospitaldemo.entity.Procedure;
import com.sirkeng.hospitaldemo.repository.ProcedureRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProcedureService {
    private final ProcedureRepository procedureRepository;

    public ProcedureService(ProcedureRepository procedureRepository) {
        this.procedureRepository = procedureRepository;
    }

    public Procedure saveProcedure(Procedure procedure) {
        return procedureRepository.save(procedure);
    }

    public List<Procedure> getAllProcedures() {
        return procedureRepository.findAll();
    }

    public Optional<Procedure> getProcedureById(Long id) {
        return procedureRepository.findById(id);
    }
}
