package com.cdainfo;

import com.cdainfo.dominio.Alumno;
import com.cdainfo.repository.AlumnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
public class AlumnoController {
    @Autowired
    AlumnoRepository alumnoRepository;

    @GetMapping("/alumnos")
    public List<Alumno> getAllAlumnos() {
        return alumnoRepository.findAll();
    }

    @GetMapping("/alumno/{id}")
    public Optional<Alumno> getAllAlumnos(@PathVariable Long id) {
        return alumnoRepository.findById(id);
    }

    @GetMapping("/alumno/search/{name}")
    public List<Alumno> getAlumnosByName(@PathVariable String name) {
        return alumnoRepository.findAllByNameLike("%"+name+"%");
    }

    @GetMapping("/alumno/search2/{name}")
    public List<Alumno> getAlumnosByNameAndSurname(@PathVariable String name) {
        return alumnoRepository.findAllByNameLikeOrSurnameLike("%"+name+"%", "%"+name+"%");
    }


    @PostMapping("/alumno/add")
    public Alumno create(@RequestBody Alumno body) {
        return alumnoRepository.save(body);
    }

    @PutMapping("/alumno/")
    public Alumno update(@RequestBody Alumno body) {
        return alumnoRepository.save(body);
    }

    @DeleteMapping("/alumno/{id}")
    public Alumno delete(@PathVariable Long id) {
        Optional<Alumno> al = alumnoRepository.findById(id);
        if ( al.isPresent() ) {
            alumnoRepository.delete(al.get());
            return al.get();
        } else {
            return null;
        }
    }


}
