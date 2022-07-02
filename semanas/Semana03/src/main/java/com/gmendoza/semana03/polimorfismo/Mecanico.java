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
public class Mecanico {
    
    private List<String> misPedales;

    public Mecanico() {
        misPedales = new ArrayList<>();
    }

    public List<String> getMisPedales() {
        return misPedales;
    }

    public void setMisPedales(List<String> misPedales) {
        this.misPedales = misPedales;
    }
    
    public void ponerPedales(Bicicleta unaCicla){
      String pedalesAPoner = this.misPedales.get(0);
      unaCicla.setPedales(pedalesAPoner);
      this.misPedales.remove(0);
        System.out.println("Coloco pedales de marca "
        + pedalesAPoner + " a una " + unaCicla.getClass().getSimpleName());
    }
    
}
