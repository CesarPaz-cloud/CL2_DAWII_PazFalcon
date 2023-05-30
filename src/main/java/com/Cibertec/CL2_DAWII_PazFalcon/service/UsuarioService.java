package com.Cibertec.CL2_DAWII_PazFalcon.service;

import com.Cibertec.CL2_DAWII_PazFalcon.model.Usuario;
import com.Cibertec.CL2_DAWII_PazFalcon.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    private BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();

    public Usuario buscarUsuarioporNombredeUsaurio(String nomUsuario){
        return usuarioRepository.findByNomUsuario(nomUsuario);
    }
    public Usuario guardarUsuario(Usuario usuario){
        usuario.setContra(bCryptPasswordEncoder.encode(usuario.getContra()));
        return usuarioRepository.save(usuario);
    }
}
