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
@Table(name = "associado")
public class Associado implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private Long telefone;
    private String cpf;
    private String endereco;
    private LocalDate dataNascimento;
    private LocalDate dataAdesao;
    private LocalDate dataVencimento;
    private String status;
        
    public Associado() {
    }
    
    public Associado(String nome, String email, Long telefone, String cpf, String endereco, 
        LocalDate dataNascimento, LocalDate dataAdesao, LocalDate dataVencimento, String status) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.cpf = cpf;
        this.endereco = endereco;
        this.dataNascimento = dataNascimento;
        this.dataAdesao = dataAdesao;
        this.dataVencimento = dataVencimento;
        this.status = status;
    }
}