package C_Clases;

/* Desarrolladores:
    * Alejandro Ramos Herrera (@arhcoder).
    * Andrés Pérez Collazo.
    * Rafael Palacios Jiménez.
*/
// Imágenes utilizadas: Flaticon | Mercado de Vectores | https://www.flaticon.com.
// Licencia: Creative Commons - Attribution-NonCommercial 4.0 International (CC BY-NC 4.0).
// Desarrollado en noviembre de 2018.
// Tiempo de desarrollo: 1 mes.
// Propósito: Práctica.

import java.applet.AudioClip;
import java.awt.BorderLayout;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import javax.swing.ImageIcon;

public class JF_Ventana_Principal extends javax.swing.JFrame implements Runnable{
    
    public JF_Ventana_Principal() {
        initComponents();
        this.setVisible(true);
        setTitle("Proyecto - Punto de Venta | InterGoodil; |");
        setLocationRelativeTo(null);
        setResizable(true);
        setIconImage(new ImageIcon(getClass().getResource
        ("/P_Imagenes/spr_Logo_IG.png")).getImage());
        Hilo = new Thread(this);
        Hilo.start();
        HusoPaís = "Mexico/General";
        fecha(HusoPaís);
    }
    
    AudioClip Limpiar = java.applet.Applet.newAudioClip(getClass().getResource("/P_Audios/Limpiar.wav"));
    
    String Contraseña = "12345";
    String ContraseñaPase;
    
    String Horas,Minutos,Segundos;
    Thread Hilo;
    int H = 0;
    
    String HusoPaís = "Mexico/General";
    
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
    
    public void fecha(String HusoPaís)
    {
    SimpleDateFormat Formato = new SimpleDateFormat("dd / MM / yyyy");
    Date FechaDate = new Date();
    String FechaPaises= "";
    TimeZone.setDefault(TimeZone.getTimeZone(HusoPaís));
    FechaPaises = Formato.format(FechaDate);
    Fecha.setText(FechaPaises);
    }
    
    public void accesarIn()
    {
        ContraseñaPase = new String(Psf_In.getPassword());
    
        if(ContraseñaPase.equals(Contraseña))
        {
            Lbl_Datos_In.setForeground(new java.awt.Color(51, 255, 0));
            Lbl_Datos_In.setText("Datos Correctos");
            Btn_NO_In.setEnabled(false);
            Btn_Abrir_In.setEnabled(true);
        }
        else if (!ContraseñaPase.equals(Contraseña))
        {
            Lbl_Datos_In.setForeground(new java.awt.Color(255, 0, 0));
            Lbl_Datos_In.setText("Datos Incorrectos");
            Btn_NO_In.setEnabled(true);
            Btn_Abrir_In.setEnabled(false);
        }  
    }
    
    public void accesarEm()
    {
        ContraseñaPase = new String(Psf_Em.getPassword());
    
        if(ContraseñaPase.equals(Contraseña))
        {
            Lbl_Datos_Em.setForeground(new java.awt.Color(51, 255, 0));
            Lbl_Datos_Em.setText("Datos Correctos");
            Btn_NO_Em.setEnabled(false);
            Btn_Abrir_Em.setEnabled(true);
        }
        else if (!ContraseñaPase.equals(Contraseña))
        {
            Lbl_Datos_Em.setForeground(new java.awt.Color(255, 0, 0));
            Lbl_Datos_Em.setText("Datos Incorrectos");
            Btn_NO_Em.setEnabled(true);
            Btn_Abrir_Em.setEnabled(false);
        }  
    }
    
    public void accesarEs()
    {
        ContraseñaPase = new String(Psf_Es.getPassword());
    
        if(ContraseñaPase.equals(Contraseña))
        {
            Lbl_Datos_Es.setForeground(new java.awt.Color(51, 255, 0));
            Lbl_Datos_Es.setText("Datos Correctos");
            Btn_NO_Es.setEnabled(false);
            Btn_Abrir_Es.setEnabled(true);
        }
        else if (!ContraseñaPase.equals(Contraseña))
        {
            Lbl_Datos_Es.setForeground(new java.awt.Color(255, 0, 0));
            Lbl_Datos_Es.setText("Datos Incorrectos");
            Btn_NO_Es.setEnabled(true);
            Btn_Abrir_Es.setEnabled(false);
        }  
    }
    
