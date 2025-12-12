package org.acme.model;

public class Endereco {
    private long id_endereco;
    private String cep;
    private String pais;
    private String estado;
    private String cidade;
    private String rua ;
    private String numero;
    private String complemento;
    private char st_ativo;

    private long fk_id_usuario;

    public Endereco() {
    }

    public Endereco(long id_endereco, String cep, String pais, String estado, String cidade, String rua, String numero, String complemento, char st_ativo, long fk_id_usuario) {
        this.id_endereco = id_endereco;
        this.cep = cep;
        this.pais = pais;
        this.estado = estado;
        this.cidade = cidade;
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
        this.st_ativo = st_ativo;
        this.fk_id_usuario = fk_id_usuario;
    }

            // Construtor sem st_ativo
    public Endereco(long id_endereco, String cep, String pais, String estado, String cidade, String rua, String numero, String complemento, long fk_id_usuario) {
        this.id_endereco = id_endereco;
        this.cep = cep;
        this.pais = pais;
        this.estado = estado;
        this.cidade = cidade;
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;

        this.fk_id_usuario = fk_id_usuario;
    }


            // Construtor sem complemento
    public Endereco(long id_endereco, String cep, String pais, String estado, String cidade, String rua, String numero, char st_ativo, long fk_id_usuario) {
        this.id_endereco = id_endereco;
        this.cep = cep;
        this.pais = pais;
        this.estado = estado;
        this.cidade = cidade;
        this.rua = rua;
        this.numero = numero;
        this.st_ativo = st_ativo;
        this.fk_id_usuario = fk_id_usuario;
    }

            // Construtor sem st_ativo e complemento
    public Endereco(long id_endereco, String cep, String pais, String estado, String cidade, String rua, String numero, long fk_id_usuario) {
        this.id_endereco = id_endereco;
        this.cep = cep;
        this.pais = pais;
        this.estado = estado;
        this.cidade = cidade;
        this.rua = rua;
        this.numero = numero;

        this.fk_id_usuario = fk_id_usuario;
    }

    public long getId_endereco() {
        return id_endereco;
    }

    public void setId_endereco(long id_endereco) {
        this.id_endereco = id_endereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
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
