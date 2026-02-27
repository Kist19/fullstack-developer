package com.arthurkist.cadastrousuarios;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class UsuariosService {
    private final UsuariosRepositorio usuariosRepositorio;

    public UsuariosService(UsuariosRepositorio usuariosRepositorio) {
        this.usuariosRepositorio = usuariosRepositorio;
    }

    public Usuarios salvar(Usuarios usuario) {
        return usuariosRepositorio.save(usuario);
    }

    public List<Usuarios> listar() {
        return usuariosRepositorio.findAll();
    }
}