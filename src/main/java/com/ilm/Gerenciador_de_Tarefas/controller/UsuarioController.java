package com.ilm.Gerenciador_de_Tarefas.controller;

import com.ilm.Gerenciador_de_Tarefas.model.Usuario;
import com.ilm.Gerenciador_de_Tarefas.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.Optional;

@RestController
@RequestMapping("/api/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/cadastro")
    public RedirectView cadastrarUsuario(@RequestParam String nome_usuario, @RequestParam String email, @RequestParam String senha) {
        Usuario usuario = new Usuario();
        usuario.setNome_usuario(nome_usuario);
        usuario.setEmail(email);
        usuario.setSenha(senha);
        usuarioService.cadastrarUsuario(usuario);
    

    return new RedirectView("/");
    }

    @PostMapping("/login")
    public RedirectView entrarLogin(@RequestParam String email, @RequestParam String senha) {
        Optional<Usuario> usuario = usuarioService.loginUsuario(email, senha);
        if (usuario.isPresent()) {
            return new RedirectView("/tarefas");
        } else {
            return new RedirectView("/");
        }
    }

}
