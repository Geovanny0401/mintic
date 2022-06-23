/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.gmendoza.ejemplopoo;

import modelo.Bicicleta;
import modelo.Estudiante;


/**
 *
 * @author gmendoza
 */
public class EjemploPOO {

    public static void main(String[] args) {
      //1. Declaracion
      //2. Instanciacion
      //3. Inicializacion
      
      Bicicleta bicicleta;
      Estudiante estudiante;
      
      bicicleta = new Bicicleta("BMW","Rojo",20.0,"Ninguna");
        System.out.println("Marca de la Bicicleta: "+bicicleta.getMarca());
        System.out.println("Color de la Bicicleta: "+bicicleta.getColor());
        System.out.println("Velocidad Inicial de la Bicicleta: "+bicicleta.getVelocidad());
        bicicleta.pedalear(5);
        bicicleta.pedalear(2);
        System.out.println("Velocidad Inicial Actual de la Bicicleta: "+bicicleta.getVelocidad());
        bicicleta.frenar(6);
        System.out.println("Velocidad de la Bicicleta: "+bicicleta.getVelocidad());
    }
}
