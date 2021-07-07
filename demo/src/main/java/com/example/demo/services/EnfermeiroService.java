package com.example.demo.services;

import com.example.demo.models.Enfermeiro;
import com.example.demo.models.Paciente;
import com.example.demo.repository.EnfermeiroRepository;
import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EnfermeiroService {


    @Autowired
    private EnfermeiroRepository enfermeiroRepository;

    public List<Enfermeiro> findAll(){
        return enfermeiroRepository.findAll();
    }

    public Optional<Enfermeiro> findById(Long id){
        return enfermeiroRepository.findById(id);
    }

    public Enfermeiro save(Enfermeiro enfermeiro){

         enfermeiroRepository.save(enfermeiro);
         return enfermeiro;
    }

    public void deleteById(Long id){
        enfermeiroRepository.deleteById(id);
    }

    public String criptografarCPF(String cpf) {
        return Base64.encodeBase64String(cpf.getBytes());
    }

}