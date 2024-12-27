package com.cursosprimg.market.service;

import com.cursosprimg.market.model.Categoria;
import com.cursosprimg.market.model.Producto;

import java.util.List;

public interface ProductosService {

    List<Categoria> categorias();
    List<Producto> productosPorCategoria(int idCategoria);
    Producto actualizarStock(int idProducto, int unidades);
    Producto productoPorCodigo(int idProducto);
}
