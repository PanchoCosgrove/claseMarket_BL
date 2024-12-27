package com.cursosprimg.market.repository;

import com.cursosprimg.market.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductosRepository extends JpaRepository<Producto, Integer> {
    List<Producto> findByIdCategoria(int idCategoria);
}
