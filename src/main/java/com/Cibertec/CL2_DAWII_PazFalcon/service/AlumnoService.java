package com.Cibertec.CL2_DAWII_PazFalcon.service;


import com.Cibertec.CL2_DAWII_PazFalcon.model.Alumno;
import com.Cibertec.CL2_DAWII_PazFalcon.repository.AlumnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlumnoService {
    @Autowired
    private AlumnoRepository alumnoRepository;

    public List<Alumno> listarAlumnos() {
        return alumnoRepository.findAll();
    }
    public void registrarAlumno(Alumno alumno){
       alumnoRepository.save(alumno);
    }
    public  void eliminarAlumno(Alumno idAl){
        alumnoRepository.deleteById(idAl.getIdAl());
    }
}
