package com.Cibertec.CL2_DAWII_PazFalcon.repository;

import com.Cibertec.CL2_DAWII_PazFalcon.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

    Usuario findByNomUsuario(String nomUsuario);
    Usuario findbyNombres(String nombres);
}
