/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.gmendoza.democoleccion;

import com.gmendoza.democoleccion.model.Empleado;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author gmendoza
 */
public class DemoColeccion {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Empleado> empleados = new ArrayList<>();

        //PARTE 1: LECTURA DE DATOS
        System.out.println("¿Cuántos empleados se registrarán?");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println();
            System.out.println("Empleado #" + i + ": ");

            System.out.println("Id: ");
            int id = sc.nextInt();
            while (hasId(empleados, id)) {
                System.out.println("Id ya está ocupado. Inténtalo de nuevo:");
                id = sc.nextInt();
            }
            System.out.println("Nombre: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Salario: ");
            double salary = sc.nextDouble();
            empleados.add(new Empleado(id, name, salary));
        }
        //PARTE 2 - ACTUALIZAR EL SALARIO DEL EMPLEADO DADO
        System.out.println();
        System.out.println("Introduzca el id del empleado que tendrá el aumento de salario: ");
        int id = sc.nextInt();
        Empleado empleadoById = empleados
                .stream()
                .filter(emp -> emp.getId() == id)
                .findFirst()
                .orElse(null);
        if (empleadoById == null) {
            System.out.println("¡Este es no existe!");
        } else {
            System.out.println("Introduzca el porcentaje:");
            double percentage = sc.nextDouble();
            empleadoById.increaseSalary(percentage);
        }

        //PARTE 3 - LISTADO DE EMPLEADOS
        System.out.println();
        System.out.println("Lista de empleados");
        for (Empleado empleado : empleados) {
            System.out.println(empleado);
        }
        sc.close();
    }

    //Porgramacion Funcional en Java
    public static boolean hasId(List<Empleado> empleados, int id) {
        Empleado empleado = empleados
                .stream()
                .filter(emp -> emp.getId() == id)
                .findFirst()
                .orElse(null);
        return empleado != null;
    }
}
