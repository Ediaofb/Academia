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
@Table(name = "mensalidade")

public class mensalidade implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long contratoId;
    private Date mes_ano;
    private Date data_vencimento;
    private Date data_pagamento;
    private float valor;
    private String status;
    private int pago;


    public mensalidade() {
    }

    public mensalidade(Long contratoId, Date data_vencimento, float valor, String status) {
        this.contratoId = contratoId;
        this.data_vencimento = data_vencimento;
        this.valor = valor;
        this.status = status;
    }
    
}