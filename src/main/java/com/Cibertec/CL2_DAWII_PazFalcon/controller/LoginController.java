package com.Cibertec.CL2_DAWII_PazFalcon.controller;

import com.Cibertec.CL2_DAWII_PazFalcon.model.Usuario;
import com.Cibertec.CL2_DAWII_PazFalcon.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("auth")
public class LoginController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/login")
    public String login(){
        return "login/frmLogin";
    }
    @GetMapping("/registrar")
    public String registrar(){
        return "login/frmRegistroUsuario";
    }

    @PostMapping("/guardarUsuario")
    public String guardarUsuario(@ModelAttribute Usuario usuario){
        usuarioService.guardarUsuario(usuario);
        return "login/login";
    }
}
