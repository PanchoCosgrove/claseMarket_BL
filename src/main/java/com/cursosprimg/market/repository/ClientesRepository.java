package com.cursosprimg.market.repository;

import com.cursosprimg.market.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientesRepository extends JpaRepository<Cliente, String> {

    Cliente findByUsuarioAndPassword(String usuario, String password);

}
