/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ulima.datos.proyecto.bean;

/**
 *
 * @author Fernando
 */
public class Pedido {
    private int n_pedido;
    private long ruc;
    private int cod_vendedor;
    private String condicion_pago;
    private String n_comprobante;
    private float total_valor_venta;
    private float descuento_total;
    private String fecha;

    public Pedido(int n_pedido, long ruc, int cod_vendedor, String condicion_pago, String n_comprobante, float total_valor_venta, float descuento_total, String fecha) {
        this.n_pedido = n_pedido;
        this.ruc = ruc;
        this.cod_vendedor = cod_vendedor;
        this.condicion_pago = condicion_pago;
        this.n_comprobante = n_comprobante;
        this.total_valor_venta = total_valor_venta;
        this.descuento_total = descuento_total;
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Pedido: " +
                "\nNumero de Pedido: " + n_pedido +
                "\nRUC de cliente: " + ruc +
                "\nCodigo Vendedor: " + cod_vendedor +
                "\nCondicion Pago" + condicion_pago + 
                "\nDocumento Comprobante: " + n_comprobante +
                "\nDescuento Total" + descuento_total +
                "\nTotal Valor de Venta: " + total_valor_venta + 
                "\nFecha: " + fecha;
    }

    public int getN_pedido() {
        return n_pedido;
    }

    public long getRuc() {
        return ruc;
    }

    public int getCod_vendedor() {
        return cod_vendedor;
    }

    public String getCondicion_pago() {
        return condicion_pago;
    }

    public String getN_comprobante() {
        return n_comprobante;
    }

    public float getTotal_valor_venta() {
        return total_valor_venta;
    }

    public float getDescuento_total() {
        return descuento_total;
    }

    public String getFecha() {
        return fecha;
    }
    
    
}