    public void run()
    {
        Thread Current = Thread.currentThread();
        while(Current==Hilo)
        {
            hora();
            Hora.setText(Horas+" : "+Minutos+" : "+Segundos+" Hrs.");
        } 
    }
    
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Dlg_Acceso_In = new javax.swing.JDialog();
        Lbl_In = new javax.swing.JLabel();
        Psf_In = new javax.swing.JPasswordField();
        Lbl_Icono_In = new javax.swing.JLabel();
        Btn_OK_In = new javax.swing.JButton();
        Btn_NO_In = new javax.swing.JButton();
        Btn_Abrir_In = new javax.swing.JButton();
        Lbl_Datos_In = new javax.swing.JLabel();
        Pnl_Margen_In = new javax.swing.JPanel();
        Dlg_Acceso_Em = new javax.swing.JDialog();
        Lbl_Em = new javax.swing.JLabel();
        Psf_Em = new javax.swing.JPasswordField();
        Lbl_Icono_Em = new javax.swing.JLabel();
        Btn_OK_Em = new javax.swing.JButton();
        Btn_NO_Em = new javax.swing.JButton();
        Btn_Abrir_Em = new javax.swing.JButton();
        Lbl_Datos_Em = new javax.swing.JLabel();
        Pnl_Margen_Em = new javax.swing.JPanel();
        Dlg_Acceso_Es = new javax.swing.JDialog();
        Lbl_Es = new javax.swing.JLabel();
        Psf_Es = new javax.swing.JPasswordField();
        Lbl_Icono_Es = new javax.swing.JLabel();
        Btn_OK_Es = new javax.swing.JButton();
        Btn_NO_Es = new javax.swing.JButton();
        Btn_Abrir_Es = new javax.swing.JButton();
        Lbl_Datos_Es = new javax.swing.JLabel();
        Pnl_Margen_Es = new javax.swing.JPanel();
        Panel_0 = new javax.swing.JPanel();
        JMB_Menú = new javax.swing.JMenuBar();
        JMB_Inventario = new javax.swing.JMenu();
        JMB_Empleados = new javax.swing.JMenu();
        JMB_Vender = new javax.swing.JMenu();
        JMB_Estadísticas = new javax.swing.JMenu();
        JMB_Reloj = new javax.swing.JMenu();
        Fecha = new javax.swing.JMenu();
        Hora = new javax.swing.JMenu();
        JMB_Salir = new javax.swing.JMenu();

