package C_Clases;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class JP_Estadísticas extends javax.swing.JPanel {
DefaultTableModel model;

    public JP_Estadísticas() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Pnl_Contenedor_Estadísticas = new javax.swing.JPanel();
        Btn_Ventas_D = new javax.swing.JButton();
        Btn_Ventas_M = new javax.swing.JButton();
        Btn_Ganancias_M = new javax.swing.JButton();
        Btn_Ganancias_D = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tbl_Ventas = new javax.swing.JTable();
        Txt_Ganancias_Día = new javax.swing.JTextField();
        Txt_Ganancias_Mes = new javax.swing.JTextField();
        Lbl_Dinero_1 = new javax.swing.JLabel();
        Lbl_Dinero_2 = new javax.swing.JLabel();

        Pnl_Contenedor_Estadísticas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Btn_Ventas_D.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Btn_Ventas_D.setIcon(new javax.swing.ImageIcon(getClass().getResource("/P_Imagenes/spr_Ventas_Día.png"))); // NOI18N
        Btn_Ventas_D.setText("Ventas [Hoy]");
        Btn_Ventas_D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Ventas_DActionPerformed(evt);
            }
        });
        Pnl_Contenedor_Estadísticas.add(Btn_Ventas_D, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 170, 60));

        Btn_Ventas_M.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Btn_Ventas_M.setIcon(new javax.swing.ImageIcon(getClass().getResource("/P_Imagenes/spr_Ventas_Mes.png"))); // NOI18N
        Btn_Ventas_M.setText("Ventas [Mes]");
        Btn_Ventas_M.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_Ventas_MMouseClicked(evt);
            }
        });
        Btn_Ventas_M.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Ventas_MActionPerformed(evt);
            }
        });
        Pnl_Contenedor_Estadísticas.add(Btn_Ventas_M, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 170, 60));

        Btn_Ganancias_M.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Btn_Ganancias_M.setIcon(new javax.swing.ImageIcon(getClass().getResource("/P_Imagenes/spr_Ganancias_Mes.png"))); // NOI18N
        Btn_Ganancias_M.setText("Ganancias [Mes]");
        Btn_Ganancias_M.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Ganancias_MActionPerformed(evt);
            }
        });
        Pnl_Contenedor_Estadísticas.add(Btn_Ganancias_M, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 170, 59));

        Btn_Ganancias_D.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Btn_Ganancias_D.setIcon(new javax.swing.ImageIcon(getClass().getResource("/P_Imagenes/spr_Ganancias_Día.png"))); // NOI18N
        Btn_Ganancias_D.setText("Ganancias [Hoy]");
        Btn_Ganancias_D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Ganancias_DActionPerformed(evt);
            }
        });
        Pnl_Contenedor_Estadísticas.add(Btn_Ganancias_D, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 170, 60));

        Tbl_Ventas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(Tbl_Ventas);

        Pnl_Contenedor_Estadísticas.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 650, 220));

        Txt_Ganancias_Día.setEditable(false);
        Txt_Ganancias_Día.setFont(new java.awt.Font("Consolas", 1, 20)); // NOI18N
        Txt_Ganancias_Día.setText("Seleccione la Opción");
        Pnl_Contenedor_Estadísticas.add(Txt_Ganancias_Día, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 230, 60));

        Txt_Ganancias_Mes.setEditable(false);
        Txt_Ganancias_Mes.setFont(new java.awt.Font("Consolas", 1, 20)); // NOI18N
        Txt_Ganancias_Mes.setText("Seleccione la Opción");
        Pnl_Contenedor_Estadísticas.add(Txt_Ganancias_Mes, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, 230, 60));

        Lbl_Dinero_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/P_Imagenes/spr_Dinero.png"))); // NOI18N
        Pnl_Contenedor_Estadísticas.add(Lbl_Dinero_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 20, 30, 60));

        Lbl_Dinero_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/P_Imagenes/spr_Dinero.png"))); // NOI18N
        Pnl_Contenedor_Estadísticas.add(Lbl_Dinero_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 90, 30, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Pnl_Contenedor_Estadísticas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Pnl_Contenedor_Estadísticas, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    void cargarTabla1()
    {
        String [] titulos={"ID_Venta", "ID_Empleado", "Día_Venta", "Mes_Venta", "Año_Venta", "Hora_Venta", "Cantidad_Vendida"};
        String [] registros = new String[7];
        
        Calendar cal=Calendar.getInstance();
        int Mes=cal.get(cal.MONTH)+1;
        int Año=cal.get(cal.YEAR);
        int Día=cal.get(cal.DATE);
        
        String sql= "SELECT * FROM ventas where Mes_Venta LIKE '%"+Mes+"%'and Año_Venta LIKE '%"+Año+"%'and Día_Venta LIKE '%"+Día+"%'";
        String fecha=cal.get(cal.YEAR)+"/"+cal.get(cal.MONTH)+"/"+cal.get(cal.DATE);
        
        model= new DefaultTableModel(null, titulos);
        
        Conectar con = new Conectar();
        Connection cn = con.conexion();
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while (rs.next()) {
                registros[0]=rs.getString("ID_Venta");
                registros[1]=rs.getString("ID_Empleado");
                registros[2]=rs.getString("Día_Venta");
                registros[3]=rs.getString("Mes_Venta");
                registros[4]=rs.getString("Año_Venta");
                registros[5]=rs.getString("Hora_Venta");
                registros[6]=rs.getString("Cantidad_Vendida");
                model.addRow(registros);
            }
            Tbl_Ventas.setModel(model);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    void cargarTabla2()
    {
        String [] titulos={"ID_Venta", "ID_Empleado", "Día_Venta", "Mes_Venta", "Año_Venta", "Hora_Venta", "Cantidad_Vendida"};
        String [] registros = new String[7];
        
        Calendar cal=Calendar.getInstance(); 
        int Mes=cal.get(cal.MONTH)+1;
        int Año=cal.get(cal.YEAR);
        int Día=cal.get(cal.DATE);
        String sql= "SELECT * FROM ventas where Mes_Venta LIKE '%"+Mes+"%' and Año_Venta LIkE '%"+Año+"%'";
        
        String fecha=cal.get(cal.YEAR)+"/"+cal.get(cal.MONTH);
        
        model= new DefaultTableModel(null, titulos);
        
        Conectar con = new Conectar();
        Connection cn = con.conexion();
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                registros[0]=rs.getString("ID_Venta");
                registros[1]=rs.getString("ID_Empleado");
                registros[2]=rs.getString("Día_Venta");
                registros[3]=rs.getString("Mes_Venta");
                registros[4]=rs.getString("Año_Venta");
                registros[5]=rs.getString("Hora_Venta");
                registros[6]=rs.getString("Cantidad_Vendida");
                model.addRow(registros);
            }
            Tbl_Ventas.setModel(model);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
 void cargarTabla3()
    {
        String [] titulos={"Total_Vendido_Mes"};
        String [] registros = new String[1];
        
        Calendar cal=Calendar.getInstance(); 
        String fecha=cal.get(cal.YEAR)+"/"+cal.get(cal.MONTH);
        int Mes=cal.get(cal.MONTH)+1;
        int Año=cal.get(cal.YEAR);

        String sql= "SELECT sum(Cantidad_Vendida) as Total_Vendido_Mes FROM ventas where Mes_Venta LIKE '%"+Mes+"%' and Año_Venta LIkE '%"+Año+"%'";
        
        model= new DefaultTableModel(null, titulos);
        
        Conectar con = new Conectar();
        Connection cn = con.conexion();
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while (rs.next()) {
                registros[0]=rs.getString("Total_Vendido_Mes");
                model.addRow(registros);
            }
            Txt_Ganancias_Mes.setText(registros[0]);
            Txt_Ganancias_Mes.setText(registros[0]);
            if(Txt_Ganancias_Mes.getText().equals("") || Txt_Ganancias_Mes.getText().equals("0"))
            {
                Txt_Ganancias_Mes.setText("0.0");
            }  
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
 void cargarTabla4()
    {
        String [] titulos={"Total_Vendido_Día"};
        String [] registros = new String[1];
        
        Calendar cal=Calendar.getInstance(); 
        String fecha=cal.get(cal.YEAR)+"/"+cal.get(cal.MONTH)+"/"+cal.get(cal.DAY_OF_YEAR);
        int Mes=cal.get(cal.MONTH)+1;
        int Año=cal.get(cal.YEAR);
        int Día=cal.get(cal.DATE);

        String sql= "SELECT sum(Cantidad_Vendida) as Total_Vendido_Día FROM ventas where Mes_Venta LIKE '%"+Mes+"%' and Año_Venta LIkE '%"+Año+"%'and Día_Venta LIkE '%"+Día+"%'";
        
        model= new DefaultTableModel(null, titulos);
        
        Conectar con = new Conectar();
        Connection cn = con.conexion();
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while (rs.next()) {
                registros[0]=rs.getString("Total_Vendido_Día");
                model.addRow(registros);
            }
            Txt_Ganancias_Día.setText(registros[0]);
            if(Txt_Ganancias_Día.getText().equals("") || Txt_Ganancias_Día.getText().equals("0"))
            {
                Txt_Ganancias_Día.setText("0.0");
            }  
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    } 
    private void Btn_Ventas_DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Ventas_DActionPerformed
    cargarTabla1();
    }//GEN-LAST:event_Btn_Ventas_DActionPerformed

    private void Btn_Ventas_MMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_Ventas_MMouseClicked
    cargarTabla2();
    }//GEN-LAST:event_Btn_Ventas_MMouseClicked

    private void Btn_Ganancias_MActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Ganancias_MActionPerformed
    cargarTabla3();
    }//GEN-LAST:event_Btn_Ganancias_MActionPerformed

    private void Btn_Ganancias_DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Ganancias_DActionPerformed
    cargarTabla4();
    }//GEN-LAST:event_Btn_Ganancias_DActionPerformed

    private void Btn_Ventas_MActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Ventas_MActionPerformed
    
    }//GEN-LAST:event_Btn_Ventas_MActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Ganancias_D;
    private javax.swing.JButton Btn_Ganancias_M;
    private javax.swing.JButton Btn_Ventas_D;
    private javax.swing.JButton Btn_Ventas_M;
    private javax.swing.JLabel Lbl_Dinero_1;
    private javax.swing.JLabel Lbl_Dinero_2;
    private javax.swing.JPanel Pnl_Contenedor_Estadísticas;
    private javax.swing.JTable Tbl_Ventas;
    private javax.swing.JTextField Txt_Ganancias_Día;
    private javax.swing.JTextField Txt_Ganancias_Mes;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}