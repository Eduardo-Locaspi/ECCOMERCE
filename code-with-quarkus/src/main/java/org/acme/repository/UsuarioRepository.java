package org.acme.repository;


import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.acme.model.DTO.DTO_Usuario;
import org.acme.model.Usuario;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class UsuarioRepository {
    private String sql;

    @Inject
    DataSource dataSource;

    // GET ( de todos os usuarios)
    public List<Usuario> todosUsuarios() throws SQLException {
        sql = "SELECT id_usuario, nm_usuario, cpf_usuario, sx_usuario, dt_nascimento FROM T_ECCOMERCE_CONTA_USUARIO";
        List<Usuario> listaDeUsuarios = new ArrayList<>();

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
    public Usuario usuarioEspecifico(int id) throws SQLException{
        sql= " SELECT id_usuario, nm_usuario, cpf_usuario, sx_usuario, dt_nascimento FROM T_ECCOMERCE_CONTA_USUARIO WHERE id_usuario=?";
        Usuario user=null;

        try(Connection con = dataSource.getConnection(); PreparedStatement pst = con.prepareStatement(sql)){
            pst.setInt(1,id);

            try(ResultSet rs = pst.executeQuery()){

                while (rs.next()){
                    user = new Usuario(
                            rs.getInt("id_usuario"),
                            rs.getString("nm_usuario"),
                            rs.getString("cpf_usuario"),
                            rs.getString("sx_usuario").charAt(0),
                            rs.getDate("dt_nascimento").toLocalDate()

                    );
                }
            }

        }

        return user;
    }

    // POST ( criar um usuario )
    public boolean criarUsuario(DTO_Usuario user) throws SQLException{
        sql= "INSERT INTO T_ECCOMERCE_CONTA_USUARIO(nm_usuario, cpf_usuario, sx_usuario, dt_nascimento) VALUES (?,?,?,?)";
        int linhasAfetadas;

        try(Connection con = dataSource.getConnection();PreparedStatement pst = con.prepareStatement(sql)){
            pst.setString(1,user.getNm_usuario());
            pst.setString(2, user.getCpf_usuario());
            pst.setString(3,String.valueOf(user.getSx_usuario()));
            pst.setDate(3,java.sql.Date.valueOf(user.getDt_nascimento_usuario()));

        linhasAfetadas= pst.executeUpdate();
    }
        return linhasAfetadas>0;
}

    // PUT ( alterar dados de um usuario por id)
    public boolean alterarUsuario(Usuario user) throws SQLException{
        sql = "UPDATE T_ECCOMERCE_CONTA_USUARIO SET nm_usuario=? , cpf_usuario=? , sx_usuario=? , dt_nascimento=? WHERE id_usuario=?";
        int linhasAfetadas;

        try(Connection con = dataSource.getConnection();PreparedStatement pst = con.prepareStatement(sql)){
            pst.setString(1,user.getNm_usuario());
            pst.setString(2, user.getCpf_usuario());
            pst.setString(3,String.valueOf(user.getSx_usuario()));
            pst.setDate(3,java.sql.Date.valueOf(user.getDt_nascimento_usuario()));

            pst.setLong(5,user.getId_usuario());

            linhasAfetadas= pst.executeUpdate();
        }
        return linhasAfetadas>0;
    }

    // DELETE ( deletar um usuario por id)
    public boolean deletarUsuario (int id)throws SQLException{
        sql= "DELETE FROM T_ECCOMERCE_CONTA_USUARIO WHERE id=?";
        int linhasAfetadas;

        try(Connection con = dataSource.getConnection();PreparedStatement pst = con.prepareStatement(sql)){
            pst.setInt(1,id);

            linhasAfetadas= pst.executeUpdate();
        }
            return linhasAfetadas>0;
    }
}

