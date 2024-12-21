package com.cursosprimg.market.service;

import com.cursosprimg.market.model.Cliente;

public interface ClientesService {
    Cliente autenticarCliente(String usuario, String password);
    boolean registrarCliente(Cliente cliente);

}
