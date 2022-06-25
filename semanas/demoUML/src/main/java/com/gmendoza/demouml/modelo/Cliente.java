/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gmendoza.demouml.modelo;

/**
 *
 * @author gmendoza
 */
public class Cliente {
    private int idCliente;
    private String nombre;
    private int descuento;

    public Cliente(int idCliente, String nombre, int descuento) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.descuento = descuento;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    @Override
    public String toString() {
        return "Cliente{" + " nombre=" + nombre + ", idCliente=" + idCliente + ", descuento=" + descuento + '}';
    }
    
    
}
