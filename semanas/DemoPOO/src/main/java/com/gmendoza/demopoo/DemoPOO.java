/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.gmendoza.demopoo;

import com.gmendoza.demopoo.model.Cliente;
import com.gmendoza.demopoo.model.Pedido;
import com.gmendoza.demopoo.model.PedidoArticulo;
import com.gmendoza.demopoo.model.Producto;
import com.gmendoza.demopoo.model.enums.EstadoPedido;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author gmendoza
 */
public class DemoPOO {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzca los datos del Cliente: ");
        System.out.println("Nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Email: ");
        String email = sc.nextLine();
        System.out.println("Fecha de Nacimiento (YYYY-MM-DD): "); //ISODate
        String fechaNacimientoString = sc.nextLine();
        LocalDate fechaNacimiento = LocalDate.parse(fechaNacimientoString);

        Cliente cliente = new Cliente(nombre, email, fechaNacimiento);

        System.out.println("Introduzca los datos del Pedido");
        System.out.println("Estado: ");

        EstadoPedido estado = EstadoPedido.valueOf(sc.next());

        Pedido pedido = new Pedido(LocalDate.now(), estado, cliente, new ArrayList<>());

        System.out.println("¿Cuántos artículos tiene este pedido?");
        int numeroDeArticulos = sc.nextInt();
        for(int i = 1; i <= numeroDeArticulos; i++) {
            
            System.out.println("Introduzca #" + i + " datos del articulo:");
            System.out.print("Nombre del Producto: ");
            sc.nextLine();
            String nombreProducto = sc.nextLine();
            System.out.print("Precio del Producto: ");
            double precioProducto = sc.nextDouble();
            System.out.print("Cantidad: ");
            int cantidad = sc.nextInt();

            Producto producto = new Producto(nombreProducto, precioProducto);

            PedidoArticulo pedidoArticulo = new PedidoArticulo(cantidad, precioProducto, producto);

            pedido.addArticulo(pedidoArticulo);
        }

        System.out.println("RESUMEN DEL PEDIDO:");
        System.out.println(pedido);
        sc.close();
    }
}
