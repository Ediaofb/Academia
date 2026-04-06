package com.academia.api.repositories;

import com.academia.api.entities.Associado;
import org.springframework.data.jpa.repository.JpaRepository;
import java.time.LocalDate;
import java.util.List;

public interface AssociadoRepository extends JpaRepository<Associado, Long> {

    Associado findByCpf(String cpf); //select * from associado where cpf = 'cpf'
    Associado findByNome(String nome); //select * from associado where nome = 'nome'
    List<Associado> findByDataNascimento(LocalDate dataNascimento); //select * from associado where dataNascimento = 'dataNascimento'
    List<Associado> findByDataNascimentoBefore(LocalDate dataNascimento);
    List<Associado> findByDataNascimentoAfter(LocalDate dataNascimento);
    List<Associado> findByDataAdesao(LocalDate dataAdesao); //select * from associado where dataAdesao = 'dataAdesao'
    List<Associado> findByDataVencimento(LocalDate dataVencimento); //select * from associado where dataVencimento = 'dataVencimento'
    Associado findByEmail(String email); //select * from associado where email = 'email'
    Associado findByTelefone(Long telefone); //select * from associado where telefone = 'telefone'
}