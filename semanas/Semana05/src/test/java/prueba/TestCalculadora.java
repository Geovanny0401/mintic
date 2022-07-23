/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba;


import com.gmendoza.semana05.prueba.Calculadora;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author gmendoza
 */
public class TestCalculadora {

    public TestCalculadora() {
    }
    
    @Test
    public void testCalcularSuma()
    {
        System.out.println("Suma");
        int n1=2, n2=5;
        int esperado=7;
        Calculadora calc = new Calculadora();
        int devolucion = calc.Suma(n1, n2);
        assertEquals(esperado,devolucion);
    }
    
    @Test
    public void testCalcularResta()
    {
        System.out.println("Resta");
        int n1=8, n2=5;
        int esperado=3;
        Calculadora calc = new Calculadora();
        int devolucion = calc.Resta(n1, n2);
        assertEquals(esperado,devolucion);
    }
    
    @Test
    public void testCalcularMultiplicacion()
    {
        System.out.println("Multiplicacion");
        int n1=2, n2=5;
        int esperado=10;
        Calculadora calc = new Calculadora();
        int devolucion = calc.Multiplicacion(n1, n2);
        assertEquals(esperado,devolucion);
    }
    
    @Test
    public void testCalcularDividir()
    {
        System.out.println("Dividir");
        int n1=10, n2=5;
        int esperado=2;
        Calculadora calc = new Calculadora();
        int devolucion = calc.Division(n1, n2);
        assertEquals(esperado,devolucion);
    }
    
}
