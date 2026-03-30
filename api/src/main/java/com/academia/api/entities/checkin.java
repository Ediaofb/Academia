package com.academia.api.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.util.Date;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Getter
@Setter
@ToString
@Entity
@Table(name = "checkin")

public class checkin implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long associadoId;
    private Long planoId;
    private Date data_inicio;
    private Date data_fim;
    private float valor_mensal;
    private String status;
        
    public checkin() {
    }
    
    public checkin(Long associadoId, Long planoId, 
        Date data_inicio, Date data_fim, float valor_mensal, String status) {
        this.associadoId = associadoId;
        this.planoId = planoId;
        this.data_inicio = data_inicio;
        this.data_fim = data_fim;
        this.valor_mensal = valor_mensal;
        this.status = status;
    }
}