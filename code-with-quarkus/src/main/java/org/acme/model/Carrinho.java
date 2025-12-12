package org.acme.model;

public class Carrinho {
    private long id_carrinho;
    private long fk_id_usuario;

    public Carrinho(long id_carrinho, long fk_id_usuario) {
        this.id_carrinho = id_carrinho;
        this.fk_id_usuario = fk_id_usuario;
    }

    public long getId_carrinho() {
        return id_carrinho;
    }

    public void setId_carrinho(long id_carrinho) {
        this.id_carrinho = id_carrinho;
    }

    public long getFk_id_usuario() {
        return fk_id_usuario;
    }

    public void setFk_id_usuario(long fk_id_usuario) {
        this.fk_id_usuario = fk_id_usuario;
    }
}
