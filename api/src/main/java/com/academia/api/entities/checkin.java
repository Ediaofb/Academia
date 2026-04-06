package com.academia.api.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.io.Serializable;
import java.time.LocalDate;

@Getter
@Setter
@ToString
@Entity
@Table(name = "checkin")
public class Checkin implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long associadoId;
    private Long planoId;
    private LocalDate data_inicio;
    private LocalDate data_fim;
    private float valor_mensal;
    private String status;
        
    public Checkin() {
    }
    
    public Checkin(Long associadoId, Long planoId, 
        LocalDate data_inicio, LocalDate data_fim, float valor_mensal, String status) {
        this.associadoId = associadoId;
        this.planoId = planoId;
        this.data_inicio = data_inicio;
        this.data_fim = data_fim;
        this.valor_mensal = valor_mensal;
        this.status = status;
    }
}