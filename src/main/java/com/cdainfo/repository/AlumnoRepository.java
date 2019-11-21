package com.cdainfo.repository;

import com.cdainfo.dominio.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AlumnoRepository extends JpaRepository<Alumno, Long> {

    List<Alumno> findAllByNameLike(String name);

    List<Alumno> findAllByNameLikeOrSurnameLike(String name, String surname);

}
