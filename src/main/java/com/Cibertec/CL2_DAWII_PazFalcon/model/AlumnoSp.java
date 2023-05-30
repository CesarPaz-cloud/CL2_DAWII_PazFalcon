package com.Cibertec.CL2_DAWII_PazFalcon.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class AlumnoSp {
    @Id
    public Integer idAlu;
    public String nomAlu;
    public String apeAlu;
}
