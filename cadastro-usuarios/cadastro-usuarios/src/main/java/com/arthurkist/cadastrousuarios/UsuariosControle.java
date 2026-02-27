package com.arthurkist.cadastrousuarios;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/usuarios")
public class UsuariosControle {

    private final UsuariosService usuariosService;

    public UsuariosControle(UsuariosService usuariosService) {
        this.usuariosService = usuariosService;
    }

    @PostMapping
    public Usuarios cadastrar(@RequestBody Usuarios usuarios) {
        return usuariosService.salvar(usuarios);
    }

    @GetMapping
    public List<Usuarios> listar() {
        return usuariosService.listar();
    }

}
