package com.sirkeng.hospitaldemo.controller;

import com.sirkeng.hospitaldemo.entity.Patient;
import com.sirkeng.hospitaldemo.service.PatientService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/patients")
public class PatientController {

    private final PatientService patientService;

    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    // สร้างคนไข้ใหม่ (POST)
    @PostMapping
    public Patient createPatient(@RequestBody Patient patient) {
        return patientService.savePatient(patient);
    }

    // ดึงรายชื่อคนไข้ทั้งหมด (GET)
    @GetMapping
    public List<Patient> getAllPatients() {
        return patientService.getAllPatients();
    }

    // ดึงคนไข้ตาม id (GET)
    @GetMapping("/{id}")
    public Optional<Patient> getPatientById(@PathVariable Long id) {
        return patientService.getPatientById(id);
    }
}
