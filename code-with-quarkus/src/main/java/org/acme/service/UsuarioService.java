package org.acme.service;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.acme.model.Usuario;
import org.acme.repository.UsuarioRepository;

import java.sql.SQLException;
import java.util.List;

@ApplicationScoped
public class UsuarioService {

    @Inject
    UsuarioRepository usuarioRepository;


    public List<Usuario> listarUsuarios() throws SQLException {

        return usuarioRepository.todosUsuarios();
    }

    public Usuario buscarUsuarioPorId(long id) throws SQLException,IllegalArgumentException{
        Usuario user;
        user = usuarioRepository.usuarioEspecifico(id);

        if (user == null) {
            throw new IllegalArgumentException();
        }

        return user;
    }

}
