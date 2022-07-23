package com.gmendoza.sistema.entidades;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author gmendoza
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Categoria {
    private int id;
    private String nombre;
    private String descripcion;
    private boolean activo;
    
}