        Dlg_Acceso_In.setTitle("Acceso Ventana - Inventario");
        Dlg_Acceso_In.setSize(new java.awt.Dimension(375, 320));
        Dlg_Acceso_In.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Lbl_In.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Lbl_In.setText("Ingrese Contraseña:");
        Dlg_Acceso_In.getContentPane().add(Lbl_In, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 170, 50));

        Psf_In.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        Psf_In.setText("Contraseña");
        Dlg_Acceso_In.getContentPane().add(Psf_In, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 180, 30));

        Lbl_Icono_In.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Lbl_Icono_In.setIcon(new javax.swing.ImageIcon(getClass().getResource("/P_Imagenes/spr_Advertencia.png"))); // NOI18N
        Dlg_Acceso_In.getContentPane().add(Lbl_Icono_In, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, -1, 70));

        Btn_OK_In.setIcon(new javax.swing.ImageIcon(getClass().getResource("/P_Imagenes/spr_Listo.png"))); // NOI18N
        Btn_OK_In.setContentAreaFilled(false);
        Btn_OK_In.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_OK_InActionPerformed(evt);
            }
        });
        Dlg_Acceso_In.getContentPane().add(Btn_OK_In, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 70, 70));

        Btn_NO_In.setIcon(new javax.swing.ImageIcon(getClass().getResource("/P_Imagenes/spr_Cancelar.png"))); // NOI18N
        Btn_NO_In.setContentAreaFilled(false);
        Btn_NO_In.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_NO_InActionPerformed(evt);
            }
        });
        Dlg_Acceso_In.getContentPane().add(Btn_NO_In, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 70, 70));

        Btn_Abrir_In.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Btn_Abrir_In.setText("Abrir");
        Btn_Abrir_In.setEnabled(false);
        Btn_Abrir_In.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Abrir_InActionPerformed(evt);
            }
        });
        Dlg_Acceso_In.getContentPane().add(Btn_Abrir_In, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 90, 70));

        Lbl_Datos_In.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Lbl_Datos_In.setText("Datos Pendientes");
        Dlg_Acceso_In.getContentPane().add(Lbl_Datos_In, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 180, 30));

        javax.swing.GroupLayout Pnl_Margen_InLayout = new javax.swing.GroupLayout(Pnl_Margen_In);
        Pnl_Margen_In.setLayout(Pnl_Margen_InLayout);
        Pnl_Margen_InLayout.setHorizontalGroup(
            Pnl_Margen_InLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );
        Pnl_Margen_InLayout.setVerticalGroup(
            Pnl_Margen_InLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        Dlg_Acceso_In.getContentPane().add(Pnl_Margen_In, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 360, 30));

        Dlg_Acceso_Em.setTitle("Acceso Ventana - Empleados");
        Dlg_Acceso_Em.setSize(new java.awt.Dimension(375, 320));
        Dlg_Acceso_Em.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Lbl_Em.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Lbl_Em.setText("Ingrese Contraseña:");
        Dlg_Acceso_Em.getContentPane().add(Lbl_Em, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 170, 50));

        Psf_Em.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        Psf_Em.setText("Contraseña");
        Dlg_Acceso_Em.getContentPane().add(Psf_Em, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 180, 30));

        Lbl_Icono_Em.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Lbl_Icono_Em.setIcon(new javax.swing.ImageIcon(getClass().getResource("/P_Imagenes/spr_Advertencia.png"))); // NOI18N
        Dlg_Acceso_Em.getContentPane().add(Lbl_Icono_Em, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, -1, 70));

        Btn_OK_Em.setIcon(new javax.swing.ImageIcon(getClass().getResource("/P_Imagenes/spr_Listo.png"))); // NOI18N
        Btn_OK_Em.setContentAreaFilled(false);
        Btn_OK_Em.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_OK_EmActionPerformed(evt);
            }
        });
        Dlg_Acceso_Em.getContentPane().add(Btn_OK_Em, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 70, 70));

        Btn_NO_Em.setIcon(new javax.swing.ImageIcon(getClass().getResource("/P_Imagenes/spr_Cancelar.png"))); // NOI18N
        Btn_NO_Em.setContentAreaFilled(false);
        Btn_NO_Em.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_NO_EmActionPerformed(evt);
            }
        });
        Dlg_Acceso_Em.getContentPane().add(Btn_NO_Em, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 70, 70));

        Btn_Abrir_Em.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Btn_Abrir_Em.setText("Abrir");
        Btn_Abrir_Em.setEnabled(false);
        Btn_Abrir_Em.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Abrir_EmActionPerformed(evt);
            }
        });
        Dlg_Acceso_Em.getContentPane().add(Btn_Abrir_Em, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 90, 70));

        Lbl_Datos_Em.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Lbl_Datos_Em.setText("Datos Pendientes");
        Dlg_Acceso_Em.getContentPane().add(Lbl_Datos_Em, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 180, 30));

        javax.swing.GroupLayout Pnl_Margen_EmLayout = new javax.swing.GroupLayout(Pnl_Margen_Em);
        Pnl_Margen_Em.setLayout(Pnl_Margen_EmLayout);
        Pnl_Margen_EmLayout.setHorizontalGroup(
            Pnl_Margen_EmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );
        Pnl_Margen_EmLayout.setVerticalGroup(
            Pnl_Margen_EmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        Dlg_Acceso_Em.getContentPane().add(Pnl_Margen_Em, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 360, 30));

        Dlg_Acceso_Es.setTitle("Acceso Ventana - Estadísticas");
        Dlg_Acceso_Es.setSize(new java.awt.Dimension(375, 320));
        Dlg_Acceso_Es.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Lbl_Es.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Lbl_Es.setText("Ingrese Contraseña:");
        Dlg_Acceso_Es.getContentPane().add(Lbl_Es, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 170, 50));

        Psf_Es.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        Psf_Es.setText("Contraseña");
        Dlg_Acceso_Es.getContentPane().add(Psf_Es, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 180, 30));

        Lbl_Icono_Es.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Lbl_Icono_Es.setIcon(new javax.swing.ImageIcon(getClass().getResource("/P_Imagenes/spr_Advertencia.png"))); // NOI18N
        Dlg_Acceso_Es.getContentPane().add(Lbl_Icono_Es, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, -1, 70));

        Btn_OK_Es.setIcon(new javax.swing.ImageIcon(getClass().getResource("/P_Imagenes/spr_Listo.png"))); // NOI18N
        Btn_OK_Es.setContentAreaFilled(false);
        Btn_OK_Es.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_OK_EsActionPerformed(evt);
            }
        });
        Dlg_Acceso_Es.getContentPane().add(Btn_OK_Es, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 70, 70));

        Btn_NO_Es.setIcon(new javax.swing.ImageIcon(getClass().getResource("/P_Imagenes/spr_Cancelar.png"))); // NOI18N
        Btn_NO_Es.setContentAreaFilled(false);
        Btn_NO_Es.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_NO_EsActionPerformed(evt);
            }
        });
        Dlg_Acceso_Es.getContentPane().add(Btn_NO_Es, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 70, 70));

        Btn_Abrir_Es.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Btn_Abrir_Es.setText("Abrir");
        Btn_Abrir_Es.setEnabled(false);
        Btn_Abrir_Es.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Abrir_EsActionPerformed(evt);
            }
        });
        Dlg_Acceso_Es.getContentPane().add(Btn_Abrir_Es, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 90, 70));

        Lbl_Datos_Es.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Lbl_Datos_Es.setText("Datos Pendientes");
        Dlg_Acceso_Es.getContentPane().add(Lbl_Datos_Es, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 180, 30));

        javax.swing.GroupLayout Pnl_Margen_EsLayout = new javax.swing.GroupLayout(Pnl_Margen_Es);
        Pnl_Margen_Es.setLayout(Pnl_Margen_EsLayout);
        Pnl_Margen_EsLayout.setHorizontalGroup(
            Pnl_Margen_EsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );
        Pnl_Margen_EsLayout.setVerticalGroup(
            Pnl_Margen_EsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        Dlg_Acceso_Es.getContentPane().add(Pnl_Margen_Es, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 360, 30));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout Panel_0Layout = new javax.swing.GroupLayout(Panel_0);
        Panel_0.setLayout(Panel_0Layout);
        Panel_0Layout.setHorizontalGroup(
            Panel_0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );
        Panel_0Layout.setVerticalGroup(
            Panel_0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
        );

        getContentPane().add(Panel_0, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 720, 440));

        JMB_Inventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/P_Imagenes/spr_Inventario.png"))); // NOI18N
        JMB_Inventario.setFont(new java.awt.Font("Kalinga", 0, 14)); // NOI18N
        JMB_Inventario.setText("Inventario");
        JMB_Inventario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JMB_InventarioMouseClicked(evt);
            }
        });
        JMB_Menú.add(JMB_Inventario);

        JMB_Empleados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/P_Imagenes/spr_Empleados.png"))); // NOI18N
        JMB_Empleados.setFont(new java.awt.Font("Kalinga", 0, 14)); // NOI18N
        JMB_Empleados.setText("Empleados");
        JMB_Empleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JMB_EmpleadosMouseClicked(evt);
            }
        });
        JMB_Menú.add(JMB_Empleados);

        JMB_Vender.setIcon(new javax.swing.ImageIcon(getClass().getResource("/P_Imagenes/spr_Vender.png"))); // NOI18N
        JMB_Vender.setFont(new java.awt.Font("Kalinga", 0, 14)); // NOI18N
        JMB_Vender.setText("Vender");
        JMB_Vender.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JMB_VenderMouseClicked(evt);
            }
        });
        JMB_Menú.add(JMB_Vender);

        JMB_Estadísticas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/P_Imagenes/spr_Estadísticas.png"))); // NOI18N
        JMB_Estadísticas.setFont(new java.awt.Font("Kalinga", 0, 14)); // NOI18N
        JMB_Estadísticas.setText("Estadísticas");
        JMB_Estadísticas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JMB_EstadísticasMouseClicked(evt);
            }
        });
        JMB_Menú.add(JMB_Estadísticas);

        JMB_Reloj.setIcon(new javax.swing.ImageIcon(getClass().getResource("/P_Imagenes/spr_Reloj.png"))); // NOI18N
        JMB_Reloj.setText("Reloj");

        Fecha.setText("DD / MM / YYYY");
        JMB_Reloj.add(Fecha);

        Hora.setText("00 : 00 : 00");
        JMB_Reloj.add(Hora);

        JMB_Menú.add(JMB_Reloj);

        JMB_Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/P_Imagenes/spr_Salir.png"))); // NOI18N
        JMB_Salir.setFont(new java.awt.Font("Kalinga", 0, 14)); // NOI18N
        JMB_Salir.setText("Salir");
        JMB_Salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JMB_SalirMouseClicked(evt);
            }
        });
        JMB_Menú.add(JMB_Salir);

        setJMenuBar(JMB_Menú);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JMB_SalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JMB_SalirMouseClicked
    // MENÚ - Salir //
    this.dispose();
    Limpiar.play();
    }//GEN-LAST:event_JMB_SalirMouseClicked

    private void JMB_VenderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JMB_VenderMouseClicked
    // MENÚ - Vender //
    JP_Vender Panel_Vender = new JP_Vender();
    Panel_Vender.setSize(700,410);
    Panel_Vender.setLocation(8, 8);
    Panel_0.removeAll();
    Panel_0.add(Panel_Vender, BorderLayout.CENTER);
    Panel_0.revalidate();
    Panel_0.repaint();
    Limpiar.play();
    }//GEN-LAST:event_JMB_VenderMouseClicked

    private void JMB_InventarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JMB_InventarioMouseClicked
    // MENÚ - Inventario //
    Dlg_Acceso_In.dispose();
    Dlg_Acceso_Em.dispose();
    Dlg_Acceso_Es.dispose();
    Psf_In.setText("Contraseña");
    Lbl_Datos_In.setForeground(new java.awt.Color(0, 0, 0));
    Lbl_Datos_In.setText("Datos Pendientes");
    Btn_NO_In.setEnabled(true);
    Btn_Abrir_In.setEnabled(false);
    Dlg_Acceso_In.setVisible(true);
    Dlg_Acceso_In.setLocationRelativeTo(null);
    }//GEN-LAST:event_JMB_InventarioMouseClicked

    private void JMB_EmpleadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JMB_EmpleadosMouseClicked
    // MENÚ - Empleados //
    Dlg_Acceso_In.dispose();
    Dlg_Acceso_Em.dispose();
    Dlg_Acceso_Es.dispose();
    Psf_Em.setText("Contraseña");
    Lbl_Datos_Em.setForeground(new java.awt.Color(0, 0, 0));
    Lbl_Datos_Em.setText("Datos Pendientes");
    Btn_NO_Em.setEnabled(true);
    Btn_Abrir_Em.setEnabled(false);
    Dlg_Acceso_Em.setVisible(true);
    Dlg_Acceso_Em.setLocationRelativeTo(null);
    }//GEN-LAST:event_JMB_EmpleadosMouseClicked

    private void JMB_EstadísticasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JMB_EstadísticasMouseClicked
    // MENÚ - Estadísticas //
    Dlg_Acceso_In.dispose();
    Dlg_Acceso_Em.dispose();
    Dlg_Acceso_Es.dispose();
    Psf_Es.setText("Contraseña");
    Lbl_Datos_Es.setForeground(new java.awt.Color(0, 0, 0));
    Lbl_Datos_Es.setText("Datos Pendientes");
    Btn_NO_Es.setEnabled(true);
    Btn_Abrir_Es.setEnabled(false);
    Dlg_Acceso_Es.setVisible(true);
    Dlg_Acceso_Es.setLocationRelativeTo(null);
    }//GEN-LAST:event_JMB_EstadísticasMouseClicked

    private void Btn_OK_InActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_OK_InActionPerformed
    accesarIn();
    }//GEN-LAST:event_Btn_OK_InActionPerformed

    private void Btn_NO_InActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_NO_InActionPerformed
    Dlg_Acceso_In.dispose();
    }//GEN-LAST:event_Btn_NO_InActionPerformed

    private void Btn_Abrir_InActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Abrir_InActionPerformed
    // Abrir In // 
    Dlg_Acceso_In.dispose();
    JP_Inventario Panel_Inventario = new JP_Inventario();
    Panel_Inventario.setSize(700,410);
    Panel_Inventario.setLocation(8, 8);
    Panel_0.removeAll();
    Panel_0.add(Panel_Inventario, BorderLayout.CENTER);
    Panel_0.revalidate();
    Panel_0.repaint();
    Limpiar.play();
    }//GEN-LAST:event_Btn_Abrir_InActionPerformed

    private void Btn_OK_EmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_OK_EmActionPerformed
    accesarEm();
    }//GEN-LAST:event_Btn_OK_EmActionPerformed

    private void Btn_NO_EmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_NO_EmActionPerformed
    Dlg_Acceso_Em.dispose();
    }//GEN-LAST:event_Btn_NO_EmActionPerformed

    private void Btn_Abrir_EmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Abrir_EmActionPerformed
    Dlg_Acceso_Em.dispose();
    JP_Empleados Panel_Empleados = new JP_Empleados();
    Panel_Empleados.setSize(700,410);
    Panel_Empleados.setLocation(8, 8);
    Panel_0.removeAll();
    Panel_0.add(Panel_Empleados, BorderLayout.CENTER);
    Panel_0.revalidate();
    Panel_0.repaint();
    Limpiar.play();
    }//GEN-LAST:event_Btn_Abrir_EmActionPerformed

    private void Btn_OK_EsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_OK_EsActionPerformed
    accesarEs();
    }//GEN-LAST:event_Btn_OK_EsActionPerformed

    private void Btn_NO_EsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_NO_EsActionPerformed
    Dlg_Acceso_Es.dispose();
    }//GEN-LAST:event_Btn_NO_EsActionPerformed

    private void Btn_Abrir_EsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Abrir_EsActionPerformed
    Dlg_Acceso_Es.dispose();
    JP_Estadísticas Panel_Estadísticas = new JP_Estadísticas();
    Panel_Estadísticas.setSize(700,410);
    Panel_Estadísticas.setLocation(8, 8);
    Panel_0.removeAll();
    Panel_0.add(Panel_Estadísticas, BorderLayout.CENTER);
    Panel_0.revalidate();
    Panel_0.repaint();
    Limpiar.play();
    }//GEN-LAST:event_Btn_Abrir_EsActionPerformed
    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JF_Ventana_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JF_Ventana_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JF_Ventana_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JF_Ventana_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JF_Ventana_Principal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Abrir_Em;
    private javax.swing.JButton Btn_Abrir_Es;
    private javax.swing.JButton Btn_Abrir_In;
    private javax.swing.JButton Btn_NO_Em;
    private javax.swing.JButton Btn_NO_Es;
    private javax.swing.JButton Btn_NO_In;
    private javax.swing.JButton Btn_OK_Em;
    private javax.swing.JButton Btn_OK_Es;
    private javax.swing.JButton Btn_OK_In;
    private javax.swing.JDialog Dlg_Acceso_Em;
    private javax.swing.JDialog Dlg_Acceso_Es;
    private javax.swing.JDialog Dlg_Acceso_In;
    private javax.swing.JMenu Fecha;
    private javax.swing.JMenu Hora;
    private javax.swing.JMenu JMB_Empleados;
    private javax.swing.JMenu JMB_Estadísticas;
    private javax.swing.JMenu JMB_Inventario;
    private javax.swing.JMenuBar JMB_Menú;
    private javax.swing.JMenu JMB_Reloj;
    private javax.swing.JMenu JMB_Salir;
    private javax.swing.JMenu JMB_Vender;
    private javax.swing.JLabel Lbl_Datos_Em;
    private javax.swing.JLabel Lbl_Datos_Es;
    private javax.swing.JLabel Lbl_Datos_In;
    private javax.swing.JLabel Lbl_Em;
    private javax.swing.JLabel Lbl_Es;
    private javax.swing.JLabel Lbl_Icono_Em;
    private javax.swing.JLabel Lbl_Icono_Es;
    private javax.swing.JLabel Lbl_Icono_In;
    private javax.swing.JLabel Lbl_In;
    public static javax.swing.JPanel Panel_0;
    private javax.swing.JPanel Pnl_Margen_Em;
    private javax.swing.JPanel Pnl_Margen_Es;
    private javax.swing.JPanel Pnl_Margen_In;
    private javax.swing.JPasswordField Psf_Em;
    private javax.swing.JPasswordField Psf_Es;
    private javax.swing.JPasswordField Psf_In;
    // End of variables declaration//GEN-END:variables
}