package com.ilm.Gerenciador_de_Tarefas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    // Página inicial, geralmente usada para login.
    // O Spring Security gerencia a página de login
    @GetMapping("/")
    public String indexPage() {
        return "index"; // Pode ser a página de login, dependendo da sua implementação
    }

    // Página de cadastro do usuário
    @GetMapping("/cadastro")
    public String cadastro() {
        return "cadastro"; // Página para registrar um novo usuário
    }

    // Página de tarefas, onde o usuário poderá ver suas tarefas
    @GetMapping("/tarefas")
    public String tarefa() {
        return "tarefas"; // Página para visualizar e gerenciar as tarefas
    }

    // Logout
    @GetMapping("/logout")
    public String logout() {
        return "redirect:/"; // Redireciona para a página inicial (login) após o logout
    }
}
