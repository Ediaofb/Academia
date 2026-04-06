package com.academia.api.entities;

import java.io.Serializable;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.time.LocalDate;


@Getter
@Setter
@ToString
@Entity
@Table(name = "mensalidade")
public class Mensalidade implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long contratoId;
    private LocalDate mes_ano;
    private LocalDate data_vencimento;
    private LocalDate data_pagamento;
    private float valor;
    private String status;
    private int pago;


    public Mensalidade() {
    }

    public Mensalidade(Long contratoId, LocalDate mes_ano, LocalDate data_vencimento, float valor, String status) {
        this.contratoId = contratoId;
        this.data_vencimento = data_vencimento;
        this.valor = valor;
        this.status = status;
    }
    
}