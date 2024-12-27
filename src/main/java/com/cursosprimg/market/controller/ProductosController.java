package com.cursosprimg.market.controller;

import com.cursosprimg.market.model.Categoria;
import com.cursosprimg.market.model.Producto;
import com.cursosprimg.market.service.ProductosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
public class ProductosController {

    @Autowired
    ProductosService productosService;

    @GetMapping(value="d", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Categoria>> categorias(){
        return new ResponseEntity<>(productosService.categorias(), HttpStatus.OK);
    }

    @GetMapping(value="productos", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Producto>> productosCategorias(@RequestParam("idCategoria") int idCategoria){
        return new ResponseEntity<>(productosService.productosPorCategoria(idCategoria), HttpStatus.OK);
    }

    @GetMapping(value="producto", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Producto> productoCodigo(@RequestParam("idProducto") int idProducto){
        return new ResponseEntity<>(productosService.productoPorCodigo(idProducto), HttpStatus.OK);
    }

    @PutMapping(value = "compra")
    public ResponseEntity<Void> actualizarStock(@RequestParam("idProducto") int idProducto, @RequestParam("unidades") int unidades){
        Producto producto = productosService.actualizarStock(idProducto, unidades);
        if (producto != null){
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.CONFLICT);
        }
    }
}
