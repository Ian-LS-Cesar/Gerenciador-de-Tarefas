package com.ilm.Gerenciador_de_Tarefas.model;

import jakarta.persistence.*;

@Entity
@Table(name = "statustarefa")
public class StatusTarefa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_status_tarefa")
    private int id_status_tarefa;

    @Column(name = "descricao")
    private String descricao;

    public int getId_status_tarefa() {
        return id_status_tarefa;
    }

    public void setId_status_tarefa(int id_status_tarefa) {
        this.id_status_tarefa = id_status_tarefa;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
