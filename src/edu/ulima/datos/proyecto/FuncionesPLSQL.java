/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ulima.datos.proyecto;

import edu.ulima.datos.util.JdbcUtil;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Iterator;


/**
 *
 * @author JC
 */
public class FuncionesPLSQL {        
    
    public static void registrarPedido(long n_documento, String condicion, ArrayList<Integer> cantidad, ArrayList<String> codigo, String nro_comprobante, float descuento) throws Exception{                
        Connection conn = JdbcUtil.getConnection();
        
        // Crea un pedido base (sin valor total de venta)
        String llamado = "{call PAQUETE_PEDIDO.CREAR_PEDIDO(?, ?, ?)";
        CallableStatement cst = conn.prepareCall(llamado);
        cst.setLong(1, n_documento);
        cst.setString(2, condicion);
        cst.setString(3, nro_comprobante);
        cst.execute();
        cst.close();
        
        // Agrega los productos a la tabla PEDIDO_PRODUCTO
        llamado = "{call PAQUETE_PEDIDO.REGISTRAR_PRODUCTOS(?, ?, ?)";
        Iterator<Integer> cantidadIterator = cantidad.iterator();
        Iterator<String> codigoIterator = codigo.iterator();
            while (cantidadIterator.hasNext() && codigoIterator.hasNext()) {
                int cantidad_prod = cantidadIterator.next();
                String codigo_prod = codigoIterator.next();
                cst = conn.prepareCall(llamado);
                cst.setLong(1, n_documento);
                cst.setInt(2, cantidad_prod);
                cst.setString(3, codigo_prod);
                cst.execute();
                cst.close();
            }
        
        // Tomando en cuenta el valor de venta de los productos actualiza el pedido
        llamado = "{call PAQUETE_PEDIDO.ACTUALIZAR_PRECIO(?)";
        cst = conn.prepareCall(llamado);
        cst.setFloat(1, descuento);
        cst.execute();
        cst.close();

        conn.close();
    }
    

    
    public static void main(String[] args) throws Exception{
        // Prueba
        ArrayList<Integer> cantidad = new ArrayList<Integer>();
        ArrayList<String> codigo = new ArrayList<String>();
        
        cantidad.add(1);
        cantidad.add(3);
        cantidad.add(2);
        
        codigo.add("TS768C");
        codigo.add("KIT 02");
        codigo.add("G-125");
             
        registrarPedido(20602357202l, "CONTADO", cantidad, codigo, "F00100017013", 0.50f);
    }
    /*
        Referencia adicional: https://www.javatpoint.com/CallableStatement-interface
    */
}