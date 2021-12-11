/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ulima.datos.proyecto.bean;

/**
 *
 * @author JC
 */
public class Producto {
    private String cod_producto;
    private String familia;
    private String linea;
    private String sublinea;
    private String valor_venta;
    private String descripcion;

    public Producto(String cod_producto, String familia, String linea, String sublinea, String valor_venta, String descripcion) {
        this.cod_producto = cod_producto;
        this.familia = familia;
        this.linea = linea;
        this.sublinea = sublinea;
        this.valor_venta = valor_venta;
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Producto: " + 
                "\nCodigo: " + cod_producto + 
                "\nFamilia: " + familia + 
                "\nLinea: " + linea + 
                "\nSublinea: " + sublinea + 
                "\nValor de Venta: " + valor_venta + 
                "\nDescripcion: " + descripcion;
    }

    public String getCod_producto() {
        return cod_producto;
    }

    public String getFamilia() {
        return familia;
    }

    public String getLinea() {
        return linea;
    }

    public String getSublinea() {
        return sublinea;
    }

    public String getValor_venta() {
        return valor_venta;
    }

    public String getDescripcion() {
        return descripcion;
    }
    
}
