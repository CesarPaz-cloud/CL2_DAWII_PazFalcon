package com.Cibertec.CL2_DAWII_PazFalcon.controller;

import com.Cibertec.CL2_DAWII_PazFalcon.model.Alumno;
import com.Cibertec.CL2_DAWII_PazFalcon.model.Especialidad;
import com.Cibertec.CL2_DAWII_PazFalcon.model.register.RegisterAl;
import com.Cibertec.CL2_DAWII_PazFalcon.model.response.ResponseAl;
import com.Cibertec.CL2_DAWII_PazFalcon.service.AlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/Alumno")
public class AlumnoController {

    @Autowired
    private AlumnoService alumnoService;

    @GetMapping("/frmMantAlumno")
    public String frmMantAlumno(Model model) {
        model.addAttribute("listarAlumnos", alumnoService.listarAlumnos());
        return "Alumno/frmMantAlumno";
    }
    @PostMapping("/registratAlumno")
    @ResponseBody
    public ResponseAl registrarAlumno(@RequestBody RegisterAl registerAl) {
        String mensaje = "Alumno registrado correctamente";
        Boolean respuesta = true;

        try {
            Alumno alumno = new Alumno();
            if(registerAl.getIdAl() > 0) {
                alumno.setIdAl(registerAl.getIdAl());
            }
            alumno.setNom(registerAl.getNombre());
            alumno.setApe(registerAl.getApellidos());
            Especialidad especialidad = new Especialidad();
            especialidad.setIdEs(registerAl.getIdEsp());
            alumno.setEspecialidad(especialidad);
        } catch (Exception ex){
            mensaje = "Alumno no registrado";
            respuesta = false;
        }
        return ResponseAl.builder().mensaje(mensaje).respuesta(respuesta).build();
    }

    @GetMapping("/listarAlumnos")
    @ResponseBody
    public List<Alumno> listarAlumno() {
        return alumnoService.listarAlumnos();
    }
}
