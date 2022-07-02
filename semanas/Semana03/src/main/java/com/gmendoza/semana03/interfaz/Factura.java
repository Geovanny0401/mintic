/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gmendoza.semana03.interfaz;

/**
 *
 * @author gmendoza
 */
public class Factura implements Constantes, Variaciones{

    private double totalSinIVA;
    private final static double IVA =0.16;

    public double getTotalSinIVA() {
        return totalSinIVA;
    }
    
    public double conIVA(){
        return this.totalSinIVA * (1+IVA);
    }
   
    
    @Override
    public void asignarValor(double x) {
       if(this.valorMinimo<x) 
           this.totalSinIVA=x;
       else
           this.totalSinIVA=0;
    }

    @Override
    public void descuento(double d) {
        this.totalSinIVA*=(1-d/100);
    }
    
    public static void main(String[] args) {
        Factura fac = new Factura();
        
        fac.asignarValor(250.0);
        
        System.out.println("El precio sin IVA es: "+fac.getTotalSinIVA()); 
        System.out.println("El precio con IVA es: "+fac.conIVA());
        
        System.out.println("Descuento durante el mes de Julio del 20%");
        
        fac.descuento(30);
        System.out.println("Descuento sin IVA es: "+fac.getTotalSinIVA());
        System.out.println("Descuento con IVA es: "+fac.conIVA());
                
    }
    
}
