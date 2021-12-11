/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ulima.datos.proyecto.bean;

/**
 *
 * @author Fernando
 */
public class Vendedor {
    private String nombre_completo;
    private int cod_vendedor;

    public Vendedor(String nombre_completo, int cod_vendedor) {
        this.nombre_completo = nombre_completo;
        this.cod_vendedor = cod_vendedor;
    }

    @Override
    public String toString() {
        return "\nCodigo: " + cod_vendedor + "  Nombre: " + nombre_completo;
    }
}
