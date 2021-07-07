package com.example.demo.services;

import com.example.demo.models.Medico;
import com.example.demo.repository.MedicoRepository;
import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

@Service
public class MedicoService {

    @Autowired
    private MedicoRepository medicoRepository;

    public List<Medico> findAll(){
        return medicoRepository.findAll();
    }
    public Optional<Medico> findById(long id){
        return medicoRepository.findById(id);
    }

    public Medico save(Medico medico) {
        return medicoRepository.save(medico);
    }
    public void deleteById(Long id) {
        medicoRepository.deleteById(id);
    }
    public String criptografarCPF(String cpf) {
        return Base64.encodeBase64String(cpf.getBytes());
    }
}
