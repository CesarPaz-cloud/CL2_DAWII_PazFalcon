package com.Cibertec.CL2_DAWII_PazFalcon.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "Usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idUsuario;
    @Column(name = "Nombres")
    private String nombres;
    @Column(name = "Apellidos")
    private String apellidos;
    @Column(name = "NomUsuario")
    private String nomUsuario;
    @Column(name = "PassUsuario")
    private String contra;
}
