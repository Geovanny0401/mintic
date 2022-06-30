/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gmendoza.semana03.model;

/**
 *
 * @author gmendoza
 */
public class Bicicleta {

    //Atributos
    private String marca;
    private String color;
    private double velocidad;

    //Constructor sin parametro
    public Bicicleta() {
        this.marca = "GW";
        this.color = "rojo";
        this.velocidad = 0;
    }

    //constructor con tres parametros
    public Bicicleta(String marca, String color, double velocidad) {
        this.marca = marca;
        this.color = color;
        this.velocidad = velocidad;
    }

    //Adicionar los getter y setter
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    //metodo pedalear 
    public void pedalear(double aceleracion) {
        this.velocidad = this.velocidad + aceleracion;
    }

    //metodo frenar
    public void frenar() {
        if (this.velocidad > 0) {
            this.velocidad--;
        }
    }

    public void frenar(double aceleracionNegativa) {
        if (this.velocidad > aceleracionNegativa) {
            this.velocidad = this.velocidad - aceleracionNegativa;
        }
    }

    public void frenar(String intesidad) {
        if (intesidad.equals("fuerte")) {
            if (this.velocidad > 10) {
                this.velocidad = this.velocidad - 10;
            }
        } else {
            if (this.velocidad > 0) {
                this.velocidad--;
            }
        }
    }

}
