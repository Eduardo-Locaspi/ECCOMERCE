package org.acme.model;

public class MetodoPagamento {
    private long id_metodo_pagamento;
    private String nm_metodo_pagamento;

    public MetodoPagamento(long id_metodo_pagamento, String nm_metodo_pagamento) {
        this.id_metodo_pagamento = id_metodo_pagamento;
        this.nm_metodo_pagamento = nm_metodo_pagamento;
    }

    public long getId_metodo_pagamento() {
        return id_metodo_pagamento;
    }

    public void setId_metodo_pagamento(long id_metodo_pagamento) {
        this.id_metodo_pagamento = id_metodo_pagamento;
    }

    public String getNm_metodo_pagamento() {
        return nm_metodo_pagamento;
    }

    public void setNm_metodo_pagamento(String nm_metodo_pagamento) {
        this.nm_metodo_pagamento = nm_metodo_pagamento;
    }
}
