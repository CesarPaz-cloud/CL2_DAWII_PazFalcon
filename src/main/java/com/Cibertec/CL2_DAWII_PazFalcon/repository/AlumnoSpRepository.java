package com.Cibertec.CL2_DAWII_PazFalcon.repository;

import com.Cibertec.CL2_DAWII_PazFalcon.model.AlumnoSp;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AlumnoSpRepository extends JpaRepository<AlumnoSp, Integer> {

    @Transactional
    @Modifying
    @Query(value = "{call sp_RegistrarAlumno(:nomAlumno, :apeAlumno)}",nativeQuery = true)
    void registrarAlumno(@Param("nomAlumno") String nomAlumno,
                         @Param("apeAlumno") String apeAlimno);

}
