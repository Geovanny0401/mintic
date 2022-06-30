/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gmendoza.semana03.model;

/**
 *
 * @author gmendoza
 */
public class Circulo extends Figura {

    private double radio;

    public Circulo() {
        this.radio=0;
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    @Override
    public double getArea() {
       return Math.PI * this.radio*this.radio; 
    }

    @Override
    public double getPerimetro() {
        return 2 * Math.PI*this.radio;
    }
    
}
