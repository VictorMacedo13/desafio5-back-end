package br.com.banco.repository;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.banco.model.entities.Transferencia;

public interface TransferenciaRepository{

    @Query(value = "SELECT t FROM TRANSFERENCIA t where t.CONTA_ID = ?1")
    Page<Transferencia> findAll(Pageable pageable, Integer contaId);
}
