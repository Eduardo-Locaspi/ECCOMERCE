package org.acme.model;

public class ItemFavoritado {
    private long fk_id_carrinho;

    private long fk_id_produto;

    public ItemFavoritado(long fk_id_carrinho, long fk_id_produto) {
        this.fk_id_carrinho = fk_id_carrinho;
        this.fk_id_produto = fk_id_produto;
    }

    public long getFk_id_carrinho() {
        return fk_id_carrinho;
    }

    public void setFk_id_carrinho(long fk_id_carrinho) {
        this.fk_id_carrinho = fk_id_carrinho;
    }

    public long getFk_id_produto() {
        return fk_id_produto;
    }

    public void setFk_id_produto(long fk_id_produto) {
        this.fk_id_produto = fk_id_produto;
    }
}
