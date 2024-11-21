package com.ilm.Gerenciador_de_Tarefas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ilm.Gerenciador_de_Tarefas.model.Usuario;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    Optional<Usuario> findByEmail(String email);
}
