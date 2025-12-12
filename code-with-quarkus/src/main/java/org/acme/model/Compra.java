package org.acme.model;

import java.time.LocalDate;

public class Compra {
    private long id_compra;

    private LocalDate dt_compra;
    private double vl_total;
    private char notafiscal_emitida; // S ou N

    private long fk_id_metodo_pagamento;

    private long fk_id_usuario;

    public Compra(long id_compra, LocalDate dt_compra, double vl_total, char notafiscal_emitida, long fk_id_metodo_pagamento, long fk_id_usuario) {
        this.id_compra = id_compra;
        this.dt_compra = dt_compra;
        this.vl_total = vl_total;
        this.notafiscal_emitida = notafiscal_emitida;
        this.fk_id_metodo_pagamento = fk_id_metodo_pagamento;
        this.fk_id_usuario = fk_id_usuario;
    }



    public long getId_compra() {
        return id_compra;
    }

    public void setId_compra(long id_compra) {
        this.id_compra = id_compra;
    }

    public LocalDate getDt_compra() {
        return dt_compra;
    }

    public void setDt_compra(LocalDate dt_compra) {
        this.dt_compra = dt_compra;
    }

    public double getVl_total() {
        return vl_total;
    }

    public void setVl_total(double vl_total) {
        this.vl_total = vl_total;
    }

    public char getNotafiscal_emitida() {
        return notafiscal_emitida;
    }

    public void setNotafiscal_emitida(char notafiscal_emitida) {
        this.notafiscal_emitida = notafiscal_emitida;
    }

    public long getFk_id_metodo_pagamento() {
        return fk_id_metodo_pagamento;
    }

    public void setFk_id_metodo_pagamento(long fk_id_metodo_pagamento) {
        this.fk_id_metodo_pagamento = fk_id_metodo_pagamento;
    }

    public long getFk_id_usuario() {
        return fk_id_usuario;
    }

    public void setFk_id_usuario(long fk_id_usuario) {
        this.fk_id_usuario = fk_id_usuario;
    }
}
