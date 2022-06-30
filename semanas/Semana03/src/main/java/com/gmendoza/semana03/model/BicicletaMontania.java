/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gmendoza.semana03.model;

/**
 *
 * @author gmendoza
 */
public class BicicletaMontania extends Bicicleta {

    private int cambio;

    public BicicletaMontania() {
        super();
        this.cambio = 5;
    }

    public BicicletaMontania(int cambio, String marca, String color, double velocidad) {
        super(marca, color, velocidad);
        this.cambio = cambio;
        if (this.cambio > 0 && this.cambio <= 10) {
            this.cambio = cambio;
        } else {
            this.cambio = 5;
        }
    }

    public int getCambio() {
        return cambio;
    }

    public void subirCambio() {
        if (this.cambio < 10) {
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
        double aceleracionConCambios = aceleracion * (this.cambio / 5);
        super.pedalear(aceleracionConCambios);
    }
}
