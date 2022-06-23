
package com.gmendoza.ejemplo01;

/**
 *
 * @author gmendoza
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        int dia=2;
        String nombreDia;
        switch (dia) {
            case 1:
                nombreDia = "lunes";
                break;
            case 2:
                nombreDia = "martes";
                break;
            case 3:
                nombreDia = "miercoles";
                break;
            default:
                nombreDia = "Día inválido";
        }
        System.out.println("Resultado es: " +nombreDia);
    }
}
