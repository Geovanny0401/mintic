/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gmendoza.demoherencia.model;

/**
 *
 * @author gmendoza
 */
public abstract class TaxPayer {
    
    private String name;
    private Double anualIcome;
    
     public abstract double tax();

    public TaxPayer() {
    }

    public TaxPayer(String name, Double anualIcome) {
        this.name = name;
        this.anualIcome = anualIcome;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAnualIcome() {
        return anualIcome;
    }

    public void setAnualIcome(Double anualIcome) {
        this.anualIcome = anualIcome;
    }
    
    
    
}
