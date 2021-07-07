package com.example.demo.controllers;

import com.example.demo.models.Paciente;
import com.example.demo.services.PacienteService;
import org.springframework.web.bind.annotation.*;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/pacientes")

public class PacienteController {

    @Autowired
    private PacienteService pacienteService;

    @GetMapping("/pacientes")
    public List<Paciente> findAll() {
        return pacienteService.findAll();
    }
    @GetMapping(value = "/paciente/{id}")
    public Optional<Paciente> findById(@PathVariable Long id){
        return pacienteService.findById(id);
    }
    @PostMapping
    public Paciente save(@RequestBody Paciente paciente){
        pacienteService.save(paciente);
        return paciente;
    }
    @DeleteMapping(value = "/paciente/{id}")
    public void deleteById(@PathVariable Long id) {
        pacienteService.deleteById(id);
    }






}
