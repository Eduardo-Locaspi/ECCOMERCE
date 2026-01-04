package org.acme.resource;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.acme.excecoes.AuthException;
import org.acme.model.DTO.DTO_Usuario;
import org.acme.model.Usuario;
import org.acme.service.AutenticacaoService;

import java.sql.SQLException;

@Path("login")
public class AutenticacaoResources {

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response realizarLogin(DTO_Usuario user_digitado){

        try{
            Usuario user_bd = AutenticacaoService.

            //Caso o usuario não exista


            return Response.ok("Usuario não encontrado").build();
        }catch (SQLException e){
            return Response.serverError().build();
        }catch (AuthException login_refused){
            return Response.status(Response.Status.UNAUTHORIZED).entity("Login Inexistente").build();
        }

    }
}
