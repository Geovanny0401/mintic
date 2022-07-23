/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.gmendoza.semana05;

import org.apache.log4j.Logger;

/**
 *
 * @author gmendoza
 */
public class Semana05 {

    final static Logger logger = Logger.getLogger(Semana05.class);
    
    public static void main(String[] args) {
        //System.out.println("Hello World!");
        logger.info("Iniciando el Sitema");
        Semana05 sem = new Semana05();
        
        try{
            sem.divide();
        }catch(ArithmeticException ex){
            logger.error("No se puede hacer la division", ex);
        
        }
        
    }
    
    private void divide(){
    int i=10/0;
    }
}
