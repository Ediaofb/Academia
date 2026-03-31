package com.academia.api.entities;

import java.io.Serializable;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@ToString
@Entity
@Table(name = "plano")
public class plano implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String descricao;
    private float valor_mensal;

    public plano() {
    }

    public plano(String nome, String descricao, float valor_mensal) {
        this.nome = nome;
        this.descricao = descricao;
        this.valor_mensal = valor_mensal;
    }
    
}