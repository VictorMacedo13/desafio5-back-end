package br.com.banco.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;

import br.com.banco.model.entities.Transferencia;
import br.com.banco.repository.TransferenciaRepository;

public class ContaService {
    
    @Autowired
    TransferenciaRepository transferenciaRepository;

    public Page<Transferencia> find(Pageable pageable, Integer id){
        return transferenciaRepository.findAll(pageable, id);
    }
 
}
