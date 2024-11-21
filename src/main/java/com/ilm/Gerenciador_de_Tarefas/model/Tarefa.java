package com.ilm.Gerenciador_de_Tarefas.model;

import jakarta.persistence.*;
import java.time.LocalDate;


@Entity
@Table(name = "tarefa")
public class Tarefa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tarefa")
    private int id_tarefa;

    @Column(name = "titulo")
    private String titulo;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "prazo")
    private LocalDate prazo;

    @ManyToOne
    @JoinColumn(name = "status_tarefa", referencedColumnName = "id_status_tarefa", nullable = false)
    private StatusTarefa status_tarefa;

    @ManyToOne
    @JoinColumn(name = "criador_tarefa", referencedColumnName = "id_usuario", nullable = false)
    private Usuario criador_tarefa;

    @ManyToOne
    @JoinColumn(name = "executor_tarefa", referencedColumnName = "id_usuario", nullable = false)
    private Usuario executor_tarefa;

    public int getId_tarefa() {
        return id_tarefa;
    }

    public void setId_tarefa(int id_tarefa) {
        this.id_tarefa = id_tarefa;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getPrazo() {
        return prazo;
    }

    public void setPrazo(LocalDate prazo) {
        this.prazo = prazo;
    }

    public StatusTarefa getStatus_tarefa() {
        return status_tarefa;
    }

    public void setStatus_tarefa(StatusTarefa status_tarefa) {
        this.status_tarefa = status_tarefa;
    }

    public Usuario getCriador_tarefa() {
        return criador_tarefa;
    }

    public void setCriador_tarefa(Usuario criador_tarefa) {
        this.criador_tarefa = criador_tarefa;
    }

    public Usuario getExecutor_tarefa() {
        return executor_tarefa;
    }

    public void setExecutor_tarefa(Usuario executor_tarefa) {
        this.executor_tarefa = executor_tarefa;
    }
}
