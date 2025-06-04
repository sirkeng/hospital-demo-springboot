package com.sirkeng.hospitaldemo.controller;

import com.sirkeng.hospitaldemo.entity.Procedure;
import com.sirkeng.hospitaldemo.service.ProcedureService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/procedures")
public class ProcedureController {

    private final ProcedureService procedureService;

    public ProcedureController(ProcedureService procedureService) {
        this.procedureService = procedureService;
    }

    @PostMapping
    public Procedure createProcedure(@RequestBody Procedure procedure) {
        return procedureService.saveProcedure(procedure);
    }

    @GetMapping
    public List<Procedure> getAllProcedures() {
        return procedureService.getAllProcedures();
    }

    @GetMapping("/{id}")
    public Optional<Procedure> getProcedureById(@PathVariable Long id) {
        return procedureService.getProcedureById(id);
    }
}
