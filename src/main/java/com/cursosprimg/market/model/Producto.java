package com.cursosprimg.market.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
@Entity
@Table(name = "productos")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idProducto")
    private Integer idProducto;

    @Column(name = "nombre", length = 45)
    private String nombre;

    @Column(name = "precioUnitario")
    private Double precioUnitario;

    @Column(name = "stock")
    private Integer stock;

    @Column(name = "idCategoria", length = 45)
    private Integer idCategoria;

    // Constructor vacío (requerido por JPA)
    public Producto() {
    }
}
