package com.ilm.Gerenciador_de_Tarefas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ilm.Gerenciador_de_Tarefas.model.Funcao;

import java.util.Optional;

@Repository
public interface FuncaoRepository extends JpaRepository<Funcao, Integer>{
    Optional<Funcao> findById(int id);
    
}
