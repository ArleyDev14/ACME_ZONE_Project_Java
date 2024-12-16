package Interfaz;

import DataBase.getProcesos;
import Procesos.Procesos;
import Usuarios.UsuarioControl;
import Usuarios.UsuarioDAO;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.Timer;

public class Guardia extends javax.swing.JFrame {
    private Timer actualizacionDatosEntrada;
    private Timer actualizacionDatosSalida;
    private Timer actualizacionDatosVehiculos;
    private Timer actualizacionDatosAnotaciones;
    
    private UsuarioControl usuarioControl;
    
    public Guardia(UsuarioControl usuarioControl) {
        this.usuarioControl = usuarioControl;
        initComponents();
        cargarDatosEnTablaEntrada();
        cargarDatosEnTablaSalida();
        cargarDatosEnTablaVehiculos();
        cargarDatosEnTablaAnotaciones();
        iniciarActualizacionAuto();
        this.setLocationRelativeTo(null);
    }
    
    public Guardia() {
        initComponents();
        this.setLocationRelativeTo(null);  }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        menuRegistrarEntrada = new javax.swing.JButton();
        menuRegistrarSalida = new javax.swing.JButton();
        menuAnotaciones = new javax.swing.JButton();
        menuRegistroVehiculo = new javax.swing.JButton();
        cerrarSesionGuardias = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Controlpestanas = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        documentoRegistro = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRegistrarEntrada = new javax.swing.JTable();
        btnRegistrar = new javax.swing.JButton();
        btnCancelarRegistro = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        documentoRegistroSalida = new javax.swing.JTextField();
        btnRegistrarSalida = new javax.swing.JButton();
        btnCancelarRegistroSalida = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblRegistrarSalida = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        registroPlaca = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        registroVehiculoMarca = new javax.swing.JTextField();
        btnCancelarRegistroVehiculo = new javax.swing.JButton();
        btnRegistrarVehiculo = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblRegistroVehiculo = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        documentoAnotaciones = new javax.swing.JTextField();
        btnCancelarAnotacion = new javax.swing.JButton();
        btnRegistrarAnotacion = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblAnotaciones = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtAnotaciones = new javax.swing.JTextArea();
        CheckProhibir = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo1.png"))); // NOI18N

