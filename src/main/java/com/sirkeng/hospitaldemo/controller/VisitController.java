package com.sirkeng.hospitaldemo.controller;

import com.sirkeng.hospitaldemo.entity.Visit;
import com.sirkeng.hospitaldemo.service.VisitService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/visits")
public class VisitController {

    private final VisitService visitService;

    public VisitController(VisitService visitService) {
        this.visitService = visitService;
    }

    @PostMapping
    public Visit createVisit(@RequestBody Visit visit) {
        return visitService.saveVisit(visit);
    }

    @GetMapping
    public List<Visit> getAllVisits() {
        return visitService.getAllVisits();
    }

    @GetMapping("/{id}")
    public Optional<Visit> getVisitById(@PathVariable Long id) {
        return visitService.getVisitById(id);
    }
}
