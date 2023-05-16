package com.mentoring.mentoring_students.service;

import com.mentoring.mentoring_students.domain.Estudiante;

import java.util.List;

public interface EstudianteService {
    Estudiante createEstudiante(Estudiante estudiante);
    List<Estudiante> getAllEstudiantes();

}
