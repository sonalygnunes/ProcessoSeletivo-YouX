package com.example.demo.repository;


import com.example.demo.models.Medico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicoRepository extends JpaRepository<Medico, Long> {

    Medico findByCpf(String cpf);
}
