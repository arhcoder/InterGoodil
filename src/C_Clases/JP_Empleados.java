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

public class JP_Empleados extends javax.swing.JPanel {
    DefaultTableModel model;
    int Codigo_ActE;
    
    public JP_Empleados() {
        initComponents();
        nuevo();
        cancelar();
        cargarTabla("");
    }

  void cargarTabla(String valor){
        String [] titulos={"ID_Empleado","Nombre_Empleado","ApellidoP_Empleado","ApellidoM_Empleado"};
        String [] registros = new String[4];

        String sql= "SELECT * FROM empleados WHERE Nombre_Empleado LIKE'%"+valor+"%'";
        
        model= new DefaultTableModel(null, titulos);
        
        Conectar con = new Conectar();
        Connection cn = con.conexion();
        
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while (rs.next()) {
                registros[0]=rs.getString("ID_Empleado");
                registros[1]=rs.getString("Nombre_Empleado");
                registros[2]=rs.getString("ApellidoP_Empleado");
                registros[3]=rs.getString("ApellidoM_Empleado");
                model.addRow(registros);
            }
            Tabla_Empleado.setModel(model);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }  
    }
    
    void limpiar(){
        TF_ID.setText("");
        TF_NombreEmpleado.setText("");
        TF_ApellidoP.setText("");
        TF_ApellidoM.setText("");
    }
    
    void cancelar(){
        TF_ID.setEnabled(false);
        TF_NombreEmpleado.setEnabled(false);
        TF_ApellidoP.setEnabled(false);
        TF_ApellidoM.setEnabled(false);
        B_Añadir.setEnabled(true);
        B_GuardarE.setEnabled(false);
        B_ActualizarE.setEnabled(false);
        B_CancelarE.setEnabled(false);
    }
    
    void nuevo(){
        TF_ID.setEnabled(true);
        TF_NombreEmpleado.setEnabled(true);
        TF_ApellidoP.setEnabled(true);
        TF_ApellidoM.setEnabled(true);
        B_Añadir.setEnabled(false);
        B_GuardarE.setEnabled(true);
        B_ActualizarE.setEnabled(true);
        B_CancelarE.setEnabled(true); 
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Pnl_Contenedor_Empleados = new javax.swing.JPanel();
        B_Añadir = new javax.swing.JButton();
        B_GuardarE = new javax.swing.JButton();
        B_ActualizarE = new javax.swing.JButton();
        B_CancelarE = new javax.swing.JButton();
        B_EliminarE = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        TF_ID = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        TF_NombreEmpleado = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        TF_ApellidoP = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TF_ApellidoM = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        TF_Buscar = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabla_Empleado = new javax.swing.JTable();
        B_Modificar = new javax.swing.JButton();
        Btn_Buscar = new javax.swing.JButton();

        Pnl_Contenedor_Empleados.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        B_Añadir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/P_Imagenes/spr_Añadir.png"))); // NOI18N
        B_Añadir.setText("Añadir");
        B_Añadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_AñadirActionPerformed(evt);
            }
        });
        Pnl_Contenedor_Empleados.add(B_Añadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        B_GuardarE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/P_Imagenes/spr_Guardar.png"))); // NOI18N
        B_GuardarE.setText("Guardar");
        B_GuardarE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_GuardarEActionPerformed(evt);
            }
        });
        Pnl_Contenedor_Empleados.add(B_GuardarE, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, -1, -1));

        B_ActualizarE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/P_Imagenes/spr_Actualizar.png"))); // NOI18N
        B_ActualizarE.setText("Actualizar");
        B_ActualizarE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_ActualizarEActionPerformed(evt);
            }
        });
        Pnl_Contenedor_Empleados.add(B_ActualizarE, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, -1, -1));

        B_CancelarE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/P_Imagenes/spr_CancelarRojo.png"))); // NOI18N
        B_CancelarE.setText("Cancelar");
        B_CancelarE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_CancelarEActionPerformed(evt);
            }
        });
        Pnl_Contenedor_Empleados.add(B_CancelarE, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, -1, -1));

        B_EliminarE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/P_Imagenes/spr_EliminarBote.png"))); // NOI18N
        B_EliminarE.setText("Eliminar");
        B_EliminarE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_EliminarEActionPerformed(evt);
            }
        });
        Pnl_Contenedor_Empleados.add(B_EliminarE, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 20, 110, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("ID Empleado:");
        Pnl_Contenedor_Empleados.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 130, -1, 30));

        TF_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_IDActionPerformed(evt);
            }
        });
        Pnl_Contenedor_Empleados.add(TF_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 130, 100, 25));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Nombre:");
        Pnl_Contenedor_Empleados.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 170, 60, 40));

        TF_NombreEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_NombreEmpleadoActionPerformed(evt);
            }
        });
        Pnl_Contenedor_Empleados.add(TF_NombreEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 180, 130, 25));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Apellido P:");
        Pnl_Contenedor_Empleados.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 230, -1, 30));

        TF_ApellidoP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_ApellidoPActionPerformed(evt);
            }
        });
        Pnl_Contenedor_Empleados.add(TF_ApellidoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 230, 130, 25));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Apellido M:");
        Pnl_Contenedor_Empleados.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 280, -1, 30));

        TF_ApellidoM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_ApellidoMActionPerformed(evt);
            }
        });
        Pnl_Contenedor_Empleados.add(TF_ApellidoM, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 280, 130, 25));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("| Buscar |");
        Pnl_Contenedor_Empleados.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 360, -1, 30));

        TF_Buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TF_BuscarKeyReleased(evt);
            }
        });
        Pnl_Contenedor_Empleados.add(TF_Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 360, 130, 25));

        Tabla_Empleado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(Tabla_Empleado);

        Pnl_Contenedor_Empleados.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 410, 310));

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
        Pnl_Contenedor_Empleados.add(B_Modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, 210, 30));

        Btn_Buscar.setText("Buscar por Nombre");
        Btn_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_BuscarActionPerformed(evt);
            }
        });
        Pnl_Contenedor_Empleados.add(Btn_Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 320, 200, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Pnl_Contenedor_Empleados, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Pnl_Contenedor_Empleados, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void B_AñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_AñadirActionPerformed
        nuevo();
        TF_ID.requestFocus();
    }//GEN-LAST:event_B_AñadirActionPerformed

    private void B_GuardarEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_GuardarEActionPerformed
         B_GuardarE.transferFocus();
        Conectar con = new Conectar();
        Connection cn = con.conexion();
            String ID_Empleado, Nombre_Empleado, ApellidoP_Empleado, ApellidoM_Empleado;
            String sql="";
            ID_Empleado = TF_ID.getText();
            Nombre_Empleado = TF_NombreEmpleado.getText();
            ApellidoP_Empleado = TF_ApellidoP.getText();
            ApellidoM_Empleado = TF_ApellidoM.getText();
            
            sql="INSERT INTO empleados (ID_Empleado, Nombre_Empleado, ApellidoP_Empleado, ApellidoM_Empleado ) VALUES (?,?,?,?)";
          try{  
            PreparedStatement psd = cn.prepareStatement(sql);
            psd.setString(1, ID_Empleado);
            psd.setString(2, Nombre_Empleado);
            psd.setString(3, ApellidoP_Empleado);
            psd.setString(4, ApellidoM_Empleado);
            
            int n = psd.executeUpdate();
            if(n > 0) {
                JOptionPane.showMessageDialog(null, "Registro guardado exitosamente");
                cancelar();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al guardar el registro");
        }
            cargarTabla("");                     
    }//GEN-LAST:event_B_GuardarEActionPerformed

    private void B_ActualizarEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_ActualizarEActionPerformed
    Conectar con = new Conectar();
        Connection cn = con.conexion();
            String ID, Nombre, Ape_P , Ape_M;
            String sql="";
            ID = TF_ID.getText();
            Nombre = TF_NombreEmpleado.getText();
            Ape_P = TF_ApellidoP.getText();
            Ape_M = TF_ApellidoM.getText();
            
            
            sql="Update empleados SET ID_Empleado=?, Nombre_Empleado=?, ApellidoP_Empleado=?, ApellidoM_Empleado=? WHERE ID_Empleado=?";
          try{  
            PreparedStatement psd = cn.prepareStatement(sql);
            psd.setString(1, ID);
            psd.setString(2, Nombre);
            psd.setString(3, Ape_P);
            psd.setString(4, Ape_M);
            psd.setString(5, ID);
            
            
            int n = psd.executeUpdate();
            if(n > 0) {
                JOptionPane.showMessageDialog(null, "Registro actualizado exitosamente");
                cancelar();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al actualizar el registro");
        }   
          cargarTabla("");
    }//GEN-LAST:event_B_ActualizarEActionPerformed

    private void B_CancelarEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_CancelarEActionPerformed
    cancelar();
    }//GEN-LAST:event_B_CancelarEActionPerformed

    private void TF_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_IDActionPerformed
    TF_ID.transferFocus();
    
    }//GEN-LAST:event_TF_IDActionPerformed

    private void TF_NombreEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_NombreEmpleadoActionPerformed
    TF_NombreEmpleado.transferFocus();

    }//GEN-LAST:event_TF_NombreEmpleadoActionPerformed

    private void TF_ApellidoPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_ApellidoPActionPerformed
    TF_ApellidoP.transferFocus();

    }//GEN-LAST:event_TF_ApellidoPActionPerformed

    private void TF_ApellidoMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_ApellidoMActionPerformed
    TF_ApellidoM.transferFocus();
    
    }//GEN-LAST:event_TF_ApellidoMActionPerformed

    private void B_ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_ModificarActionPerformed
        // TODO add your handling code here:
        B_GuardarE.setEnabled(false);
        nuevo();
        Codigo_ActE=Tabla_Empleado.getSelectedRow();
        int fila = Tabla_Empleado.getSelectedRow();
        if (fila>=0) {
            TF_ID.setText(Tabla_Empleado.getValueAt(fila, 0).toString());
            TF_NombreEmpleado.setText(Tabla_Empleado.getValueAt(fila, 1).toString());
            TF_ApellidoP.setText(Tabla_Empleado.getValueAt(fila, 2).toString());
            TF_ApellidoM.setText(Tabla_Empleado.getValueAt(fila, 3).toString());
            
        }else {
            JOptionPane.showMessageDialog(null, "Fila no seleccionada");
        }
    }//GEN-LAST:event_B_ModificarActionPerformed

    private void B_ModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_ModificarMouseClicked
        // TODO add your handling code here:
        B_GuardarE.setEnabled(false);
    }//GEN-LAST:event_B_ModificarMouseClicked

    private void TF_BuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_BuscarKeyReleased
        // TODO add your handling code here:
        cargarTabla(TF_Buscar.getText());
    }//GEN-LAST:event_TF_BuscarKeyReleased

    private void B_EliminarEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_EliminarEActionPerformed
        Conectar con = new Conectar();
        Connection cn = con.conexion();
            String id;
            String sql="";
            id = TF_ID.getText();
            Codigo_ActE=Tabla_Empleado.getSelectedRow();
        int fila = Tabla_Empleado.getSelectedRow();
        if (fila>=0) {
            TF_ID.setText(Tabla_Empleado.getValueAt(fila, 0).toString());
            
        }else {
            JOptionPane.showMessageDialog(null, "Fila no seleccionada");
        }
            sql="DELETE from empleados where ID_Empleado=?";
          try{  
            PreparedStatement psd = cn.prepareStatement(sql);
            psd.setString(1, id);
            
            
            int n = psd.executeUpdate();
            if(n > 0) {
                JOptionPane.showMessageDialog(null, "Registro eliminado exitosamente");
                cancelar();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al eliminar el registro");
        }   
          cargarTabla("");
    }//GEN-LAST:event_B_EliminarEActionPerformed

    private void Btn_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_BuscarActionPerformed
    // Buscar por nombre //
    
    }//GEN-LAST:event_Btn_BuscarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_ActualizarE;
    private javax.swing.JButton B_Añadir;
    private javax.swing.JButton B_CancelarE;
    private javax.swing.JButton B_EliminarE;
    private javax.swing.JButton B_GuardarE;
    private javax.swing.JButton B_Modificar;
    private javax.swing.JButton Btn_Buscar;
    private javax.swing.JPanel Pnl_Contenedor_Empleados;
    private javax.swing.JTextField TF_ApellidoM;
    private javax.swing.JTextField TF_ApellidoP;
    private javax.swing.JTextField TF_Buscar;
    private javax.swing.JTextField TF_ID;
    private javax.swing.JTextField TF_NombreEmpleado;
    private javax.swing.JTable Tabla_Empleado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}