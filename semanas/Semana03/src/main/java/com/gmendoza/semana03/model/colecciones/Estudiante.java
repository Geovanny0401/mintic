/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gmendoza.semana03.model.colecciones;

/**
 *
 * @author gmendoza
 */
public class Estudiante {
    private String nombre;
    private String apellidos;
    private int edad;
    private double promedio;

    public Estudiante() {
        this.nombre="";
        this.apellidos="";
        this.edad=0;
        this.promedio=0.0;
    }

    public Estudiante(String nombre, String apellidos, int edad, double promedio) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.promedio = promedio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
    
    
}
