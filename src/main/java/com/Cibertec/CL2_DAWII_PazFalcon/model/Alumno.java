package com.Cibertec.CL2_DAWII_PazFalcon.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "Alumno")
public class Alumno {
    @Id
    public Integer idAl;
    @Column(name = "ApeAlumno")
    public String Ape;
    @Column(name = "NomAlumno")
    public String Nom;
    @Column(name = "procedencia")
    public String proc;

    @JsonBackReference
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn
    private Especialidad especialidad;

}
