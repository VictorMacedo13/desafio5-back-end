package br.com.banco.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.banco.model.entities.Conta;
import br.com.banco.repository.ContaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/conta" )
public class ContaController {

    @Autowired
    ContaRepository contaRepository;

    @GetMapping(value="/{id}")
    public ResponseEntity<Page<Conta>> getMethodName(@PathVariable Integer id) {
        
        return ResponseEntity.ok(Page.empty());
    }
    

    
}
