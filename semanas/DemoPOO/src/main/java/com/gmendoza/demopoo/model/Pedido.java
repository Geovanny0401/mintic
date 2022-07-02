/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gmendoza.demopoo.model;

import com.gmendoza.demopoo.model.enums.EstadoPedido;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 *
 * @author gmendoza
 */
@Data
@AllArgsConstructor
public class Pedido {
    
    private LocalDate fechaPedido;
    private EstadoPedido estado;
    private Cliente cliente;
    private List<PedidoArticulo> articulos = new ArrayList();
    
    public void addArticulo(PedidoArticulo articulo){
        articulos.add(articulo);
    }
    
    public void removeArticulo(PedidoArticulo articulo){
        articulos.remove(articulo);
    }
    
    public double total(){
    double suma =0.0;
    for(PedidoArticulo it : articulos)
    {
        suma+= it.subTotal();
    }
    return suma;
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Fecha Pedido: ");
        sb.append(fechaPedido + "\n");
        sb.append("Estado del Pedido: ");
        sb.append(estado + "\n");
        sb.append("Cliente: ");
        sb.append(cliente + "\n");
        sb.append("Pedidos de los Articulos:\n");
        for(PedidoArticulo articulo: articulos)
        {
            sb.append(articulo + "\n");
        }
        sb.append("Total de Precio: $");
        sb.append(String.format("%.2f", total()));
        return sb.toString();
    }
}
