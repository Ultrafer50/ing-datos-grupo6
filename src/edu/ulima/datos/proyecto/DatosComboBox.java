/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ulima.datos.proyecto;

import edu.ulima.datos.proyecto.bean.Vendedor;
import edu.ulima.datos.util.JdbcUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

/**
 *
 * @author JC
 */
public class DatosComboBox {
    public static void obtenerProductos(JComboBox box) throws Exception{
        DefaultComboBoxModel modeloCodigo;
        Connection conn = JdbcUtil.getConnection();
        String sql = "SELECT * FROM PRODUCTO";
        modeloCodigo = new DefaultComboBoxModel();
        box.setModel(modeloCodigo);
        PreparedStatement pst = conn.prepareStatement(sql);
        ResultSet rs = pst.executeQuery();
        modeloCodigo.addElement("");
        while (rs.next()) {
            modeloCodigo.addElement(rs.getString("COD_PRODUCTO"));
        }
        rs.close();
        pst.close();
        conn.close();
    }
    
    public static void obtenerClientes(JComboBox box) throws Exception{
        DefaultComboBoxModel modeloCliente;
        Connection conn = JdbcUtil.getConnection();
        String sql = "SELECT * FROM CLIENTE";
        modeloCliente = new DefaultComboBoxModel();
        box.setModel(modeloCliente);
        PreparedStatement pst = conn.prepareStatement(sql);
        ResultSet rs = pst.executeQuery();
        modeloCliente.addElement("");
        while (rs.next()) {
            modeloCliente.addElement(rs.getString("N_DOCUMENTO_CLIENTE"));
        }
        rs.close();
        pst.close();
        conn.close();
    }
    
    public static List<Vendedor> obtenerVendedores() throws Exception{
        ArrayList<Vendedor> listaVendedores = new ArrayList<>();        
        Connection conn = JdbcUtil.getConnection();
        String sql = "SELECT * FROM VENDEDOR";
        PreparedStatement pst = conn.prepareStatement(sql);
        ResultSet rs = pst.executeQuery();
        while(rs.next()){
            int codigo = rs.getInt("COD_VENDEDOR");
            String nombre_completo = rs.getString("NOMBRE_COMPLETO");
            Vendedor vend = new Vendedor(nombre_completo, codigo);
            listaVendedores.add(vend);
        }
        rs.close();
        pst.close();
        conn.close();
        return listaVendedores;
    }
    
    public static void main(String[] args) throws Exception{
        List<Vendedor> vendedores = obtenerVendedores();
        System.out.println(vendedores);
    }
    /*
        Referencia adicional: https://www.javatpoint.com/ResultSet-interface
    */
}
