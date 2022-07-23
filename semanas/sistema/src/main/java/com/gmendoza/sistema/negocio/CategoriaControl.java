/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gmendoza.sistema.negocio;

import com.gmendoza.sistema.datos.CategoriaDAO;
import com.gmendoza.sistema.entidades.Categoria;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author gmendoza
 */
public class CategoriaControl {

    private final CategoriaDAO DATOS;
    private Categoria cat;
    private DefaultTableModel modeloTabla;
    public int registrosMostrados;

    public CategoriaControl() {
        this.DATOS = new CategoriaDAO();
        this.cat = new Categoria();
        this.registrosMostrados = 0;
    }

    public DefaultTableModel listar(String texto) {
        List<Categoria> lista = new ArrayList();
        lista.addAll(DATOS.listar(texto));
        String[] titulos = {"id", "Nombre", "Descripcion", "Estado"};
        this.modeloTabla = new DefaultTableModel(null, titulos);

        String estado;
        String[] registro = new String[4];

        this.registrosMostrados = 0;

        for (Categoria item : lista) {
            if (item.isActivo()) {
                estado = "Activo";
            } else {
                estado = "Inactivo";
            }
            registro[0] = Integer.toString(item.getId());
            registro[1] = item.getNombre();
            registro[2] = item.getDescripcion();
            registro[3] = estado;
            this.modeloTabla.addRow(registro);
            this.registrosMostrados = this.registrosMostrados + 1;
        }
        return this.modeloTabla;
    }

    public String insertar(String nombre, String descripcion) {
        if (DATOS.existe(nombre)) {
            return "El registro ya existe";
        } else {
            cat.setNombre(nombre);
            cat.setDescripcion(descripcion);
            if (DATOS.insertar(cat)) {
                return "OK";
            } else {
                return "Error al registrar la categoria";
            }
        }
    }

    public String actualizar(int id, String nombre, String nombreAnt, String descripcion) {
        if (nombre.equals(nombreAnt)) {
            cat.setId(id);
            cat.setNombre(nombre);
            cat.setDescripcion(descripcion);
            if (DATOS.actualizar(cat)) {
                return "OK";
            } else {
                return "Error al actualizar la categoria";
            }
        } else {
            if (DATOS.existe(nombre)) {
                return "El registro ya existe.";
            } else {
                cat.setId(id);
                cat.setNombre(nombre);
                cat.setDescripcion(descripcion);
                if (DATOS.actualizar(cat)) {
                    return "OK";
                } else {
                    return "Error al registrar la categoria";
                }
            }
        }
    }

    public String desactivar(int id) {
        if (DATOS.desactivar(id)) {
            return "OK";
        } else {
            return "No se puede desactivar la categoria";
        }
    }

    public String activar(int id) {
        if (DATOS.activar(id)) {
            return "OK";
        } else {
            return "No se puede desactivar la categoria";
        }
    }
    
    public int total(){
    return DATOS.total();
    }
    
    public int totalMostrados(){
    return this.registrosMostrados;
    }

}
