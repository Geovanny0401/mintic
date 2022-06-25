/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gmendoza.demouml.modelo;

/**
 *
 * @author gmendoza
 */
public class Persona {
    private int documento;
    private String nombre;
    private String apellido;
    private int edad;
    
    public void caminar(){
        System.out.println("Caminar Yeidis");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
