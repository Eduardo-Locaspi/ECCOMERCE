package org.acme.model;

public class Produto {
    private long id_produto;

    private String nm_produto;
    private String marca;
    private String preco_unitario;
    private String qt_estoque;

    public Produto() {
    }

    public Produto(long id_produto, String nm_produto, String marca, String preco_unitario, String qt_estoque) {
        this.id_produto = id_produto;
        this.nm_produto = nm_produto;
        this.marca = marca;
        this.preco_unitario = preco_unitario;
        this.qt_estoque = qt_estoque;
    }

    public long getId_produto() {
        return id_produto;
    }

    public void setId_produto(long id_produto) {
        this.id_produto = id_produto;
    }

    public String getNm_produto() {
        return nm_produto;
    }

    public void setNm_produto(String nm_produto) {
        this.nm_produto = nm_produto;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPreco_unitario() {
        return preco_unitario;
    }

    public void setPreco_unitario(String preco_unitario) {
        this.preco_unitario = preco_unitario;
    }

    public String getQt_estoque() {
        return qt_estoque;
    }

    public void setQt_estoque(String qt_estoque) {
        this.qt_estoque = qt_estoque;
    }
}
