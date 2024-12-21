package com.cursosprimg.market.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "clientes")
public class Cliente {

    @Id
    @Column(name = "usuario", nullable = false)
    private String usuario;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "direccion")
    private String direccion;

    @Column(name = "email")
    private String email;
}