        menuRegistrarEntrada.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        menuRegistrarEntrada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/entrada.png"))); // NOI18N
        menuRegistrarEntrada.setText("Registrar Entrada");
        menuRegistrarEntrada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuRegistrarEntradaMouseClicked(evt);
            }
        });
        menuRegistrarEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRegistrarEntradaActionPerformed(evt);
            }
        });

        menuRegistrarSalida.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        menuRegistrarSalida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salida.png"))); // NOI18N
        menuRegistrarSalida.setText("Registar Salida");
        menuRegistrarSalida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuRegistrarSalidaMouseClicked(evt);
            }
        });
        menuRegistrarSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRegistrarSalidaActionPerformed(evt);
            }
        });

        menuAnotaciones.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        menuAnotaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nuevo.png"))); // NOI18N
        menuAnotaciones.setText("Anotaciones");
        menuAnotaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuAnotacionesMouseClicked(evt);
            }
        });
        menuAnotaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAnotacionesActionPerformed(evt);
            }
        });

        menuRegistroVehiculo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        menuRegistroVehiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/carro.png"))); // NOI18N
        menuRegistroVehiculo.setText("Registro Vehiculo");
        menuRegistroVehiculo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuRegistroVehiculoMouseClicked(evt);
            }
        });
        menuRegistroVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRegistroVehiculoActionPerformed(evt);
            }
        });

        cerrarSesionGuardias.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cerrarSesionGuardias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/apagar.png"))); // NOI18N
        cerrarSesionGuardias.setText("Cerrar Sesion");
        cerrarSesionGuardias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cerrarSesionGuardiasMouseClicked(evt);
            }
        });
        cerrarSesionGuardias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarSesionGuardiasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(menuRegistroVehiculo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(menuAnotaciones, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(menuRegistrarSalida, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(menuRegistrarEntrada, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cerrarSesionGuardias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104)
                .addComponent(menuRegistrarEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(menuRegistrarSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(menuRegistroVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(menuAnotaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addComponent(cerrarSesionGuardias, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 660));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/encabezado_2.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 1000, 160));

        jLabel4.setText("Documento");

        tblRegistrarEntrada.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Documento", "Tipo Documento"
            }
        ));
        jScrollPane1.setViewportView(tblRegistrarEntrada);
        if (tblRegistrarEntrada.getColumnModel().getColumnCount() > 0) {
            tblRegistrarEntrada.getColumnModel().getColumn(0).setPreferredWidth(30);
            tblRegistrarEntrada.getColumnModel().getColumn(0).setHeaderValue("Nombre");
            tblRegistrarEntrada.getColumnModel().getColumn(1).setPreferredWidth(30);
            tblRegistrarEntrada.getColumnModel().getColumn(2).setPreferredWidth(30);
            tblRegistrarEntrada.getColumnModel().getColumn(2).setHeaderValue("Tipo Documento");
        }

        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/GuardarTodo.png"))); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnCancelarRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminar.png"))); // NOI18N
        btnCancelarRegistro.setText("Cancelar");
        btnCancelarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarRegistroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 865, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(23, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(documentoRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(88, 88, 88)
                                .addComponent(btnCancelarRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(documentoRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelarRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(94, Short.MAX_VALUE))
        );

        Controlpestanas.addTab("tab1", jPanel2);

        jLabel9.setText("Documento");

        documentoRegistroSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                documentoRegistroSalidaActionPerformed(evt);
            }
        });

        btnRegistrarSalida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/GuardarTodo.png"))); // NOI18N
        btnRegistrarSalida.setText("Registrar");
        btnRegistrarSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarSalidaActionPerformed(evt);
            }
        });

        btnCancelarRegistroSalida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminar.png"))); // NOI18N
        btnCancelarRegistroSalida.setText("Cancelar");
        btnCancelarRegistroSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarRegistroSalidaActionPerformed(evt);
            }
        });

        tblRegistrarSalida.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Documento", "Tipo Documento"
            }
        ));
        jScrollPane2.setViewportView(tblRegistrarSalida);
        if (tblRegistrarSalida.getColumnModel().getColumnCount() > 0) {
            tblRegistrarSalida.getColumnModel().getColumn(0).setPreferredWidth(10);
            tblRegistrarSalida.getColumnModel().getColumn(0).setHeaderValue("Nombre");
            tblRegistrarSalida.getColumnModel().getColumn(1).setPreferredWidth(10);
            tblRegistrarSalida.getColumnModel().getColumn(2).setPreferredWidth(10);
            tblRegistrarSalida.getColumnModel().getColumn(2).setHeaderValue("Tipo Documento");
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 865, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(btnRegistrarSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(88, 88, 88)
                                .addComponent(btnCancelarRegistroSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(documentoRegistroSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(documentoRegistroSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrarSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelarRegistroSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(95, Short.MAX_VALUE))
        );

        Controlpestanas.addTab("tab2", jPanel3);

        jLabel6.setText("Numero de placa");

        jLabel7.setText("Documento");

        registroVehiculoMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registroVehiculoMarcaActionPerformed(evt);
            }
        });

        btnCancelarRegistroVehiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminar.png"))); // NOI18N
        btnCancelarRegistroVehiculo.setText("Cancelar");
        btnCancelarRegistroVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarRegistroVehiculoActionPerformed(evt);
            }
        });

        btnRegistrarVehiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/GuardarTodo.png"))); // NOI18N
        btnRegistrarVehiculo.setText("Registrar");
        btnRegistrarVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarVehiculoActionPerformed(evt);
            }
        });

        tblRegistroVehiculo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numero de placa", "Documento"
            }
        ));
        jScrollPane3.setViewportView(tblRegistroVehiculo);
        if (tblRegistroVehiculo.getColumnModel().getColumnCount() > 0) {
            tblRegistroVehiculo.getColumnModel().getColumn(0).setPreferredWidth(30);
            tblRegistroVehiculo.getColumnModel().getColumn(1).setPreferredWidth(30);
        }

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 865, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btnRegistrarVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(btnCancelarRegistroVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(registroPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(71, 71, 71)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(registroVehiculoMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registroPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registroVehiculoMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrarVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelarRegistroVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );

        Controlpestanas.addTab("tab3", jPanel4);

        jLabel11.setText("Documento");

        btnCancelarAnotacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminar.png"))); // NOI18N
        btnCancelarAnotacion.setText("Cancelar");
        btnCancelarAnotacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarAnotacionActionPerformed(evt);
            }
        });

        btnRegistrarAnotacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/GuardarTodo.png"))); // NOI18N
        btnRegistrarAnotacion.setText("Registrar");
        btnRegistrarAnotacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarAnotacionActionPerformed(evt);
            }
        });

        tblAnotaciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Documento", "Tipo Documento", "Anotaciones"
            }
        ));
        jScrollPane4.setViewportView(tblAnotaciones);
        if (tblAnotaciones.getColumnModel().getColumnCount() > 0) {
            tblAnotaciones.getColumnModel().getColumn(0).setPreferredWidth(10);
            tblAnotaciones.getColumnModel().getColumn(1).setPreferredWidth(10);
            tblAnotaciones.getColumnModel().getColumn(2).setPreferredWidth(10);
            tblAnotaciones.getColumnModel().getColumn(3).setPreferredWidth(40);
        }

        jLabel14.setText("Anotación");

        txtAnotaciones.setColumns(20);
        txtAnotaciones.setRows(5);
        jScrollPane5.setViewportView(txtAnotaciones);

        CheckProhibir.setText("Prohibir Ingreso");
        CheckProhibir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckProhibirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 865, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                .addComponent(documentoAnotaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(99, 99, 99)
                                .addComponent(CheckProhibir))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(btnRegistrarAnotacion, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(55, 55, 55)
                        .addComponent(btnCancelarAnotacion, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(documentoAnotaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CheckProhibir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel14)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCancelarAnotacion, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRegistrarAnotacion, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        Controlpestanas.addTab("tab4", jPanel5);

        getContentPane().add(Controlpestanas, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 910, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuRegistrarSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRegistrarSalidaActionPerformed
        
    }//GEN-LAST:event_menuRegistrarSalidaActionPerformed

    private void menuRegistrarEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRegistrarEntradaActionPerformed
       
    }//GEN-LAST:event_menuRegistrarEntradaActionPerformed

    private void btnCancelarRegistroVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarRegistroVehiculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarRegistroVehiculoActionPerformed

    private void btnRegistrarVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarVehiculoActionPerformed
        registrarVehiculo();
    }//GEN-LAST:event_btnRegistrarVehiculoActionPerformed

    private void menuRegistrarEntradaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuRegistrarEntradaMouseClicked
       Controlpestanas.setSelectedIndex(0);
    }//GEN-LAST:event_menuRegistrarEntradaMouseClicked

    private void menuRegistrarSalidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuRegistrarSalidaMouseClicked
       Controlpestanas.setSelectedIndex(1);
    }//GEN-LAST:event_menuRegistrarSalidaMouseClicked

    private void menuRegistroVehiculoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuRegistroVehiculoMouseClicked
       Controlpestanas.setSelectedIndex(2);
        // TODO add your handling code here:
    }//GEN-LAST:event_menuRegistroVehiculoMouseClicked

    private void menuAnotacionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuAnotacionesMouseClicked
       Controlpestanas.setSelectedIndex(3);
        // TODO add your handling code here:
    }//GEN-LAST:event_menuAnotacionesMouseClicked

    private void registroVehiculoMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registroVehiculoMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registroVehiculoMarcaActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        try {
            registrarEntrada();
        } catch (SQLException ex) {
            Logger.getLogger(Guardia.class.getName()).log(Level.SEVERE, null, ex);
        }
        documentoRegistro.setText("");
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnCancelarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarRegistroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarRegistroActionPerformed

    private void menuRegistroVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRegistroVehiculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuRegistroVehiculoActionPerformed

    private void menuAnotacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAnotacionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuAnotacionesActionPerformed

    private void btnRegistrarSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarSalidaActionPerformed
        registrarSalida();
    }//GEN-LAST:event_btnRegistrarSalidaActionPerformed

    private void btnCancelarRegistroSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarRegistroSalidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarRegistroSalidaActionPerformed

    private void btnRegistrarAnotacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarAnotacionActionPerformed
        registrarAnotacion();
        documentoAnotaciones.setText("");
        CheckProhibir.setSelected(false);
    }//GEN-LAST:event_btnRegistrarAnotacionActionPerformed

    private void btnCancelarAnotacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarAnotacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarAnotacionActionPerformed

    private void CheckProhibirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckProhibirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CheckProhibirActionPerformed

    private void documentoRegistroSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_documentoRegistroSalidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_documentoRegistroSalidaActionPerformed

    private void cerrarSesionGuardiasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarSesionGuardiasMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cerrarSesionGuardiasMouseClicked

    private void cerrarSesionGuardiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarSesionGuardiasActionPerformed
        this.dispose();
        new Login().setVisible(true);
        
    }//GEN-LAST:event_cerrarSesionGuardiasActionPerformed

    private void registrarEntrada() throws SQLException{
        String num_doc = documentoRegistro.getText();
        long documento = Long.parseLong(num_doc);
        
        boolean existe = usuarioControl.verificar_usuario(documento);
        boolean estado = usuarioControl.verificarestado(documento);
        
        if(existe && estado){
            Procesos.agg_proceso(1,documento);
        }else{
            JOptionPane.showMessageDialog(null,"Error al entrar");
        }
        
    }
    
    private void registrarSalida(){
        String num_doc = documentoRegistroSalida.getText();
        long documento = Long.parseLong(num_doc);
        
        boolean existe = usuarioControl.verificar_usuario(documento);
        if(existe){
            Procesos.agg_proceso(0,documento);
            JOptionPane.showMessageDialog(null,"Salida exitosa");
        }else{
            JOptionPane.showMessageDialog(null,"Error al salir");
        }
        
    }
    
    private void registrarVehiculo(){
        String placa = registroPlaca.getText();
        String num_doc = registroVehiculoMarca.getText();
        long documento = Long.parseLong(num_doc);
        
        boolean existe = usuarioControl.verificar_usuario(documento);
        if(existe){
            Procesos.agg_proceso(1,documento);
            Procesos.agg_vehiculo(placa,documento);
            JOptionPane.showMessageDialog(null,"Registro de vehiculo exitoso");
        }else{
            JOptionPane.showMessageDialog(null,"Registro de vehiculo denegado");
        }
        
    }
    
    private void registrarAnotacion(){
        String num_doc = documentoAnotaciones.getText();
        long documento = Long.parseLong(num_doc);
        String descripcion = txtAnotaciones.getText();
        boolean prohibir = CheckProhibir.isSelected();
        int prohibicion;
        
        boolean existe = usuarioControl.verificar_usuario(documento);
        
        if(prohibir == true){
            prohibicion = 1;
            System.out.println(prohibicion);       
            if(existe){
                Procesos.agg_proceso(3,documento);
                Procesos.agg_anotacion(documento,1,descripcion);
                JOptionPane.showMessageDialog(null,"Anotacion creada");
            }else{
                JOptionPane.showMessageDialog(null,"Error al registrar anotacion");
            }
        }else{
            prohibicion = 0;
            System.out.println(prohibicion);
                    
            if(existe){
                Procesos.agg_proceso(3,documento);
                Procesos.agg_anotacion(documento,0,descripcion);
                JOptionPane.showMessageDialog(null,"Anotacion creada");
            }else{
                JOptionPane.showMessageDialog(null,"Error al registrar anotacion");
            }
        }
        
        System.out.println(prohibir);
        
    }
    
    
    private void cargarDatosEnTablaVehiculos(){
        getProcesos procesosGuardias = new getProcesos();
        List<Object[]> datosVehiculos = procesosGuardias.getDataVehiculos();
        
        String[] columnNames = {"Placa","Usuario"};
        
        DefaultTableModel modelVehiculos = new DefaultTableModel(columnNames,0);
        
        for(Object[] row: datosVehiculos){
            modelVehiculos.addRow(row);
        }
        
        tblRegistroVehiculo.setModel(modelVehiculos);
    }
    
    private void cargarDatosEnTablaAnotaciones(){
        getProcesos procesosGuardias = new getProcesos();
        List<Object[]> datosAnotaciones = procesosGuardias.getDataAnotaciones();
        
        String[] columnNames = {"Usuario","Prohibir Ingreso", "Descripcion"};
        
        DefaultTableModel modelAnotaciones = new DefaultTableModel(columnNames,0);
        
        for(Object[] row: datosAnotaciones){
            modelAnotaciones.addRow(row);
        }
        
        tblAnotaciones.setModel(modelAnotaciones);
    }
    
    private void cargarDatosEnTablaEntrada(){
        getProcesos procesosGuardias = new getProcesos();
        List<Object[]> datosEntrada = procesosGuardias.getData("Entrada");
        
        String[] columnNames = {"Nombre","Documento","Tipo de proceso"};
        
        DefaultTableModel modelEntrada = new DefaultTableModel(columnNames,0);
        
        for(Object[] row : datosEntrada){
            modelEntrada.addRow(row);
        }
        
        tblRegistrarEntrada.setModel(modelEntrada);
    }
    
    private void cargarDatosEnTablaSalida(){
        getProcesos procesosGuardias = new getProcesos();
        List<Object[]> datosSalida = procesosGuardias.getData("Salida");
        
        String[] columnNames = {"Nombre","Documento","Tipo de proceso"};
        
        DefaultTableModel modelSalida = new DefaultTableModel(columnNames,0);
        
        for(Object[] row : datosSalida){
            modelSalida.addRow(row);
        }
        
        tblRegistrarSalida.setModel(modelSalida);
    }
    
    
    private void iniciarActualizacionAuto(){
        actualizacionDatosEntrada = new Timer(1000, e->cargarDatosEnTablaEntrada());
        actualizacionDatosSalida = new Timer(1000, e->cargarDatosEnTablaSalida());
        actualizacionDatosVehiculos = new Timer(1000, e -> cargarDatosEnTablaVehiculos());
        actualizacionDatosAnotaciones = new Timer(1000, e -> cargarDatosEnTablaAnotaciones());
        actualizacionDatosEntrada.start();
        actualizacionDatosSalida.start();
        actualizacionDatosVehiculos.start();
        actualizacionDatosAnotaciones.start();

    }
    
    private void pararActualizacionAuto(){
        if(actualizacionDatosEntrada != null || actualizacionDatosSalida != null || actualizacionDatosVehiculos != null){
            actualizacionDatosEntrada.stop();
            actualizacionDatosSalida.stop();
            actualizacionDatosVehiculos.stop();                        
            actualizacionDatosAnotaciones.stop();

        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox CheckProhibir;
    private javax.swing.JTabbedPane Controlpestanas;
    private javax.swing.JButton btnCancelarAnotacion;
    private javax.swing.JButton btnCancelarRegistro;
    private javax.swing.JButton btnCancelarRegistroSalida;
    private javax.swing.JButton btnCancelarRegistroVehiculo;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnRegistrarAnotacion;
    private javax.swing.JButton btnRegistrarSalida;
    private javax.swing.JButton btnRegistrarVehiculo;
    private javax.swing.JButton cerrarSesionGuardias;
    private javax.swing.JTextField documentoAnotaciones;
    private javax.swing.JTextField documentoRegistro;
    private javax.swing.JTextField documentoRegistroSalida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JButton menuAnotaciones;
    private javax.swing.JButton menuRegistrarEntrada;
    private javax.swing.JButton menuRegistrarSalida;
    private javax.swing.JButton menuRegistroVehiculo;
    private javax.swing.JTextField registroPlaca;
    private javax.swing.JTextField registroVehiculoMarca;
    private javax.swing.JTable tblAnotaciones;
    private javax.swing.JTable tblRegistrarEntrada;
    private javax.swing.JTable tblRegistrarSalida;
    private javax.swing.JTable tblRegistroVehiculo;
    private javax.swing.JTextArea txtAnotaciones;
    // End of variables declaration//GEN-END:variables
}
