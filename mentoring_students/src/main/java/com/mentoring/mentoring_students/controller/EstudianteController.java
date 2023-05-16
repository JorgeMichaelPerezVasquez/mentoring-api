package com.mentoring.mentoring_students.controller;

import com.mentoring.mentoring_students.domain.Estudiante;
import com.mentoring.mentoring_students.service.EstudianteService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estudiantes")
public class EstudianteController {
    private final EstudianteService estudianteService;

    public EstudianteController(EstudianteService estudianteService){
        this.estudianteService = estudianteService;
    }

    @PostMapping
    public ResponseEntity<Estudiante> addEstudiante(@RequestBody Estudiante estudiante){
        return new ResponseEntity<Estudiante>(estudianteService.createEstudiante(estudiante), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Estudiante>> getAllEstudiantes(){
        return new ResponseEntity<List<Estudiante>>(estudianteService.getAllEstudiantes(), HttpStatus.OK);
    }

}

