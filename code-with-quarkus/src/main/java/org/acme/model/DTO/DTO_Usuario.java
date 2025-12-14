package org.acme.model.DTO;

import java.time.LocalDate;

public class DTO_Usuario {

    private String nm_usuario;
    private String cpf_usuario;
    private char sx_usuario;
    private LocalDate dt_nascimento_usuario;

    public DTO_Usuario(String nm_usuario, String cpf_usuario, char sx_usuario, LocalDate dt_nascimento_usuario) {
        this.nm_usuario = nm_usuario;
        this.cpf_usuario = cpf_usuario;
        this.sx_usuario = sx_usuario;
        this.dt_nascimento_usuario = dt_nascimento_usuario;
    }

    public String getNm_usuario() {
        return nm_usuario;
    }

    public void setNm_usuario(String nm_usuario) {
        this.nm_usuario = nm_usuario;
    }

    public String getCpf_usuario() {
        return cpf_usuario;
    }

    public void setCpf_usuario(String cpf_usuario) {
        this.cpf_usuario = cpf_usuario;
    }

    public char getSx_usuario() {
        return sx_usuario;
    }

    public void setSx_usuario(char sx_usuario) {
        this.sx_usuario = sx_usuario;
    }

    public LocalDate getDt_nascimento_usuario() {
        return dt_nascimento_usuario;
    }

    public void setDt_nascimento_usuario(LocalDate dt_nascimento_usuario) {
        this.dt_nascimento_usuario = dt_nascimento_usuario;
    }
}
