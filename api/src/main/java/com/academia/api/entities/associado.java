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
import java.util.Date;

@Getter
@Setter
@ToString
@Entity
@Table(name = "associado")
public class associado implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private Long telefone;
    private String cpf;
    private String endereco;
    private Date dataNascimento;
    private Date dataAdesao;
    private Date dataVencimento;
    private String status;
        
    public associado() {
    }
    
    public associado(String nome, String email, Long telefone, String cpf, String endereco, 
        Date dataNascimento, Date dataAdesao, Date dataVencimento, String status) {
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