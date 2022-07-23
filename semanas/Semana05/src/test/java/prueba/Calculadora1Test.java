/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba;

import com.gmendoza.semana05.prueba.Calculadora1;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author gmendoza
 */
public class Calculadora1Test {

    @Test
    public void testCuadradoPositivo(){
      Calculadora1 cal = new Calculadora1();
      assertEquals(25.0, cal.cuadrado(5.0),0.000001);
    }
    
    @Test
    public void testCuadradoCero() {
        Calculadora1 calc = new Calculadora1();
        assertEquals(0.0, calc.cuadrado(0.0), 0.000000001);
    }
    
    @Test
    public void testCuadradoUno() {
        Calculadora1 calc = new Calculadora1();
        assertEquals(1.0, calc.cuadrado(1.0), 0.000000001);
    }

    @Test
    public void testCuadradoNegativo() {
        Calculadora1 calc = new Calculadora1();
        assertEquals(16.0, calc.cuadrado(-4.0), 0.000000001);
    }

//Pruebas unitarias para el cubo
    @Test
    public void testCuboPositivo() {
        Calculadora1 calc = new Calculadora1();
        assertEquals(125.0, calc.cubo(5.0), 0.000000001);
    }

    @Test
    public void testCuboCero() {
        Calculadora1 calc = new Calculadora1();
        assertEquals(0.0, calc.cubo(0.0), 0.000000001);
    }

    @Test
    public void testCuboUno() {
        Calculadora1 calc = new Calculadora1();
        assertEquals(1.0, calc.cubo(1.0), 0.000000001);
    }

    @Test
    public void testCuboMenosUno() {
        Calculadora1 calc = new Calculadora1();
        assertEquals(-1.0, calc.cubo(-1.0), 0.000000001);
    }

    @Test
    public void testCuboNegativo() {
        Calculadora1 calc = new Calculadora1();
        assertEquals(-64.0, calc.cubo(-4.0), 0.000000001);
    }


}
