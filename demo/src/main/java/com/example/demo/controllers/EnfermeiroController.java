package com.example.demo.controllers;

import com.example.demo.models.Enfermeiro;
import com.example.demo.services.EnfermeiroService;
import org.springframework.web.bind.annotation.*;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/enfermeiro")

public class EnfermeiroController {

    @Autowired
    private EnfermeiroService enfermeiroService;

    @GetMapping("/enfermeiro")
    public List<Enfermeiro> findAll() {
        return enfermeiroService.findAll();
    }
    @GetMapping(value = "/enfermeiro/{id}")
    public Optional<Enfermeiro> findById(@PathVariable Long id){
        return enfermeiroService.findById(id);
    }
    @PostMapping
    public EnfermeiroService save(@RequestBody Enfermeiro enfermeiro){
        enfermeiroService.save(enfermeiro);
        return enfermeiroService;
    }
    @DeleteMapping(value = "/enfermeiro/{id}")
    public void deleteById(@PathVariable Long id) {
        enfermeiroService.deleteById(id);
    }






}
