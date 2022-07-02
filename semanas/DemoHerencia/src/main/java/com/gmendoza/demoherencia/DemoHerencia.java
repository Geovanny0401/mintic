/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.gmendoza.demoherencia;

import com.gmendoza.demoherencia.model.Company;
import com.gmendoza.demoherencia.model.Individual;
import com.gmendoza.demoherencia.model.TaxPayer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author gmendoza
 */
public class DemoHerencia {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        List<TaxPayer> list = new ArrayList<>();
        System.out.println("Numero de Contribuyentes: ");
        
        int numberOfTaxPayers = sc.nextInt();

        for(int i = 1; i <= numberOfTaxPayers; i++){
            System.out.println("Datos del Contribuyente #" + i + ":");
            System.out.print("individual o compañia (i/c)? ");
            char type = sc.next().charAt(0);

            System.out.print("Nombre: ");
            String name = sc.next();
            System.out.print("Ingreso Anuales: ");
            Double anualIncome = sc.nextDouble();

            if (type == 'i') {
                System.out.print("Gastos de Salud: ");
                Double healthExpenditures = sc.nextDouble();
                list.add(new Individual(name, anualIncome, healthExpenditures));
            }else{
                System.out.print("Numero de Empleados: ");
                Integer numberOfEmployees = sc.nextInt();
                list.add(new Company(name, anualIncome, numberOfEmployees));
            }
        }

        System.out.println();
        System.out.println("IMPIUESTO PAGADO:");
        for (TaxPayer tp : list) {
            System.out.println(tp.getName() + ": $ " + String.format("%.2f", tp.tax()));
        }

        System.out.println();
        double sum = 0.0;
        for (TaxPayer tp : list) {
            sum += tp.tax();
        }
        System.out.println("IMPUESTOS TOTALES: $ " + String.format("%.2f", sum));

        sc.close();
    }
}
