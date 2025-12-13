package org.acme.repository;


import jakarta.enterprise.context.ApplicationScoped;
import org.acme.model.Usuario;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@ApplicationScoped
public class UsuarioRepository {
    private String sql;

    DataSource dataSource;

    // GET ( de todos os usuarios)
    public List<Usuario> todosUsuarios()throws SQLException {
        sql = "SELECT * FROM T_ECCOMERCE_CONTA_USUARIO";
        List<Usuario> listaDeUsuarios;

        try(Connection con = dataSource.getConnection();
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery()){

            while (rs.next()){
                listaDeUsuarios.add(
                        new Usuario(
                                rs.getInt("id_usuario"),
                                rs.getString("nm_usuario"),
                                rs.getString("cpf_usuario"),
                                rs.getString("sx_usuario").charAt(0),
                                rs.getDate("dt_nascimento").toLocalDate()

                        )
                );
            }
            return listaDeUsuarios;
        }




    }
    // GET ( de apenas um usuario por id)
    public usuarioEspecifico(int id){

    }
    // POST ( criar um usuario )

    // PUT ( alterar dados de um usuario por id)

    // DELETE ( deletar um usuario por id)
}
