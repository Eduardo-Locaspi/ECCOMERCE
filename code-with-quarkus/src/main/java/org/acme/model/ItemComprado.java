package org.acme.model;

public class ItemComprado {

    private long id_compraproduto;

    private double preco_unitario;
    private int qt_produto_comprado;

    private long fk_id_compra;
    private long fk_id_produto;


    public ItemComprado(long id_compraproduto, double preco_unitario, int qt_produto_comprado, long fk_id_compra, long fk_id_produto) {
        this.id_compraproduto = id_compraproduto;
        this.preco_unitario = preco_unitario;
        this.qt_produto_comprado = qt_produto_comprado;
        this.fk_id_compra = fk_id_compra;
        this.fk_id_produto = fk_id_produto;
    }

    public long getId_compraproduto() {
        return id_compraproduto;
    }

    public void setId_compraproduto(long id_compraproduto) {
        this.id_compraproduto = id_compraproduto;
    }

    public double getPreco_unitario() {
        return preco_unitario;
    }

    public void setPreco_unitario(double preco_unitario) {
        this.preco_unitario = preco_unitario;
    }

    public int getQt_produto_comprado() {
        return qt_produto_comprado;
    }

    public void setQt_produto_comprado(int qt_produto_comprado) {
        this.qt_produto_comprado = qt_produto_comprado;
    }

    public long getFk_id_compra() {
        return fk_id_compra;
    }

    public void setFk_id_compra(long fk_id_compra) {
        this.fk_id_compra = fk_id_compra;
    }

    public long getFk_id_produto() {
        return fk_id_produto;
    }

    public void setFk_id_produto(long fk_id_produto) {
        this.fk_id_produto = fk_id_produto;
    }
}
