/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gmendoza.demopoo.model;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 *
 * @author gmendoza
 */
@Data
@AllArgsConstructor
public class PedidoArticulo {

    private int cantida;
    private double precio;
    private Producto producto;

    public double subTotal() {
        return precio * cantida;
    }

}
