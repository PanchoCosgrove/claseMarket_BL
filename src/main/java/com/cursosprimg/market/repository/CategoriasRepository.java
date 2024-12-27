package com.cursosprimg.market.repository;

import com.cursosprimg.market.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriasRepository extends JpaRepository<Categoria, Integer> {
}
