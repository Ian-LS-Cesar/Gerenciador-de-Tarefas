package com.ilm.Gerenciador_de_Tarefas.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {
    
    @GetMapping("/tarefas")
    public String tarefa() {
        return "tarefas";
    }

    @GetMapping("/cadastro")
    public String cadastro() {

        return "cadastro";
    }

    @GetMapping("/logout")
    public String logout() {

        return "redirect:/index";
    }


    @GetMapping("/")
    public String indexPage() {
        return "index";
    }


}
