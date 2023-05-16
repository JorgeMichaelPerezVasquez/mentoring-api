package com.mentoring.mentoring_students.service;

import com.mentoring.mentoring_students.domain.Estudiante;
import com.mentoring.mentoring_students.repository.EstudianteRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EstudianteServiceImpl implements EstudianteService {
    private final EstudianteRepository estudianteRepository;

    public EstudianteServiceImpl(EstudianteRepository estudianteRepository)
    {
        this.estudianteRepository = estudianteRepository;
    }
    @Override
    public Estudiante createEstudiante(Estudiante estudiante) {
        return estudianteRepository.save(estudiante);
    }

    @Override
    public List<Estudiante> getAllEstudiantes() {
        return estudianteRepository.findAll();
    }
}
