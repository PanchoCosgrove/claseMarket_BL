package com.cursosprimg.market.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Entity
@Table(name = "categorias")
@Data
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCategoria")
    private Integer idCategoria;

    @Column(name = "categoria", length = 45)
    private String nombreCategoria;

    @Column(name = "descripcion", length = 200)
    private String descripcion;

    // Constructor vacío (requerido por JPA)
    public Categoria() {
    }
}
