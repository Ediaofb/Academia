package com.academia.api.entities;

import java.io.Serializable;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import java.time.LocalDate;

@Getter
@Setter
@ToString
@Entity
@Table(name = "contrato")
public class Contrato implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long associadoId;
    private Long planoId;
    private LocalDate data_inicio;
    private LocalDate data_fim;
    private float valor_mensal;
    private String status;

    public Contrato() {
    }

    public Contrato(Long associadoId, Long planoId, LocalDate data_inicio, LocalDate data_fim, float valor_mensal, String status) {
        this.associadoId = associadoId;
        this.planoId = planoId;
        this.data_inicio = data_inicio;
        this.data_fim = data_fim;
        this.valor_mensal = valor_mensal;
        this.status = status;
    }
    
}
