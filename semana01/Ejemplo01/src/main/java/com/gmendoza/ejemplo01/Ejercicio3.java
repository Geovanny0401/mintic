package com.gmendoza.ejemplo01;

/**
 *
 * @author gmendoza
 */

public class Ejercicio3 {
    public static void main(String[] args) {
     
        String nombreEstudiante="Geovanny";
        double nota1=4.5, nota2=4.5, nota3=4.5, resultado;
        
        resultado = (nota1+nota2+nota3)/3;
        if(resultado>=0 && resultado<=1) //&&->and  ||->or 
        {
            System.out.println("El estudiante es deficiente: " +nombreEstudiante + " " + "Resultado :"+ resultado);
        }
        else if(resultado>1 && resultado<=3){
            System.out.println("El estudiante es insuficiente: " +nombreEstudiante + " " + "Resultado :"+ resultado);
        }
         else if(resultado>3 && resultado<=4){
            System.out.println("El estudiante es aprobado: " +nombreEstudiante + " " + "Resultado :"+ resultado);
        }
         else if(resultado>4 && resultado<=5){
            System.out.println("El estudiante es muy inteligente: " +nombreEstudiante + " " + "Resultado :"+ resultado);
        }
        else{
           System.out.println("El estudiante no aprobó: " +nombreEstudiante + " " + "Resultado :"+ resultado);
        }
        
    }    
}
