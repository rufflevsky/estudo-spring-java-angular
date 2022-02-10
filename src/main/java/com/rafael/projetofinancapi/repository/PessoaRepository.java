package com.rafael.projetofinancapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.rafael.projetofinancapi.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long>{

}
