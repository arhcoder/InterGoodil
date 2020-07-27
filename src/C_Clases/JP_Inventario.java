package C_Clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class JP_Inventario extends javax.swing.JPanel {
    DefaultTableModel model;
    int Codigo_Act;
    
    public JP_Inventario() {
        initComponents();
        nuevo();
        cancelar();
        cargarTabla("", null);
    }
    
    void cargarTabla(String valor2, String valor){
        String [] titulos={"Codigo_Producto","Descripcion_Producto","Precio_Compra","Precio_Venta","Stock_Actual"};
        String [] registros = new String[5];

        String sql= "SELECT * FROM inventario where Descripcion_Producto LIKE '%"+valor+"%'";
        
        String sql2= "SELECT * FROM inventario where Codigo_Producto LIKE '%"+valor2+"%'";
        
        model= new DefaultTableModel(null, titulos);
        
        Conectar con = new Conectar();
        Connection cn = con.conexion();
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while (rs.next()) {
                registros[0]=rs.getString("Codigo_Producto");
                registros[1]=rs.getString("Descripcion_Producto");
                registros[2]=rs.getString("Precio_Compra");
                registros[3]=rs.getString("Precio_Venta");
                registros[4]=rs.getString("Stock_Actual");
                model.addRow(registros);
            }
            Tabla_Inventario.setModel(model);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql2);
            
            while (rs.next()) {
                registros[0]=rs.getString("Codigo_Producto");
                registros[1]=rs.getString("Descripcion_Producto");
                registros[2]=rs.getString("Precio_Compra");
                registros[3]=rs.getString("Precio_Venta");
                registros[4]=rs.getString("Stock_Actual");
                model.addRow(registros);
            }
            Tabla_Inventario.setModel(model);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    void limpiar(){
        TF_Codigo.setText("");
        TF_Descripcion_Produc.setText("");
        TF_Precio_Compra.setText("");
        TF_Precio_Venta.setText("");
        TF_Stock.setText("");    
    }
    
    void cancelar(){
        TF_Codigo.setEnabled(false);
        TF_Descripcion_Produc.setEnabled(false);
        TF_Precio_Compra.setEnabled(false);
        TF_Precio_Venta.setEnabled(false);
        TF_Stock.setEnabled(false);
        B_Nuevo.setEnabled(true);
        B_Guardar.setEnabled(false);
        B_Actualizar.setEnabled(false);
        B_Cancelar.setEnabled(false);
        limpiar();  
    }
    
    void nuevo(){
        TF_Codigo.setEnabled(true);
        TF_Descripcion_Produc.setEnabled(true);
        TF_Precio_Compra.setEnabled(true);
        TF_Precio_Venta.setEnabled(true);
        TF_Stock.setEnabled(true);
        B_Nuevo.setEnabled(false);
        B_Guardar.setEnabled(true);
        B_Actualizar.setEnabled(true);
        B_Cancelar.setEnabled(true); 
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        Pnl_Contenedor_Inventario = new javax.swing.JPanel();
        B_Nuevo = new javax.swing.JButton();
        B_Guardar = new javax.swing.JButton();
        B_Actualizar = new javax.swing.JButton();
        B_Cancelar = new javax.swing.JButton();
        B_Eliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_Inventario = new javax.swing.JTable();
        TF_Codigo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TF_Descripcion_Produc = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TF_Precio_Compra = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        TF_Precio_Venta = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        TF_Stock = new javax.swing.JTextField();
        TF_Buscar = new javax.swing.JTextField();
        B_Modificar = new javax.swing.JButton();
        B_Buscar = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Pnl_Contenedor_Inventario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        B_Nuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/P_Imagenes/spr_Nuevo_New.png"))); // NOI18N
        B_Nuevo.setText("Nuevo");
        B_Nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_NuevoActionPerformed(evt);
            }
        });
        Pnl_Contenedor_Inventario.add(B_Nuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        B_Guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/P_Imagenes/spr_Guardar.png"))); // NOI18N
        B_Guardar.setText("Guardar");
        B_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_GuardarActionPerformed(evt);
            }
        });
        Pnl_Contenedor_Inventario.add(B_Guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, -1, -1));

        B_Actualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/P_Imagenes/spr_Actualizar.png"))); // NOI18N
        B_Actualizar.setText("Actualizar");
        B_Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_ActualizarActionPerformed(evt);
            }
        });
        Pnl_Contenedor_Inventario.add(B_Actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, -1, -1));

        B_Cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/P_Imagenes/spr_CancelarRojo.png"))); // NOI18N
        B_Cancelar.setText("Cancelar");
        B_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_CancelarActionPerformed(evt);
            }
        });
        Pnl_Contenedor_Inventario.add(B_Cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, -1, -1));

        B_Eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/P_Imagenes/spr_EliminarBote.png"))); // NOI18N
        B_Eliminar.setText("Eliminar");
        B_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_EliminarActionPerformed(evt);
            }
        });
        Pnl_Contenedor_Inventario.add(B_Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 20, -1, -1));

        Tabla_Inventario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(Tabla_Inventario);

        Pnl_Contenedor_Inventario.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 460, 300));

        TF_Codigo.setToolTipText("");
        TF_Codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_CodigoActionPerformed(evt);
            }
        });
        Pnl_Contenedor_Inventario.add(TF_Codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 100, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Código:");
        Pnl_Contenedor_Inventario.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Nombre:");
        Pnl_Contenedor_Inventario.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, 20));

        TF_Descripcion_Produc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_Descripcion_ProducActionPerformed(evt);
            }
        });
        Pnl_Contenedor_Inventario.add(TF_Descripcion_Produc, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 100, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("$ Compra:");
        Pnl_Contenedor_Inventario.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, 20));

        TF_Precio_Compra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_Precio_CompraActionPerformed(evt);
            }
        });
        Pnl_Contenedor_Inventario.add(TF_Precio_Compra, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 100, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("$ Venta:");
        Pnl_Contenedor_Inventario.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, 20));

        TF_Precio_Venta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_Precio_VentaActionPerformed(evt);
            }
        });
        Pnl_Contenedor_Inventario.add(TF_Precio_Venta, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 100, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Stock Actual:");
        Pnl_Contenedor_Inventario.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, 20));

        TF_Stock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_StockActionPerformed(evt);
            }
        });
        Pnl_Contenedor_Inventario.add(TF_Stock, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 80, -1));

        TF_Buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TF_BuscarKeyReleased(evt);
            }
        });
        Pnl_Contenedor_Inventario.add(TF_Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 160, 30));

        B_Modificar.setText("Modificar");
        B_Modificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B_ModificarMouseClicked(evt);
            }
        });
        B_Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_ModificarActionPerformed(evt);
            }
        });
        Pnl_Contenedor_Inventario.add(B_Modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 160, 40));

        B_Buscar.setText("Buscar por nombre");
        B_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_BuscarActionPerformed(evt);
            }
        });
        Pnl_Contenedor_Inventario.add(B_Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 160, 40));

        add(Pnl_Contenedor_Inventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 410));
    }// </editor-fold>//GEN-END:initComponents

    private void B_NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_NuevoActionPerformed
        // TODO add your handling code here:
        nuevo();
        TF_Codigo.requestFocus();
    }//GEN-LAST:event_B_NuevoActionPerformed

    private void B_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_GuardarActionPerformed
        // TODO add your handling code here:
        Conectar con = new Conectar();
        Connection cn = con.conexion();
            String Codigo, Descripcion_Producto, Precio_Compra, Precio_Venta, Stock;
            String sql="";
            Codigo = TF_Codigo.getText();
            Descripcion_Producto = TF_Descripcion_Produc.getText();
            Precio_Compra = TF_Precio_Compra.getText();
            Precio_Venta = TF_Precio_Venta.getText();
            Stock = TF_Stock.getText();
            
            sql="INSERT INTO inventario (Codigo_Producto, Descripcion_Producto, Precio_Compra, Precio_Venta, Stock_Actual) VALUES (?,?,?,?,?)";
          try{  
            PreparedStatement psd = cn.prepareStatement(sql);
            psd.setString(1, Codigo);
            psd.setString(2, Descripcion_Producto);
            psd.setString(3, Precio_Compra);
            psd.setString(4, Precio_Venta);
            psd.setString(5, Stock);
            
            int n = psd.executeUpdate();
            if(n > 0) {
                JOptionPane.showMessageDialog(null, "Registro guardado exitosamente");
                cancelar();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al guardar el registro");
        }
            cargarTabla("", null);
            
    }//GEN-LAST:event_B_GuardarActionPerformed

    private void B_ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_ActualizarActionPerformed
        // TODO add your handling code here:      
     Conectar con = new Conectar();
        Connection cn = con.conexion();
            String Codigo, Descripcion_Producto, Precio_Compra, Precio_Venta, Stock;
            String sql="";
            Codigo = TF_Codigo.getText();
            Descripcion_Producto = TF_Descripcion_Produc.getText();
            Precio_Compra = TF_Precio_Compra.getText();
            Precio_Venta = TF_Precio_Venta.getText();
            Stock = TF_Stock.getText();
            
            sql="Update inventario SET Codigo_Producto=?, Descripcion_Producto=?, Precio_Compra=?, Precio_Venta=?, Stock_Actual=? WHERE Codigo_Producto=?";
          try{  
            PreparedStatement psd = cn.prepareStatement(sql);
            psd.setString(1, Codigo);
            psd.setString(2, Descripcion_Producto);
            psd.setString(3, Precio_Compra);
            psd.setString(4, Precio_Venta);
            psd.setString(5, Stock);
            psd.setString(6, Codigo);
            
            int n = psd.executeUpdate();
            if(n > 0) {
                JOptionPane.showMessageDialog(null, "Registro actualizado exitosamente");
                cancelar();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al actualizar el registro");
        }   
          cargarTabla("", null);
    }//GEN-LAST:event_B_ActualizarActionPerformed

    private void B_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_CancelarActionPerformed
        // TODO add your handling code here:
        cancelar();
    }//GEN-LAST:event_B_CancelarActionPerformed

    private void TF_CodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_CodigoActionPerformed
        // TODO add your handling code here:
        TF_Codigo.transferFocus();
    }//GEN-LAST:event_TF_CodigoActionPerformed

    private void TF_Descripcion_ProducActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_Descripcion_ProducActionPerformed
        // TODO add your handling code here:
        TF_Descripcion_Produc.transferFocus();
    }//GEN-LAST:event_TF_Descripcion_ProducActionPerformed

    private void TF_Precio_CompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_Precio_CompraActionPerformed
        // TODO add your handling code here:
        TF_Precio_Compra.transferFocus();
    }//GEN-LAST:event_TF_Precio_CompraActionPerformed

    private void TF_Precio_VentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_Precio_VentaActionPerformed
        // TODO add your handling code here:
        TF_Precio_Venta.transferFocus();
    }//GEN-LAST:event_TF_Precio_VentaActionPerformed

    private void TF_StockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_StockActionPerformed
        // TODO add your handling code here:
        B_Guardar.requestFocus();
    }//GEN-LAST:event_TF_StockActionPerformed

    private void TF_BuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_BuscarKeyReleased
        // TODO add your handling code here:
        
        String textoBuscar = new String (B_Buscar.getText());
        if(textoBuscar.equals("Buscar por código")) {
        cargarTabla(TF_Buscar.getText(), null);
            
            
        }
        else if (textoBuscar.equals("Buscar por nombre")) {
        cargarTabla(null, TF_Buscar.getText());    
        }
    }//GEN-LAST:event_TF_BuscarKeyReleased

    private void B_ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_ModificarActionPerformed
        // TODO add your handling code here:
        B_Guardar.setEnabled(false);
        nuevo();
        Codigo_Act=Tabla_Inventario.getSelectedRow();
        int fila = Tabla_Inventario.getSelectedRow();
        if (fila>=0) {
            TF_Codigo.setText(Tabla_Inventario.getValueAt(fila, 0).toString());
            TF_Descripcion_Produc.setText(Tabla_Inventario.getValueAt(fila, 1).toString());
            TF_Precio_Compra.setText(Tabla_Inventario.getValueAt(fila, 2).toString());
            TF_Precio_Venta.setText(Tabla_Inventario.getValueAt(fila, 3).toString());
            TF_Stock.setText(Tabla_Inventario.getValueAt(fila, 4).toString());
            
        }else {
            JOptionPane.showMessageDialog(null, "Fila no seleccionada");
        }
        
    }//GEN-LAST:event_B_ModificarActionPerformed

    private void B_ModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_ModificarMouseClicked
        // TODO add your handling code here:
        B_Guardar.setEnabled(false);
    }//GEN-LAST:event_B_ModificarMouseClicked

    private void B_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_BuscarActionPerformed
        // TODO add your handling code here:
        String textoBuscar = new String (B_Buscar.getText());
        
        if(textoBuscar.equals("Buscar por código")) {
            cargarTabla("", null);
            B_Buscar.setText("Buscar por nombre");
            
        }
        else if (textoBuscar.equals("Buscar por nombre")) {
            cargarTabla(null, "");
            B_Buscar.setText("Buscar por código");
        }
    }//GEN-LAST:event_B_BuscarActionPerformed

    private void B_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_EliminarActionPerformed
        
        Conectar con = new Conectar();
        Connection cn = con.conexion();
            String Codigo;
            String sql="";
            Codigo = TF_Codigo.getText();
            Codigo_Act=Tabla_Inventario.getSelectedRow();
        int fila = Tabla_Inventario.getSelectedRow();
        if (fila>=0) {
            TF_Codigo.setText(Tabla_Inventario.getValueAt(fila, 0).toString());
            
        }else {
            JOptionPane.showMessageDialog(null, "Fila no seleccionada");
        }
        

            
            sql="DELETE from inventario where Codigo_Producto=?";
          try{  
            PreparedStatement psd = cn.prepareStatement(sql);
            psd.setString(1, Codigo);
            
            
            int n = psd.executeUpdate();
            if(n > 0) {
                JOptionPane.showMessageDialog(null, "Registro eliminado exitosamente");
                cancelar();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al eliminar el registro");
        }   
          cargarTabla("", null);
    }//GEN-LAST:event_B_EliminarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_Actualizar;
    private javax.swing.JButton B_Buscar;
    private javax.swing.JButton B_Cancelar;
    private javax.swing.JButton B_Eliminar;
    private javax.swing.JButton B_Guardar;
    private javax.swing.JButton B_Modificar;
    private javax.swing.JButton B_Nuevo;
    private javax.swing.JPanel Pnl_Contenedor_Inventario;
    private javax.swing.JTextField TF_Buscar;
    private javax.swing.JTextField TF_Codigo;
    private javax.swing.JTextField TF_Descripcion_Produc;
    private javax.swing.JTextField TF_Precio_Compra;
    private javax.swing.JTextField TF_Precio_Venta;
    private javax.swing.JTextField TF_Stock;
    private javax.swing.JTable Tabla_Inventario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}