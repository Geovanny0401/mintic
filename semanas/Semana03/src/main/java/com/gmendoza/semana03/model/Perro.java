/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gmendoza.semana03.model;

/**
 *
 * @author gmendoza
 */
public class Perro implements Animal {


    @Override
    public void Imprimir(String s) {
        System.out.println("Hola Mundo!"+s); 
    }
    
    public static void main(String[] args) {
        Animal an = new Perro();
        an.Imprimir("Diana");
    }
    
}
