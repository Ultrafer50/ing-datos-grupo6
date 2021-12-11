/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ulima.datos.proyecto.bean;

/**
 *
 * @author Fernando
 */
public class Pedido_Producto {
    private int n_pedido;
    private int ruc;
    private String cod_producto;
    private int cantidad;

    public Pedido_Producto(int n_pedido, int ruc, String cod_producto, int cantidad) {
        this.n_pedido = n_pedido;
        this.ruc = ruc;
        this.cod_producto = cod_producto;
        this.cantidad = cantidad;
    }    

    @Override
    public String toString() {
        return "Productos del Pedido " + n_pedido + 
                "\nCodigo de Producto: " + cod_producto + 
                "\nCantidad=" + cantidad;
    }
    
    public int getN_pedido() {
        return n_pedido;
    }

    public int getRuc() {
        return ruc;
    }

    public String getCod_producto() {
        return cod_producto;
    }

    public int getCantidad() {
        return cantidad;
    }
}
