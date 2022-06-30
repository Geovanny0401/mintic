/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.gmendoza.semana03;

import com.gmendoza.semana03.model.BicicletaMontania;

/**
 *
 * @author gmendoza
 */
public class Semana03 {

    public static void main(String[] args) {
        BicicletaMontania bicMontania = new BicicletaMontania();
        System.out.println("Mi bicicleta es de color: "+bicMontania.getColor()
        + " Marca de bicicleta: " +bicMontania.getMarca()
        + " Velocidad de la Bicicleta: "+bicMontania.getVelocidad());
    }
}
