package C_Clases;

import static C_Clases.JF_Ventana_Principal.Panel_0;
import java.applet.AudioClip;
import java.awt.BorderLayout;
import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class JP_Vender extends javax.swing.JPanel implements Runnable{
    DefaultTableModel model;
    DefaultTableModel modelB;
    int Codigo_Act;
    
    public JP_Vender() {
        initComponents();
        Hilo = new Thread(this);
        Hilo.start();
        HusoPaís = "Mexico/General";
        fecha(HusoPaís);
    }
    
    String Horas,Minutos,Segundos;
    Thread Hilo;
    int H = 0;
    
    String HusoPaís = "Mexico/General";
    double TotalCompra = 0;
    double TotalPago = 0;
    double TotalCambio = 0;
    int LongTabla = 0;
    
    public void hora()
    {
        Calendar Calendario = new GregorianCalendar();
        Date HoraActual = new Date();
        Calendario.setTime(HoraActual);
        Horas = Calendario.get(Calendar.HOUR_OF_DAY)>9?""+Calendario.get(Calendar.HOUR_OF_DAY):"0"+Calendario.get(Calendar.HOUR_OF_DAY);
        Minutos = Calendario.get(Calendar.MINUTE)>9?""+Calendario.get(Calendar.MINUTE):"0"+Calendario.get(Calendar.MINUTE);
        Segundos = Calendario.get(Calendar.SECOND)>9?""+Calendario.get(Calendar.SECOND):"0"+Calendario.get(Calendar.SECOND);
        H = Calendario.get(Calendar.HOUR_OF_DAY);
        if(H>24)
        {
        H = H - 24;    
        }
        Horas = Integer.toString(H);
    }
    
    public String fecha(String HusoPaís)
    {
    SimpleDateFormat Formato = new SimpleDateFormat("dd/MM/yyyy");
    Date FechaDate = new Date();
    String FechaPaises= "";
    TimeZone.setDefault(TimeZone.getTimeZone(HusoPaís));
    FechaPaises = Formato.format(FechaDate);
    Lbl_Fecha.setText(FechaPaises);
    String FechaActual = FechaPaises;
    return FechaActual;
    }
    
    public void run()
    {
        Thread Current = Thread.currentThread();
        while(Current==Hilo)
        {
            hora();
        } 
    }
    
    void cargarTablaBusqueda(String valor, String valor2)
    {
        String [] titulos={"Código","Nombre","Precio"};
        String [] registros = new String[3];

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
                registros[2]=rs.getString("Precio_Venta");

                model.addRow(registros);
            }
            Tbl_Búsqueda.setModel(model);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql2);
            
            while (rs.next()) {
                registros[0]=rs.getString("Codigo_Producto");
                registros[1]=rs.getString("Descripcion_Producto");
                registros[2]=rs.getString("Precio_Venta");
                model.addRow(registros);
            }
            Tbl_Búsqueda.setModel(model);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        } 
    }
    
    void guardarBajas()
    {
        modelB = (DefaultTableModel) Tbl_Venta.getModel();
    }
    
    void limpiarVentas()
    {
    Panel_0.removeAll();
    Panel_0.revalidate();
    Panel_0.repaint();
    }
    
    AudioClip Añadir = java.applet.Applet.newAudioClip(getClass().getResource("/P_Audios/Añadir.wav"));
    AudioClip Caja = java.applet.Applet.newAudioClip(getClass().getResource("/P_Audios/Caja.wav"));
    AudioClip Click = java.applet.Applet.newAudioClip(getClass().getResource("/P_Audios/Click.wav"));
    AudioClip Limpiar = java.applet.Applet.newAudioClip(getClass().getResource("/P_Audios/Limpiar.wav"));
    AudioClip Eliminar = java.applet.Applet.newAudioClip(getClass().getResource("/P_Audios/Eliminar.wav"));
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Dlg_Buscar = new javax.swing.JDialog();
        Pnl_ContBusc = new javax.swing.JPanel();
        Lbl_Ventas = new javax.swing.JLabel();
        Btn_Añadir = new javax.swing.JButton();
        Txt_Buscar = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tbl_Búsqueda = new javax.swing.JTable();
        Spn_Cantidad = new javax.swing.JSpinner();
        Dlg_Vender = new javax.swing.JDialog();
        Pnl_ContComp = new javax.swing.JPanel();
        Pnl_TotalCompra = new javax.swing.JPanel();
        Txt_TotalCompra = new javax.swing.JTextField();
        Lbl_Ventas2 = new javax.swing.JLabel();
        Pnl_Pago = new javax.swing.JPanel();
        Txt_TotalPago = new javax.swing.JTextField();
        Btn_Cancelar = new javax.swing.JButton();
        Btn_Aceptar = new javax.swing.JButton();
        Btn_OK = new javax.swing.JButton();
        Pnl_Contenedor_Vender = new javax.swing.JPanel();
        Btn_Comprar = new javax.swing.JButton();
        Txt_Total = new javax.swing.JTextField();
        Lbl_Total = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tbl_Venta = new javax.swing.JTable();
        Lbl_Total1 = new javax.swing.JLabel();
        Btn_Buscar = new javax.swing.JButton();
        Btn_Eliminar = new javax.swing.JButton();
        Lbl_Ventas1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Lbl_Empleado = new javax.swing.JLabel();
        Txt_Empleado = new javax.swing.JTextField();
        Lbl_Fecha = new javax.swing.JLabel();

        Dlg_Buscar.setTitle("Buscador de Artículos");
        Dlg_Buscar.setMinimumSize(new java.awt.Dimension(580, 450));
        Dlg_Buscar.setSize(new java.awt.Dimension(580, 420));
        Dlg_Buscar.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Pnl_ContBusc.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Lbl_Ventas.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Lbl_Ventas.setText("Panel de Busqueda:");
        Pnl_ContBusc.add(Lbl_Ventas, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 170, 40));

        Btn_Añadir.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Btn_Añadir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/P_Imagenes/spr_Añadir.png"))); // NOI18N
        Btn_Añadir.setText("Añadir Selección");
        Btn_Añadir.setEnabled(false);
        Btn_Añadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_AñadirActionPerformed(evt);
            }
        });
        Pnl_ContBusc.add(Btn_Añadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, 270, 80));

        Txt_Buscar.setBackground(new java.awt.Color(240, 240, 240));
        Txt_Buscar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Txt_Buscar.setOpaque(false);
        Txt_Buscar.setSelectedTextColor(new java.awt.Color(240, 240, 240));
        Txt_Buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Txt_BuscarKeyReleased(evt);
            }
        });
        Pnl_ContBusc.add(Txt_Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 310, 40));

        Tbl_Búsqueda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(Tbl_Búsqueda);

        Pnl_ContBusc.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 490, 210));

        Spn_Cantidad.setModel(new javax.swing.SpinnerNumberModel(1, 1, 500, 1));
        Spn_Cantidad.setToolTipText("");
        Spn_Cantidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Cantidad:"));
        Pnl_ContBusc.add(Spn_Cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 200, 80));

        Dlg_Buscar.getContentPane().add(Pnl_ContBusc, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 420));

        Dlg_Vender.setTitle("Finalizar Compra");
        Dlg_Vender.setSize(new java.awt.Dimension(330, 490));
        Dlg_Vender.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Pnl_ContComp.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Pnl_TotalCompra.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Total:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        Pnl_TotalCompra.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Txt_TotalCompra.setEditable(false);
        Txt_TotalCompra.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        Txt_TotalCompra.setText("0.0");
        Txt_TotalCompra.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Pnl_TotalCompra.add(Txt_TotalCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 220, 60));

        Pnl_ContComp.add(Pnl_TotalCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 260, 120));

        Lbl_Ventas2.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        Lbl_Ventas2.setText("Finalizar Compra:");
        Pnl_ContComp.add(Lbl_Ventas2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 240, 50));

        Pnl_Pago.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pagará con...", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        Pnl_Pago.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Txt_TotalPago.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        Txt_TotalPago.setText("0");
        Txt_TotalPago.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        Txt_TotalPago.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Txt_TotalPagoKeyReleased(evt);
            }
        });
        Pnl_Pago.add(Txt_TotalPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 220, 60));

        Pnl_ContComp.add(Pnl_Pago, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 260, 120));

        Btn_Cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/P_Imagenes/spr_Cancelar.png"))); // NOI18N
        Btn_Cancelar.setContentAreaFilled(false);
        Btn_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_CancelarActionPerformed(evt);
            }
        });
        Pnl_ContComp.add(Btn_Cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 370, 70, 70));

        Btn_Aceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/P_Imagenes/spr_Listo.png"))); // NOI18N
        Btn_Aceptar.setContentAreaFilled(false);
        Btn_Aceptar.setEnabled(false);
        Btn_Aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_AceptarActionPerformed(evt);
            }
        });
        Pnl_ContComp.add(Btn_Aceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 70, 70));

        Btn_OK.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        Btn_OK.setText("OK");
        Btn_OK.setEnabled(false);
        Btn_OK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_OKActionPerformed(evt);
            }
        });
        Pnl_ContComp.add(Btn_OK, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, 90, 70));

        Dlg_Vender.getContentPane().add(Pnl_ContComp, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 490));

        Pnl_Contenedor_Vender.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Btn_Comprar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/P_Imagenes/spr_Venta.png"))); // NOI18N
        Btn_Comprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ComprarActionPerformed(evt);
            }
        });
        Pnl_Contenedor_Vender.add(Btn_Comprar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 330, 110, 60));

        Txt_Total.setEditable(false);
        Txt_Total.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        Txt_Total.setText("0.0");
        Txt_Total.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Txt_Total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_TotalActionPerformed(evt);
            }
        });
        Pnl_Contenedor_Vender.add(Txt_Total, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 330, 160, 60));

        Lbl_Total.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Lbl_Total.setText("Total:");
        Pnl_Contenedor_Vender.add(Lbl_Total, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 330, 60, 60));

        Tbl_Venta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cantidad", "Código Producto", "Nombre Producto", "Precio Unitario", "Precio Neto"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tbl_Venta.setToolTipText("");
        jScrollPane1.setViewportView(Tbl_Venta);

        Pnl_Contenedor_Vender.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 650, 240));

        Lbl_Total1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Lbl_Total1.setText("$");
        Pnl_Contenedor_Vender.add(Lbl_Total1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 330, 20, 60));

        Btn_Buscar.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        Btn_Buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/P_Imagenes/spr_Buscar.png"))); // NOI18N
        Btn_Buscar.setText("Buscar");
        Btn_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_BuscarActionPerformed(evt);
            }
        });
        Pnl_Contenedor_Vender.add(Btn_Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 130, 60));

        Btn_Eliminar.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        Btn_Eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/P_Imagenes/spr_Borrar.png"))); // NOI18N
        Btn_Eliminar.setText("Eliminar");
        Btn_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_EliminarActionPerformed(evt);
            }
        });
        Pnl_Contenedor_Vender.add(Btn_Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, 130, 60));

        Lbl_Ventas1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Lbl_Ventas1.setText("Panel de Venta:");
        Pnl_Contenedor_Vender.add(Lbl_Ventas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 140, 50));

        jButton1.setFont(new java.awt.Font("Tahoma", 3, 15)); // NOI18N
        jButton1.setText("Limpiar Tablero");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        Pnl_Contenedor_Vender.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, 180, 30));

        Lbl_Empleado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Lbl_Empleado.setText("ID Empleado:");
        Pnl_Contenedor_Vender.add(Lbl_Empleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, 30));

        Txt_Empleado.setText("01");
        Pnl_Contenedor_Vender.add(Txt_Empleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 70, 30));

        Lbl_Fecha.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Lbl_Fecha.setText("DD / MM / YYYY");
        Pnl_Contenedor_Vender.add(Lbl_Fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 110, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Pnl_Contenedor_Vender, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Pnl_Contenedor_Vender, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents
    
    private void Txt_TotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_TotalActionPerformed
    
    }//GEN-LAST:event_Txt_TotalActionPerformed

    private void Btn_ComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ComprarActionPerformed
    //FINALIZAR COMPRA //
    Dlg_Buscar.dispose();
    Dlg_Vender.setVisible(true);
    Txt_TotalCompra.setText(""+TotalCompra);
    Click.play();
    }//GEN-LAST:event_Btn_ComprarActionPerformed

    private void Btn_AñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_AñadirActionPerformed
    // Añadir //
    int Selección = Tbl_Búsqueda.getSelectedRow();
    try
    {
    String Cantidad0,Código0, Nombre0,Unitario0,Neto0;
    int CantidadI = 1;
    double UnitarioD,NetoD;
    
        if(Selección==-1)
        {
        JOptionPane.showMessageDialog(null,"DEBE SELECCIONAR UN PRODUCTO PARA AÑADIR",
        "Advertencia Selección",JOptionPane.WARNING_MESSAGE);
        }
        else
        {
        model= (DefaultTableModel) Tbl_Venta.getModel();

        CantidadI = (int) Spn_Cantidad.getValue();
        Cantidad0 = String.valueOf(CantidadI);

        Código0 = Tbl_Búsqueda.getValueAt(Selección,0).toString();
        Nombre0 = Tbl_Búsqueda.getValueAt(Selección,1).toString();
        Unitario0 = Tbl_Búsqueda.getValueAt(Selección,2).toString();

        NetoD = Double.parseDouble (Unitario0) * CantidadI;
        Neto0 = String.valueOf(NetoD);

        TotalCompra = TotalCompra+NetoD;
        Txt_Total.setText(""+TotalCompra);

        model = (DefaultTableModel) Tbl_Venta.getModel();
        String FilaElemento[] = {Cantidad0,Código0,Nombre0,Unitario0,Neto0};
        model.addRow(FilaElemento);
        Spn_Cantidad.setValue(1);
        LongTabla++;
        Añadir.play();
        }   
    }
    catch (Exception e)
    {
        JOptionPane.showMessageDialog(null,"ERROR 01:"+e,"Error Búsqueda",
        JOptionPane.ERROR_MESSAGE);
    }
    
    }//GEN-LAST:event_Btn_AñadirActionPerformed

    private void Txt_BuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt_BuscarKeyReleased
    Btn_Añadir.setEnabled(true);
    cargarTablaBusqueda(Txt_Buscar.getText(), Txt_Buscar.getText());
    }//GEN-LAST:event_Txt_BuscarKeyReleased

    private void Btn_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_BuscarActionPerformed
    // Buscar //
    Dlg_Buscar.setVisible(true);
    Click.play();
    }//GEN-LAST:event_Btn_BuscarActionPerformed

    private void Btn_AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_AceptarActionPerformed
    // Listo //
    Txt_TotalPago.setEditable(false);
    Btn_OK.setEnabled(true);
    Btn_Cancelar.setEnabled(false);
    String PagoSI = Txt_TotalPago.getText();
    TotalPago = Double.parseDouble(PagoSI);
    TotalCambio = TotalPago-TotalCompra;
    Pnl_TotalCompra.setBorder(javax.swing.BorderFactory.createTitledBorder(null,
    "Cambio Total:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
    javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18)));
    Txt_TotalCompra.setText(""+TotalCambio);
    Pnl_Pago.setEnabled(false);
    Txt_TotalPago.setEnabled(false);
    Txt_TotalCompra.setBackground(new java.awt.Color(153,0,153));
    Btn_Aceptar.setEnabled(false);
    Caja.play();
    // Descontar en Inventario //
        int Contador;
        
        for(Contador = 0; Contador<LongTabla; Contador++)
        {
            int SelecciónQ;
            SelecciónQ = Contador;

            String CantidadQS = Tbl_Venta.getValueAt(SelecciónQ,0).toString();
            int CantidadQ = Integer.parseInt(CantidadQS);

            String CódigoQ = Tbl_Venta.getValueAt(SelecciónQ,1).toString();
            Conectar con = new Conectar();
            Connection cn = con.conexion();
            
            try
            {
                PreparedStatement pps= cn.prepareStatement("UPDATE inventario SET Stock_Actual = Stock_Actual -"+CantidadQ+
                " WHERE Codigo_Producto ="+CódigoQ);
                pps.executeUpdate();
            }
            catch (SQLException ex)
            {
                Logger.getLogger(JP_Vender.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        //Registrar Venta //
        String EmpleadoV;
        if(Txt_Empleado.getText().equals(""))
        {
            EmpleadoV = ""+01;
        }
        else
        {
            EmpleadoV = Txt_Empleado.getText();   
        }   
        Calendar C;
        C = Calendar.getInstance();
        int D = C.get(Calendar.DATE), M = 1+(C.get(Calendar.MONTH)), Y = C.get(Calendar.YEAR);
        String DS = Integer.toString(D);
        String MS = Integer.toString(M);
        String YS = Integer.toString(Y);
        String HoraV = Horas;
        String CantidadV = ""+TotalCompra;
        
        Conectar con = new Conectar();
        Connection cn = con.conexion();
        String SQLVenta = "INSERT INTO ventas (ID_Venta, ID_Empleado, Día_Venta, Mes_Venta, Año_Venta, Hora_Venta, Cantidad_Vendida)"
        +"VALUES ("+EmpleadoV+","+EmpleadoV+","+DS+","+MS+","+YS+","+HoraV+","+CantidadV+")";
            try
            {
                PreparedStatement pps2= cn.prepareStatement(SQLVenta);
                pps2.executeUpdate();
            }
            catch (SQLException ex)
            {
                Logger.getLogger(JP_Vender.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_Btn_AceptarActionPerformed

    private void Btn_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_CancelarActionPerformed
    // Cancelar //
    Dlg_Vender.dispose();
    Click.play();
    }//GEN-LAST:event_Btn_CancelarActionPerformed

    private void Txt_TotalPagoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt_TotalPagoKeyReleased
    // Escribir en Pago //
    String PagoSI = Txt_TotalPago.getText();
    int Long = PagoSI.length();
    if(PagoSI.equals("") || PagoSI.substring(Long-1).equals(".") || TotalCompra==0)
    {
        // No hace nada //
    }
    else
    {
    TotalPago = Double.parseDouble(PagoSI);
        if(TotalPago>=TotalCompra)
        {
            Btn_Aceptar.setEnabled(true);
        }
        else
        {
            Btn_Aceptar.setEnabled(false);
        }
    }
    }//GEN-LAST:event_Txt_TotalPagoKeyReleased

    private void Btn_OKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_OKActionPerformed
    // OK //
    Dlg_Vender.dispose();
    limpiarVentas();
    Limpiar.play();
    }//GEN-LAST:event_Btn_OKActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    // Limpiar tablero de Ventas //
    limpiarVentas();
    Limpiar.play();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void Btn_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_EliminarActionPerformed
    // Eliminar //
    int FSel;
    int Respuesta;
    String Neto0, Unitario0,Cantidad0;
    double NetoD;
    int CantidadIZ;
        try
        {
           FSel = Tbl_Venta.getSelectedRow();
           if(FSel==-1)
           {
               JOptionPane.showMessageDialog(null,"NO SE HA SELECCIONADO FILA "
               + "PARA BORRAR","Advertencia",JOptionPane.ERROR_MESSAGE);
           }
           else
           {
               Respuesta = JOptionPane.showConfirmDialog(null,"¿DESEAS BORRAR ESTE PRODUCTO "
               + "DE LA VENTA ACTUAL?", "Confirmación", JOptionPane.YES_NO_OPTION);
               
               if(Respuesta==JOptionPane.YES_OPTION)
               {
                    Unitario0 = Tbl_Venta.getValueAt(FSel,3).toString();
                    CantidadIZ = Integer.parseInt((String) Tbl_Venta.getValueAt(FSel,0));
                    Cantidad0 = String.valueOf(CantidadIZ);
                    NetoD = Double.parseDouble (Unitario0) * CantidadIZ;
                    TotalCompra=TotalCompra - NetoD;
                    Txt_Total.setText(""+TotalCompra);
                    model = (DefaultTableModel) Tbl_Venta.getModel();
                    model.removeRow(FSel);
                    Eliminar.play();
                    LongTabla--;
                    Conectar con = new Conectar();
                    Connection cn = con.conexion();
               }
               else
               {
                    // No hace nada //  
               }       
           }  
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null,"ERROR 02","Error Venta",
            JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_Btn_EliminarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Aceptar;
    private javax.swing.JButton Btn_Añadir;
    private javax.swing.JButton Btn_Buscar;
    private javax.swing.JButton Btn_Cancelar;
    private javax.swing.JButton Btn_Comprar;
    private javax.swing.JButton Btn_Eliminar;
    private javax.swing.JButton Btn_OK;
    private javax.swing.JDialog Dlg_Buscar;
    private javax.swing.JDialog Dlg_Vender;
    private javax.swing.JLabel Lbl_Empleado;
    private javax.swing.JLabel Lbl_Fecha;
    private javax.swing.JLabel Lbl_Total;
    private javax.swing.JLabel Lbl_Total1;
    private javax.swing.JLabel Lbl_Ventas;
    private javax.swing.JLabel Lbl_Ventas1;
    private javax.swing.JLabel Lbl_Ventas2;
    private javax.swing.JPanel Pnl_ContBusc;
    private javax.swing.JPanel Pnl_ContComp;
    private javax.swing.JPanel Pnl_Contenedor_Vender;
    private javax.swing.JPanel Pnl_Pago;
    private javax.swing.JPanel Pnl_TotalCompra;
    private javax.swing.JSpinner Spn_Cantidad;
    private javax.swing.JTable Tbl_Búsqueda;
    private javax.swing.JTable Tbl_Venta;
    private javax.swing.JTextField Txt_Buscar;
    private javax.swing.JTextField Txt_Empleado;
    private javax.swing.JTextField Txt_Total;
    private javax.swing.JTextField Txt_TotalCompra;
    private javax.swing.JTextField Txt_TotalPago;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}