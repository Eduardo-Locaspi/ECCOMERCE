package org.acme.resource;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.acme.service.UsuarioService;

import java.sql.SQLException;

@Path("/user")
public class UsuarioResource {

    @Inject
    UsuarioService usuarioService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response listarUsuarios(){
        try{
            return Response.ok(usuarioService.listarUsuarios()).build();
        }catch (SQLException e){
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity("Erro de Banco de Dados").build();
        }
    }

    @GET
    @Path("/user/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response buscarUsuarioPorId(@PathParam("id") int id){

        try{
            return Response.ok(usuarioService.buscarUsuarioPorId(id)).build();
        }catch (SQLException e){
            return Response.serverError().entity("Erro de Banco de Dados").build();
        } catch (IllegalArgumentException e) {
            return Response.noContent().entity("id inexistente").build();
        }
    }
}
