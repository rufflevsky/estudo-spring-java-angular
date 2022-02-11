package com.rafael.projetofinancapi.resource;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.rafael.projetofinancapi.event.RecursoCriadoEvent;
import com.rafael.projetofinancapi.model.Categoria;
import com.rafael.projetofinancapi.repository.CategoriaRepository;

@RestController
@RequestMapping("/categorias")
public class CategoriaResource {
		
		@Autowired
		private CategoriaRepository categoriaRepository;
		
		@Autowired
		private ApplicationEventPublisher publisher;
		
		@GetMapping
		public List<Categoria> listar(){
			return categoriaRepository.findAll();
		}
		
		@GetMapping("/{codigo}")
		public ResponseEntity<Optional<Categoria>> buscarPeloCodigo(@PathVariable Long codigo) {
			Optional<Categoria> categoria = categoriaRepository.findById(codigo);
			return !categoria.isEmpty() ? ResponseEntity.ok(categoria) : ResponseEntity.notFound().build();
		}
		
		@PostMapping
		public ResponseEntity<Categoria> criar(@Valid @RequestBody Categoria categoria, HttpServletResponse response) {
			Categoria categoriaSalva = categoriaRepository.save(categoria);
			
			publisher.publishEvent(new RecursoCriadoEvent(this, response, categoriaSalva.getCodigo()));
			
			return ResponseEntity.status(HttpStatus.CREATED).body(categoriaSalva);
			
		}
		
		 
		

		
}
