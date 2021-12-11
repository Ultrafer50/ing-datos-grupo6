/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package edu.ulima.datos.interfaz;

import edu.ulima.datos.proyecto.FuncionesPLSQL;
import edu.ulima.datos.proyecto.DatosComboBox;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Fernando
 */
public class VentanaRegistrarVenta extends javax.swing.JFrame {
    DefaultTableModel modelo;
    /**
     * Creates new form VentanaRegistrarVenta
     */
    public VentanaRegistrarVenta() {
        initComponents();        
        modelo = new DefaultTableModel();
        modelo.addColumn("Codigo");
        modelo.addColumn("Cantidad");
        this.tabla_productos.setModel(modelo);
        try {
            DatosComboBox.obtenerClientes(drop_rucdni);
            DatosComboBox.obtenerProductos(drop_codigoProducto);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al intentar obtener los codigos de cliente y productos", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tabla_productos = new javax.swing.JTable();
        titulo = new javax.swing.JLabel();
        titulo_datosBasicos = new javax.swing.JLabel();
        label_rucdni = new javax.swing.JLabel();
        drop_rucdni = new javax.swing.JComboBox<>();
        label_condicion = new javax.swing.JLabel();
        caja_condicion = new javax.swing.JTextField();
        label_comprobante = new javax.swing.JLabel();
        caja_comprobante = new javax.swing.JTextField();
        label_descuento = new javax.swing.JLabel();
        caja_descuento = new javax.swing.JTextField();
        boton_ingresarDatos = new javax.swing.JButton();
        titulo_productos = new javax.swing.JLabel();
        label_codigoProducto = new javax.swing.JLabel();
        drop_codigoProducto = new javax.swing.JComboBox<>();
        label_cantidad = new javax.swing.JLabel();
        caja_cantidad = new javax.swing.JTextField();
        boton_eliminarFila = new javax.swing.JButton();
        boton_eliminarTodo = new javax.swing.JButton();
        boton_ingresarVenta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registrar Venta");

        tabla_productos.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tabla_productos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Codigo", "Cantidad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tabla_productos);

        titulo.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Registrar Venta");

        titulo_datosBasicos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        titulo_datosBasicos.setText("Ingresar Datos Básicos");

        label_rucdni.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        label_rucdni.setText("Numero de RUC/DNI:");

        drop_rucdni.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        drop_rucdni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drop_rucdniActionPerformed(evt);
            }
        });

        label_condicion.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        label_condicion.setText("Condicion de Pago:");

        caja_condicion.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        caja_condicion.setToolTipText("Ejemplo: Contado, Credito a 3 dias, ...");

        label_comprobante.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        label_comprobante.setText("Nro. Comprobante:");

        caja_comprobante.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        caja_comprobante.setToolTipText("Ejemplo: F0010007000");

        label_descuento.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        label_descuento.setText("Descuento:");

        caja_descuento.setToolTipText("En decimales");

        boton_ingresarDatos.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        boton_ingresarDatos.setText("Ingresar Producto");
        boton_ingresarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_ingresarDatosActionPerformed(evt);
            }
        });

        titulo_productos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        titulo_productos.setText("Ingresar Productos");

        label_codigoProducto.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        label_codigoProducto.setText("Codigo de Producto:");

        drop_codigoProducto.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        drop_codigoProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drop_codigoProductoActionPerformed(evt);
            }
        });

        label_cantidad.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        label_cantidad.setText("Cantidad:");

        caja_cantidad.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        boton_eliminarFila.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        boton_eliminarFila.setText("Eliminar Fila");
        boton_eliminarFila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_eliminarFilaActionPerformed(evt);
            }
        });

        boton_eliminarTodo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        boton_eliminarTodo.setText("Eliminar Todo");
        boton_eliminarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_eliminarTodoActionPerformed(evt);
            }
        });

        boton_ingresarVenta.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        boton_ingresarVenta.setText("Ingresar Venta");
        boton_ingresarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_ingresarVentaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titulo_datosBasicos)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(boton_eliminarFila, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addComponent(boton_eliminarTodo))
                    .addComponent(label_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_rucdni)
                            .addComponent(label_condicion)
                            .addComponent(label_comprobante)
                            .addComponent(label_descuento)
                            .addComponent(titulo_productos)
                            .addComponent(label_codigoProducto))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(caja_condicion, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                            .addComponent(caja_comprobante)
                            .addComponent(caja_descuento)
                            .addComponent(caja_cantidad)
                            .addComponent(drop_rucdni, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(drop_codigoProducto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(boton_ingresarDatos)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(173, Short.MAX_VALUE)
                .addComponent(boton_ingresarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(173, 173, 173))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(titulo_datosBasicos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(drop_rucdni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_rucdni))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_condicion)
                    .addComponent(caja_condicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(caja_comprobante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_comprobante))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(caja_descuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_descuento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(titulo_productos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(drop_codigoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_codigoProducto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_cantidad)
                    .addComponent(caja_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(boton_ingresarDatos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton_eliminarTodo)
                    .addComponent(boton_eliminarFila))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(boton_ingresarVenta)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    
    private void boton_ingresarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_ingresarDatosActionPerformed
        texto_nDocumento = drop_rucdni.getSelectedItem().toString();
        condicion = caja_condicion.getText().toUpperCase();
        comprobante = caja_comprobante.getText().toUpperCase();
        texto_descuento = caja_descuento.getText();

        String[] data_tabla = new String[2];
        data_tabla[0] = drop_codigoProducto.getSelectedItem().toString();
        data_tabla[1] = caja_cantidad.getText();
        
        if ("".equals(data_tabla[0]) 
                || "".equals(data_tabla[1]) 
                || "".equals(texto_nDocumento) 
                || "".equals(condicion) 
                || "".equals(comprobante) 
                || "".equals(texto_descuento)) {
            JOptionPane.showMessageDialog(null, "No ha completado los datos basicos o los datos del producto", "Advertencia", JOptionPane.WARNING_MESSAGE);
        } else {
            modelo.addRow(data_tabla);
            
            caja_cantidad.setText("");
        }
    }//GEN-LAST:event_boton_ingresarDatosActionPerformed

    private void boton_ingresarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_ingresarVentaActionPerformed
        if ("".equals(texto_nDocumento)
                || "".equals(condicion)
                || "".equals(comprobante)
                || "".equals(texto_descuento)
                || tabla_productos.getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "No ha completado los datos.", "Advertencia", JOptionPane.WARNING_MESSAGE);

        } else {
            try {
                int filas = tabla_productos.getRowCount();

                for (int i = 0; i < filas; i++) {
                    codigo.add(tabla_productos.getValueAt(i, 0).toString().toUpperCase());
                    cantidad.add(Integer.parseInt(tabla_productos.getValueAt(i, 1).toString()));
                }
                
                FuncionesPLSQL.registrarPedido(Long.parseLong(texto_nDocumento), condicion, cantidad, codigo, comprobante, Float.parseFloat(texto_descuento));
                
                borrarTodo();
                JOptionPane.showMessageDialog(null, "Se ha registrado la venta con exito.", "Venta Ingresada", JOptionPane.INFORMATION_MESSAGE);
            
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Ha ocurrido un error.", "Error", JOptionPane.ERROR_MESSAGE);
                Logger.getLogger(VentanaRegistrarVenta.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_boton_ingresarVentaActionPerformed

    private void boton_eliminarFilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_eliminarFilaActionPerformed
        int fila = tabla_productos.getSelectedRow();
        if (fila >= 0){
            modelo.removeRow(fila);
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar la fila a eliminar.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        }
        
    }//GEN-LAST:event_boton_eliminarFilaActionPerformed

    private void boton_eliminarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_eliminarTodoActionPerformed
        int filas = tabla_productos.getRowCount();
        if (filas == 0) {
            JOptionPane.showMessageDialog(null, "No hay filas para eliminar.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        } else {
            eliminarTabla();
        }
    }//GEN-LAST:event_boton_eliminarTodoActionPerformed

    private void drop_codigoProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drop_codigoProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_drop_codigoProductoActionPerformed

    private void drop_rucdniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drop_rucdniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_drop_rucdniActionPerformed

    private void eliminarTabla() {
        int filas = tabla_productos.getRowCount();
        for (int i = filas - 1; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }
    
    private void borrarTodo() {
        caja_cantidad.setText("");
        caja_comprobante.setText("");
        caja_condicion.setText("");
        caja_descuento.setText("");
        eliminarTabla();
        cantidad.clear();
        codigo.clear();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistrarVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistrarVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistrarVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistrarVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                    new VentanaRegistrarVenta().setVisible(true);
            }
        
        });
    }
    
    String texto_nDocumento;
    String condicion;
    String comprobante;
    String texto_descuento;
    ArrayList<Integer> cantidad = new ArrayList();
    ArrayList<String> codigo = new ArrayList();

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_eliminarFila;
    private javax.swing.JButton boton_eliminarTodo;
    private javax.swing.JButton boton_ingresarDatos;
    private javax.swing.JButton boton_ingresarVenta;
    private javax.swing.JTextField caja_cantidad;
    private javax.swing.JTextField caja_comprobante;
    private javax.swing.JTextField caja_condicion;
    private javax.swing.JTextField caja_descuento;
    private javax.swing.JComboBox<String> drop_codigoProducto;
    private javax.swing.JComboBox<String> drop_rucdni;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel label_cantidad;
    private javax.swing.JLabel label_codigoProducto;
    private javax.swing.JLabel label_comprobante;
    private javax.swing.JLabel label_condicion;
    private javax.swing.JLabel label_descuento;
    private javax.swing.JLabel label_rucdni;
    private javax.swing.JTable tabla_productos;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel titulo_datosBasicos;
    private javax.swing.JLabel titulo_productos;
    // End of variables declaration//GEN-END:variables
}
