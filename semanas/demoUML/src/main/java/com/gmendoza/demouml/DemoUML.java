/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.gmendoza.demouml;

import com.gmendoza.demouml.modelo.Aeropuerto;
import com.gmendoza.demouml.modelo.Autor;
import com.gmendoza.demouml.modelo.Cliente;
import com.gmendoza.demouml.modelo.Libro;
import com.gmendoza.demouml.modelo.Persona;

/**
 *
 * @author gmendoza
 */
public class DemoUML {

    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("Geovanny");
        persona.caminar();
        System.out.println("Nombre es: "+persona.getNombre());
        

 /* Aeropuerto aeropuerto = new Aeropuerto();
        aeropuerto.setCiudad("Barranquilla");
        System.out.println("Nombre de la ciudad: "+aeropuerto.getCiudad());
        aeropuerto.setCiudad("Medellin");
        System.out.println("Nombre de la ciudad: "+aeropuerto.getCiudad());
        aeropuerto.setCiudad("Valledupar");
        System.out.println("Nombre de la ciudad: "+aeropuerto.getCiudad());
        
        Autor autor = new Autor(123456, "Geovanny", "geovanny@gmail.com", 'M');
        System.out.println(autor);

        Libro libro = new Libro("Java 11", autor, 20.0, 4);

        libro.setPrecio(30.5);
        libro.setCantidad(10);
        System.out.println("Nombre Libro: " + libro.getNombre());
        System.out.println("Precio Libro: " + libro.getPrecio());
        System.out.println("Cantidad del Libro: " + libro.getCantidad());
        System.out.println("Autor: " + libro.getAutor());
        System.out.println("Nombre Autor: " + libro.getAutor().getName());
        System.out.println("Email Autor: " + libro.getAutor().getEmail());

        Libro libro2 = new Libro("Java 17", new Autor(2345,"Alejandro","alejandro@gmail.com",'M'), 40.0);
        System.out.println(libro2);
        
         
        Cliente cliente = new Cliente(22,"Geovanny", 10);
        System.out.println(cliente);
        
        cliente.setDescuento(7);
        System.out.println("Id Cliente" +cliente.getIdCliente());
            */    
    }
}
