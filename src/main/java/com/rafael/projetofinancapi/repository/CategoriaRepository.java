package com.rafael.projetofinancapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.rafael.projetofinancapi.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

}
