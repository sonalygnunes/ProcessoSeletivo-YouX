package com.example.demo.repository;

import com.example.demo.models.Enfermeiro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnfermeiroRepository extends JpaRepository<Enfermeiro, Long> {

    Enfermeiro findByCpf(String cpf);
}

