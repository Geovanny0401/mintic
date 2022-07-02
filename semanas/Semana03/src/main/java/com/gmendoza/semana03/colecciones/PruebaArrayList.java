/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gmendoza.semana03.colecciones;

import java.util.ArrayList;

/**
 *
 * @author gmendoza
 */
public class PruebaArrayList {

    public static void main(String[] args) {
        ArrayList<Estudiante> inscritos = new ArrayList<>();

        Estudiante primero = new Estudiante("Geovanny", "Mendoza", 28, 3.5);
        Estudiante segundo = new Estudiante("Joan", "", 23, 4.5);
        Estudiante tercero = new Estudiante("Santiago", "Fragozo", 25, 4.0);
        Estudiante cuarto = new Estudiante("Diana", "Lopez", 23, 4.3);

        inscritos.add(primero);
        inscritos.add(segundo);
        inscritos.add(tercero);
        inscritos.add(cuarto);
        
        System.out.println("Tamaño del ArrayList "+inscritos.size());
        
        inscritos.remove(0);
        
        System.out.println("Visualizar el nombre del estudiante "+inscritos.get(1).getNombre());
        
        System.out.println("El promedio: "+inscritos.get(2).getPromedio());
        
        System.out.println("Tamaño del ArrayList actual: "+inscritos.size());
        
    }
}
