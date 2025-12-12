package org.acme.model;

public class Autentica {
    private long id_login;

    private String login;
    private String senha;
    private char st_ativo;

    private long fk_id_usuario;

    public Autentica() {
    }

    public Autentica(long id_login, String login, String senha, char st_ativo, long fk_id_usuario) {
        this.id_login = id_login;
        this.login = login;
        this.senha = senha;
        this.st_ativo = st_ativo;
        this.fk_id_usuario = fk_id_usuario;
    }

    // Constrtor sem st_ativo
    public Autentica(long id_login, String login, String senha, long fk_id_usuario) {
        this.id_login = id_login;
        this.login = login;
        this.senha = senha;
        this.fk_id_usuario = fk_id_usuario;
    }


    public long getId_login() {
        return id_login;
    }

    public void setId_login(long id_login) {
        this.id_login = id_login;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public char getSt_ativo() {
        return st_ativo;
    }

    public void setSt_ativo(char st_ativo) {
        this.st_ativo = st_ativo;
    }

    public long getFk_id_usuario() {
        return fk_id_usuario;
    }

    public void setFk_id_usuario(long fk_id_usuario) {
        this.fk_id_usuario = fk_id_usuario;
    }
}
