package com.ilm.Gerenciador_de_Tarefas.controller;

import com.ilm.Gerenciador_de_Tarefas.model.Usuario;
import com.ilm.Gerenciador_de_Tarefas.repository.FuncaoRepository;
import com.ilm.Gerenciador_de_Tarefas.model.Funcao;
import com.ilm.Gerenciador_de_Tarefas.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.Optional;

@RestController
@RequestMapping("/api/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @Autowired
    private FuncaoRepository funcaoRepository;

    @PostMapping("/cadastro")
    public RedirectView cadastrarUsuario(@RequestParam String nome_usuario, @RequestParam String email, @RequestParam String senha, @RequestParam int funcao) {
        Funcao funcaoSelecionada = funcaoRepository.findById(funcao)
            .orElseThrow(() -> new RuntimeException("Funcao not found with id " + funcao)); // Handle not found

        Usuario usuario = new Usuario();
        usuario.setNome_usuario(nome_usuario);
        usuario.setEmail(email);
        usuario.setSenha(senha);
        usuario.setFuncao(funcaoSelecionada);
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
