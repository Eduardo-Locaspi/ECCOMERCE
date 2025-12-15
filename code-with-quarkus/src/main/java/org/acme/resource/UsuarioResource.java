package org.acme.resource;

import jakarta.inject.Inject;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;
import org.acme.service.UsuarioService;

import java.sql.SQLException;

@Path("user")
public class UsuarioResource {

    @Inject
    UsuarioService usuarioService;

    public Response listarUsuario(){

        try{
            return Response.ok(usuarioService.listarUsuarios()).build();
        }catch (SQLException e){
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity("Erro de Banco de Dados").build();
        }

    }
}
