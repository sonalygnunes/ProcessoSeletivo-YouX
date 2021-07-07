package com.example.demo.controllers;

import com.example.demo.services.MedicoService;
import com.example.demo.models.Medico;
import org.springframework.web.bind.annotation.*;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/medico")

public class MedicoController {

    @Autowired
    private MedicoService medicoService;

    @GetMapping("/medico")
    public List<Medico> findAll() {
        return medicoService.findAll();
    }

    @GetMapping(value = "/medico/{id}")
    public Optional<Medico> findById(@PathVariable Long id){
        return medicoService.findById(id);
    }

    @PostMapping
    public Medico save(@RequestBody Medico medico){
        medicoService.save(medico);
        return medico;
    }

    @DeleteMapping(value = "/medico/{id}")
    public void deleteById(@PathVariable Long id) {
        medicoService.deleteById(id);
    }

}
