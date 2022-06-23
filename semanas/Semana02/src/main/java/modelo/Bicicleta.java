package modelo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gmendoza
 */
public class Bicicleta {
    
    private String marca;
    private String color;
    private double velocidad;
    private String referencia;
    
    public Bicicleta() {
        this.marca="GW";
        this.color="Rojo";
        this.velocidad=0;
        this.referencia="Ninguna";
    }

    public Bicicleta(String marca, String color, double velocidad, String referencia) {
        this.marca = marca;
        this.color = color;
        this.velocidad = velocidad;
        this.referencia = referencia;
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

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }
    
    public void pedalear(double aceleracion){
      this.velocidad = this.velocidad + aceleracion;
    }
    
    public void frenar(){
        if(this.velocidad >0){
        this.velocidad--;
        }
    }
    
    public void frenar(double aceleracionNegativa){
        if(this.velocidad > aceleracionNegativa){
        this.velocidad = this.velocidad-aceleracionNegativa;
        }
    }
    
    public void frenar(String intensidad){
        if(intensidad.equals("fuerte")){
            if(this.velocidad>10){
        this.velocidad = this.velocidad-10;
            }
        }else{
        if(this.velocidad>0){
        this.velocidad--;
        }
        }
    }

}
