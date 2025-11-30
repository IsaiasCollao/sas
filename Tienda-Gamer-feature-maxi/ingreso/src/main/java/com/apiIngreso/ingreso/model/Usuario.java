package com.apiIngreso.ingreso.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {
    private Long rut;
    private String nombre;
    private String email;
    private String password;
    private String rol;
}