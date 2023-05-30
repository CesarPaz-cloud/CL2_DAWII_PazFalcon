package com.Cibertec.CL2_DAWII_PazFalcon.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name = "Especialidad")
public class Especialidad {
    @Id
    public String idEs;
    @Column(name = "NomEsp")
    public String nomEs;
    @Column(name = "Costo")
    public double Costo;

    @JsonManagedReference
    @OneToMany(mappedBy = "especialidad", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Alumno> listaAlumno = new ArrayList<>();

}
