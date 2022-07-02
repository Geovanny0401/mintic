/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gmendoza.semana03.polimorfismo;

/**
 *
 * @author gmendoza
 */
public class Bicicleta {

    private String marca;
    private String color;
    private double velocidad;
    private String pedales;

    public Bicicleta() {
        this.marca = "GW";
        this.color = "Blanco";
        this.velocidad = 0;
        this.pedales = "Shimano";
    }

    public Bicicleta(String marca, String color, double velocidad, String pedales) {
        this.marca = marca;
        this.color = color;
        this.velocidad = velocidad;
        this.pedales = pedales;
    }

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

    public String getPedales() {
        return pedales;
    }

    public void setPedales(String pedales) {
        this.pedales = pedales;
    }

    public void pedalear(double aceleracion) {
        this.velocidad = this.velocidad + aceleracion;
    }

    public void frenar() {
        if (this.velocidad > 0) {
            this.velocidad--;
        }
    }
    
    public String getDescripcion(){
    return "Bicileta de marca " + marca +", color "
            + color + ", velocidad " + velocidad 
            + ", y con pedales " +pedales;
    }

}
