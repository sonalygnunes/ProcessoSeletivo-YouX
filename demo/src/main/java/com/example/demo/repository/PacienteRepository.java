package com.example.demo.repository;

import com.example.demo.models.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepository extends JpaRepository<Paciente, Long> {

        Paciente findByCpf(String cpf);

}
