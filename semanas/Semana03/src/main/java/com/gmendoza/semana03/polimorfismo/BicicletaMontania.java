/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gmendoza.semana03.polimorfismo;

/**
 *
 * @author gmendoza
 */
public class BicicletaMontania extends Bicicleta {

    private int cambio;

    public BicicletaMontania() {
        super();
        this.cambio = 6;
    }

    public BicicletaMontania(int cambio, String marca, String color, double velocidad, String pedales) {
        super(marca, color, velocidad, pedales);
        if (cambio > 0 && cambio < 12) {
            this.cambio = cambio;
        } else {
            this.cambio = 6;
        }
    }

    public int getCambio() {
        return cambio;
    }

    public void subirCambio() {
        if (this.cambio < 12) {
            cambio++;
        }
    }

    public void bajarCambio() {
        if (this.cambio > 1) {
            cambio--;
        }
    }

    @Override
    public void pedalear(double aceleracion) {
        double aceleracionConCambios = aceleracion * (cambio / 6.0);
        super.pedalear(aceleracionConCambios);
    }

    @Override
    public String getDescripcion() {
        return super.getDescripcion() + ", En el cambio " + cambio;
    }

}
