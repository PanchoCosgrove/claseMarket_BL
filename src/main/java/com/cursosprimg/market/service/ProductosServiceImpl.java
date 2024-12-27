package com.cursosprimg.market.service;

import com.cursosprimg.market.model.Categoria;
import com.cursosprimg.market.model.Producto;
import com.cursosprimg.market.repository.CategoriasRepository;
import com.cursosprimg.market.repository.ProductosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductosServiceImpl implements ProductosService{

    @Autowired
    CategoriasRepository categoriasRepository;

    @Autowired
    ProductosRepository productosRepository;

    @Override
    public List<Categoria> categorias() {
        return categoriasRepository.findAll();
    }

    @Override
    public List<Producto> productosPorCategoria(int idCategoria) {
        return productosRepository.findByIdCategoria(idCategoria);
    }

    @Override
    public Producto actualizarStock(int idProducto, int unidades) {
        Producto producto = productoPorCodigo(idProducto);
        if (producto != null && producto.getStock() >= unidades) {
            producto.setStock(producto.getStock() - unidades);
            productosRepository.save(producto);
            return producto;
        }
        return null;
    }

    @Override
    public Producto productoPorCodigo(int idProducto) {
        return productosRepository.findById(idProducto).orElse(null);
    }
}
