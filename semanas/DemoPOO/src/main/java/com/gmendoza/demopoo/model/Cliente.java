/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gmendoza.demopoo.model;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 *
 * @author gmendoza
 */
@Data
@AllArgsConstructor
public class Cliente {
    
    private String nombre;
    private String email;
    private LocalDate fechaNacimiento;
      
}
