/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gmendoza.semana03.polimorfismo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gmendoza
 */
public class ProbarMecanico {
    public static void main(String[] args) {
        Bicicleta cicla1, cicla2, cicla3, cicla4;
        
        cicla1 = new Bicicleta();
        cicla2 = new BicicletaMontania(5,"Trek","Rojo",0,"SRAM");
        cicla3 = new BicicletaRuta(32,"Specialized","Azul",0,"Shimano");
        cicla4 = new BicicletaMontania(6,"Scoot","Blanco",0,"SRAM");
        
        List<Bicicleta> bicicletas = new ArrayList<>();
        bicicletas.add(cicla1);
        bicicletas.add(cicla2);
        bicicletas.add(cicla3);
        bicicletas.add(cicla4);
        
        Mecanico guille = new Mecanico();
        guille.getMisPedales().add("Pinarello");
        guille.getMisPedales().add("Scoot");
        guille.getMisPedales().add("Cannondale");
        guille.getMisPedales().add("Giant");
        
        for (Bicicleta miCicla: bicicletas) {
            guille.ponerPedales(miCicla);
        }
               
    }
}
