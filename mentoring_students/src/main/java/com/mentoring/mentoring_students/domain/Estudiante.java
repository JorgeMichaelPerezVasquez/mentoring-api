package com.mentoring.mentoring_students.domain;

import jakarta.persistence.*;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name="estudiantes")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Estudiante{
    @Id
    private long DNI;
    @Column(name="nombre",nullable = false)
    private String nombre;
    @Column(name="correo",nullable = false)
    private String correo;
    @Column(name="contraseña",nullable = false)
    private String contraseña;
    @Column(name="intereses",nullable = false)
    private String intereses;
    public long getDNI() {
        return DNI;
    }
    public String getNombre() {
        return nombre;
    }
    public String getCorreo() {
        return correo;
    }
    public String getContraseña() {
        return contraseña;
    }
    public String getIntereses() {
        return intereses;
    }
    public void setDNI(long DNI) {
        this.DNI = DNI;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    public void setIntereses(String intereses) {
        this.intereses = intereses;
    }
}