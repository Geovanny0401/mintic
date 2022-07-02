/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gmendoza.demoherencia.model;

/**
 *
 * @author gmendoza
 */
public class Company extends TaxPayer {
    private Integer numberOfEmployees;

    public Company() {
    }

    public Company( String name, Double anualIcome, Integer numberOfEmployees) {
        super(name, anualIcome);
        this.numberOfEmployees = numberOfEmployees;
    }
    
    @Override
    public double tax(){
        if (numberOfEmployees > 10)
        {
            return getAnualIcome() * 0.14;
        }
        else {
           return getAnualIcome() * 0.16;
        }
    
    }

    public Integer getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(Integer numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }
    
    
    
}
