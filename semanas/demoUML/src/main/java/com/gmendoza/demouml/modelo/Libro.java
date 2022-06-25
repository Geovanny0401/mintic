/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gmendoza.demouml.modelo;

/**
 *
 * @author gmendoza
 */
public class Libro {
    private String nombre;
    private Autor autor;
    private double precio;
    private int cantidad=0;

    public Libro(String nombre, Autor autor, double precio) {
        this.nombre = nombre;
        this.autor = autor;
        this.precio = precio;
    }
    
    public Libro(String nombre, Autor autor, double precio, int canitdad) {
        this.nombre = nombre;
        this.autor = autor;
        this.precio = precio;
        this.cantidad=cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Libro{" + "nombre=" + nombre + ", autor=" + autor + ", precio=" + precio + ", cantidad=" + cantidad + '}';
    }
    
    
    
}
