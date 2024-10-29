package com.ilm.Gerenciador_de_Tarefas.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/pagina_principal")
    public String mainPage() {
        return "pagina_principal"; // Renderiza pagina_principal.html
    }

    @GetMapping("/tarefas")
    public String cadastroPage() {
        return "cadastro"; // Renderiza tarefas.html
    }

    @GetMapping("/logout")
    public String logout() {
        // Lógica de logout (se necessário)
        return "redirect:/index"; // Redireciona para a página inicial
    }

    @GetMapping("/")
    public String indexPage() {
        return "index"; // Renderiza index.html
    }


}
