/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.gmendoza.democoleccion;

import com.gmendoza.democoleccion.model.Empleado;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gmendoza
 */
public class DemoColeccion {

    public static void main(String[] args) {
              List<Empleado> lista1 = new ArrayList<>();
        lista1.add(new Empleado(1, "Geovanny", 20.0));
        lista1.add(new Empleado(2, "Alexandra", 25.0));
        lista1.add(new Empleado(3, "Castiblanco", 30.0));
        
          lista1.forEach(System.out::println);
    }
}
