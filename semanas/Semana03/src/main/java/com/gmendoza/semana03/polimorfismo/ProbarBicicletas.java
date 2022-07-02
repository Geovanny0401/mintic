/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gmendoza.semana03.polimorfismo;

/**
 *
 * @author gmendoza
 */
public class ProbarBicicletas {
    public static void main(String[] args) {
        Bicicleta cicla1, cicla2, cicla3;
        
        cicla1 = new Bicicleta();
        cicla2 = new BicicletaMontania(5,"Trek","Rojo",0,"SRAM");
        cicla3 = new BicicletaRuta(32,"Specialized","Azul",0,"Shimano");
        
        System.out.println("Bicicleta: " +cicla1.getDescripcion());
        System.out.println("Bicicleta Montaña: " +cicla2.getDescripcion());
        System.out.println("Bicicleta Ruta: " +cicla3.getDescripcion());
    }
}
