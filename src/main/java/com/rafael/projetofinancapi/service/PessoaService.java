package com.rafael.projetofinancapi.service;

import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.rafael.projetofinancapi.model.Pessoa;
import com.rafael.projetofinancapi.repository.PessoaRepository;

@Service
public class PessoaService {
	
	@Autowired
	private PessoaRepository pessoaRepository;
	
	public Pessoa atualizar(Long codigo, Pessoa pessoa) {
		Optional<Pessoa> pessoaAtualizar = pessoaRepository.findById(codigo);
		if (!pessoaAtualizar.isEmpty()) {
			pessoa.setCodigo(codigo); 
			return pessoaRepository.save(pessoa);		
		}else {
			throw new EmptyResultDataAccessException(1);
		}		
	}
	
	public Pessoa atualizarAtivo(Long codigo, Boolean ativo) {
		Pessoa pessoaAtualizar = pessoaRepository.getById(codigo);
	
		if (pessoaAtualizar != null) {

			pessoaAtualizar.setAtivo(ativo); 
			return pessoaRepository.save(pessoaAtualizar);		
		}else {
			throw new EntityNotFoundException();
		}
	}
}
