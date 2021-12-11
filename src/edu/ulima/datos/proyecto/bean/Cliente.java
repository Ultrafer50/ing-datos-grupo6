/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ulima.datos.proyecto.bean;

/**
 *
 * @author Fernando
 */
public class Cliente {
    private long ruc;
    private String nombre;
    private String tipo;
    private String ubic_refer;
    private String ubic_distrito;
    private String ubic_direccion;

    public Cliente(long ruc, String nombre, String tipo, String ubic_refer, String ubic_distrito, String ubic_direccion) {
        this.ruc = ruc;
        this.nombre = nombre;
        this.tipo = tipo;
        this.ubic_refer = ubic_refer;
        this.ubic_distrito = ubic_distrito;
        this.ubic_direccion = ubic_direccion;
    }

    @Override
    public String toString() {
        return "RUC: " + ruc + 
                "\nNombre: " + nombre + 
                "\nTipo: " + tipo + 
                "\nUbicación Referencial: " + ubic_refer + 
                "\nDistrito: " + ubic_distrito + 
                "\nDireccion: " + ubic_direccion;
    }
}
