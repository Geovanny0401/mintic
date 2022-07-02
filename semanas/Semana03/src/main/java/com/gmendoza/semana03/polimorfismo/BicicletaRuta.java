/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gmendoza.semana03.polimorfismo;

/**
 *
 * @author gmendoza
 */
public class BicicletaRuta extends Bicicleta {

    private double anchoNeumatico;

    public BicicletaRuta() {
        super();
        this.anchoNeumatico = 28;
    }

    public BicicletaRuta(double anchoNeumatico, String marca, String color, double velocidad, String pedales) {
        super(marca, color, velocidad, pedales);
        if (anchoNeumatico > 17 && anchoNeumatico <= 62) {
            this.anchoNeumatico = anchoNeumatico;
        } else {
            this.anchoNeumatico = 28;
        }
    }

    public double getAnchoNeumatico() {
        return anchoNeumatico;
    }

    public void setAnchoNeumatico(double anchoNeumatico) {
        this.anchoNeumatico = anchoNeumatico;
    }
    
    @Override
    public String getDescripcion(){
        return super.getDescripcion() + ", y con ancho de neutmatico"
                + anchoNeumatico;
    }

}
