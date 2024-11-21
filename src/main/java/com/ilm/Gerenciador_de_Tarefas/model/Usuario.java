package com.ilm.Gerenciador_de_Tarefas.model;

import jakarta.persistence.*;



@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private int id_usuario;

    @Column(name = "nome_usuario", nullable = false, unique = true)
    private String nome_usuario;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "senha")
    private String senha;
    
    @ManyToOne
    @JoinColumn(name = "funcao", referencedColumnName = "id_funcao", nullable = true)
    private Funcao funcao;
    

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNome_usuario() {
        return nome_usuario;
    }

    public void setNome_usuario(String nome_usuario) {
        this.nome_usuario = nome_usuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public Funcao getFuncao() {
        return funcao;
    }

    public void setFuncao(Funcao funcao) {
        this.funcao = funcao;
    }
    
}
