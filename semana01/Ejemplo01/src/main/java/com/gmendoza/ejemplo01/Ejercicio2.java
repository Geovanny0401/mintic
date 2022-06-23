package com.gmendoza.ejemplo01;

/**
 *
 * @author gmendoza
 */
public class Ejercicio2 {

    public static void main(String[] args) {

        String apellido = "Mendoza";

        int nota1 = 3;
        double nota2 = 2, nota3 = 3, notaFinal;

        notaFinal = (nota1 + nota2 + nota3) / 3;
        /*
       System.out.println("Nombre del Estudainte: "+nombre + " " +apellido);
      
       System.out.println("Valor Nota 1: "+nota1);
       System.out.println("Valor Nota 2: "+nota2);
       System.out.println("Valor Nota 3: "+nota3);
       System.out.println("Resultado: "+notaFinal);
         */

        String nombre1 = "Geovanny1";
        String nombre2 = "GEOVANNY";
        String nombre3 = "Geovanny1";
        
        System.out.println(nombre1.equals(nombre2));//==
        System.out.println(nombre1.equalsIgnoreCase(nombre2));
        System.out.println(nombre1.equals(nombre3));

    }

}
