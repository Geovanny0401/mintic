/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gmendoza.demoherencia.model;

/**
 *
 * @author gmendoza
 */
public class Individual extends TaxPayer{
    
     private Double healthExpenditures;

    public Individual() {
    }

    public Individual(String name, Double anualIcome, Double healthExpenditures) {
        super(name, anualIcome);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }
     
    public double tax(){
        double basicTax;
        if(getAnualIcome() <20000.0){
        basicTax= getAnualIcome() *0.15;
        }
        else{
            basicTax= getAnualIcome() *0.25;
        }
        basicTax-= getHealthExpenditures()*0.5;
        if(basicTax <0.0){
         basicTax=0.0;
        }
        return basicTax;
    
    } 
    
}
