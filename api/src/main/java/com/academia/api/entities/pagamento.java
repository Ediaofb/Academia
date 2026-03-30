package com.academia.api.entities;

import java.io.Serializable;
import java.util.Date;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@Table(name = "pagamento")
public class pagamento implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long mensalidadeId;
    private Date data_pagamento;
    private float valor_pago;
    private String forma_pagamento;

    public pagamento() {
    }

    public pagamento(Long mensalidadeId, Date data_pagamento, float valor_pago, String forma_pagamento) {
        this.mensalidadeId = mensalidadeId;
        this.data_pagamento = data_pagamento;
        this.valor_pago = valor_pago;
        this.forma_pagamento = forma_pagamento;
    }
    
}