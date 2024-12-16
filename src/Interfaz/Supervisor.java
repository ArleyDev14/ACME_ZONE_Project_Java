package Interfaz;

import DataBase.getProcesos;
import Procesos.Procesos;
import Usuarios.UsuarioControl;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.Timer;

public class Supervisor extends javax.swing.JFrame {
    private Timer actualizacionDatosFuncionarios;
    private Timer actualizacionDatosDesFuncionarios;
    private Timer actualizacionDatosGuardias;
    private Timer actualizacionDatosDesGuardias;
    private UsuarioControl usuarioControl;
    
    public Supervisor(UsuarioControl usuarioControl) {
        this.usuarioControl = usuarioControl;
        initComponents();
        cargarDatosEnTablaFuncionarios();
        cargarDatosEnTablaFuncionariosDes();
        cargarDatosEnTablaGuardias();
        cargarDatosEnTablaGuardiasDes();
        iniciarActualizacionAuto();
        
        this.setLocationRelativeTo(null);
    }

    public Supervisor() {
        initComponents();
        this.setLocationRelativeTo(null); }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        menuRegistrarFuncionario = new javax.swing.JButton();
        menuDesabilitarFuncionario = new javax.swing.JButton();
        menuRegistrarGuardia = new javax.swing.JButton();
        menuDesabilitarGuardia = new javax.swing.JButton();
        cerrarSesionSupervisor = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Controlpestanas = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        documentoRegistroSalida = new javax.swing.JTextField();
        btnRegistrarFuncionario = new javax.swing.JButton();
        btnCancelarRegistroFuncionario = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblRegistrarSalida = new javax.swing.JTable();
        documentoRegistroFuncionario = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        empresaFuncionario = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        documentoRegistroDesabilitar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRegistrarEntrada = new javax.swing.JTable();
        btnDesabilitarFuncionario = new javax.swing.JButton();
        btnCancelarDesabilitarFuncionario = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        RegistrarGuardia = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        documentoRegistroGuardia = new javax.swing.JTextField();
        btnRegistrarGuardia = new javax.swing.JButton();
        btnCancelarRegistroGuardia = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblRegistrarSalida1 = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        desabilitarGuardia = new javax.swing.JTextField();
        btnDesabilitarGuardia = new javax.swing.JButton();
        btnCancelarDesabilitarGuardia = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblRegistrarEntrada1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo1.png"))); // NOI18N

        menuRegistrarFuncionario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        menuRegistrarFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/archivo-nuevo.png"))); // NOI18N
        menuRegistrarFuncionario.setText("Registrar Funcionario");
        menuRegistrarFuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuRegistrarFuncionarioMouseClicked(evt);
            }
        });
        menuRegistrarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRegistrarFuncionarioActionPerformed(evt);
            }
        });

        menuDesabilitarFuncionario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        menuDesabilitarFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/rechazar2.png"))); // NOI18N
        menuDesabilitarFuncionario.setText("Desabilitar Funcionario");
        menuDesabilitarFuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuDesabilitarFuncionarioMouseClicked(evt);
            }
        });
        menuDesabilitarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuDesabilitarFuncionarioActionPerformed(evt);
            }
        });

        menuRegistrarGuardia.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        menuRegistrarGuardia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/guardia-de-seguridad.png"))); // NOI18N
        menuRegistrarGuardia.setText("Registrar Guardia");
        menuRegistrarGuardia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuRegistrarGuardiaMouseClicked(evt);
            }
        });
        menuRegistrarGuardia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRegistrarGuardiaActionPerformed(evt);
            }
        });

        menuDesabilitarGuardia.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        menuDesabilitarGuardia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerca.png"))); // NOI18N
        menuDesabilitarGuardia.setText("Desabilitar Guardia");
        menuDesabilitarGuardia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuDesabilitarGuardiaMouseClicked(evt);
            }
        });
        menuDesabilitarGuardia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuDesabilitarGuardiaActionPerformed(evt);
            }
        });

        cerrarSesionSupervisor.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cerrarSesionSupervisor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/apagar.png"))); // NOI18N
        cerrarSesionSupervisor.setText("Cerrar Sesion");
        cerrarSesionSupervisor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cerrarSesionSupervisorMouseClicked(evt);
            }
        });
        cerrarSesionSupervisor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarSesionSupervisorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(menuRegistrarFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(menuDesabilitarFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(menuRegistrarGuardia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(menuDesabilitarGuardia, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 1, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cerrarSesionSupervisor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(menuRegistrarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(menuDesabilitarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(menuRegistrarGuardia, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(menuDesabilitarGuardia, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 143, Short.MAX_VALUE)
                .addComponent(cerrarSesionSupervisor, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 660));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/encabezado supervisor.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 1000, 160));

        jLabel9.setText("Nombre completo");

        documentoRegistroSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                documentoRegistroSalidaActionPerformed(evt);
            }
        });

        btnRegistrarFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/GuardarTodo.png"))); // NOI18N
        btnRegistrarFuncionario.setText("Registrar");
        btnRegistrarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarFuncionarioActionPerformed(evt);
            }
        });

        btnCancelarRegistroFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminar.png"))); // NOI18N
        btnCancelarRegistroFuncionario.setText("Cancelar");
        btnCancelarRegistroFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarRegistroFuncionarioActionPerformed(evt);
            }
        });

        tblRegistrarSalida.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Documento", "Empresa"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblRegistrarSalida);
        if (tblRegistrarSalida.getColumnModel().getColumnCount() > 0) {
            tblRegistrarSalida.getColumnModel().getColumn(0).setResizable(false);
            tblRegistrarSalida.getColumnModel().getColumn(1).setResizable(false);
            tblRegistrarSalida.getColumnModel().getColumn(2).setResizable(false);
        }

        documentoRegistroFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                documentoRegistroFuncionarioActionPerformed(evt);
            }
        });

        jLabel11.setText("Documento");

        jLabel12.setText("Empresa");

        empresaFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empresaFuncionarioActionPerformed(evt);
            }
        });

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
                                .addComponent(btnRegistrarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(88, 88, 88)
                                .addComponent(btnCancelarRegistroFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(documentoRegistroSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(documentoRegistroFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(empresaFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(documentoRegistroSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(documentoRegistroFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(empresaFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(52, 52, 52)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelarRegistroFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(94, Short.MAX_VALUE))
        );

        Controlpestanas.addTab("tab2", jPanel3);

        documentoRegistroDesabilitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                documentoRegistroDesabilitarActionPerformed(evt);
            }
        });

        tblRegistrarEntrada.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Documento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblRegistrarEntrada);
        if (tblRegistrarEntrada.getColumnModel().getColumnCount() > 0) {
            tblRegistrarEntrada.getColumnModel().getColumn(0).setResizable(false);
            tblRegistrarEntrada.getColumnModel().getColumn(1).setResizable(false);
        }

        btnDesabilitarFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/GuardarTodo.png"))); // NOI18N
        btnDesabilitarFuncionario.setText("Desactivar");
        btnDesabilitarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesabilitarFuncionarioActionPerformed(evt);
            }
        });

        btnCancelarDesabilitarFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminar.png"))); // NOI18N
        btnCancelarDesabilitarFuncionario.setText("Cancelar");
        btnCancelarDesabilitarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarDesabilitarFuncionarioActionPerformed(evt);
            }
        });

        jLabel5.setText("Documento");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(documentoRegistroDesabilitar, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnDesabilitarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(89, 89, 89)
                                .addComponent(btnCancelarDesabilitarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 865, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 25, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(documentoRegistroDesabilitar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDesabilitarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelarDesabilitarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(83, Short.MAX_VALUE))
        );

        Controlpestanas.addTab("tab1", jPanel2);

        jLabel13.setText("Nombre completo");

        RegistrarGuardia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarGuardiaActionPerformed(evt);
            }
        });

        jLabel15.setText("Documento");

        documentoRegistroGuardia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                documentoRegistroGuardiaActionPerformed(evt);
            }
        });

        btnRegistrarGuardia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/GuardarTodo.png"))); // NOI18N
        btnRegistrarGuardia.setText("Registrar");
        btnRegistrarGuardia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarGuardiaActionPerformed(evt);
            }
        });

        btnCancelarRegistroGuardia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminar.png"))); // NOI18N
        btnCancelarRegistroGuardia.setText("Cancelar");
        btnCancelarRegistroGuardia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarRegistroGuardiaActionPerformed(evt);
            }
        });

        tblRegistrarSalida1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Documento", "Empresa"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(tblRegistrarSalida1);
        if (tblRegistrarSalida1.getColumnModel().getColumnCount() > 0) {
            tblRegistrarSalida1.getColumnModel().getColumn(0).setResizable(false);
            tblRegistrarSalida1.getColumnModel().getColumn(1).setResizable(false);
            tblRegistrarSalida1.getColumnModel().getColumn(2).setResizable(false);
        }

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 865, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(btnRegistrarGuardia, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(88, 88, 88)
                                .addComponent(btnCancelarRegistroGuardia, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(RegistrarGuardia, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(documentoRegistroGuardia, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RegistrarGuardia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(documentoRegistroGuardia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(52, 52, 52)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrarGuardia, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelarRegistroGuardia, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(95, Short.MAX_VALUE))
        );

        Controlpestanas.addTab("tab3", jPanel4);

        jLabel6.setText("Documento");

        desabilitarGuardia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desabilitarGuardiaActionPerformed(evt);
            }
        });

        btnDesabilitarGuardia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/GuardarTodo.png"))); // NOI18N
        btnDesabilitarGuardia.setText("Registrar");
        btnDesabilitarGuardia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesabilitarGuardiaActionPerformed(evt);
            }
        });

        btnCancelarDesabilitarGuardia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminar.png"))); // NOI18N
        btnCancelarDesabilitarGuardia.setText("Cancelar");
        btnCancelarDesabilitarGuardia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarDesabilitarGuardiaActionPerformed(evt);
            }
        });

        tblRegistrarEntrada1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Documento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(tblRegistrarEntrada1);
        if (tblRegistrarEntrada1.getColumnModel().getColumnCount() > 0) {
            tblRegistrarEntrada1.getColumnModel().getColumn(0).setResizable(false);
            tblRegistrarEntrada1.getColumnModel().getColumn(1).setResizable(false);
        }

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 865, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(23, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(desabilitarGuardia, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnDesabilitarGuardia, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(89, 89, 89)
                                .addComponent(btnCancelarDesabilitarGuardia, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 549, Short.MAX_VALUE))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(desabilitarGuardia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDesabilitarGuardia, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelarDesabilitarGuardia, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(89, Short.MAX_VALUE))
        );

        Controlpestanas.addTab("tab4", jPanel5);

        getContentPane().add(Controlpestanas, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 910, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuRegistrarFuncionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuRegistrarFuncionarioMouseClicked
        Controlpestanas.setSelectedIndex(0);
    }//GEN-LAST:event_menuRegistrarFuncionarioMouseClicked

    private void menuRegistrarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRegistrarFuncionarioActionPerformed

    }//GEN-LAST:event_menuRegistrarFuncionarioActionPerformed

    private void menuDesabilitarFuncionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuDesabilitarFuncionarioMouseClicked
        Controlpestanas.setSelectedIndex(1);
    }//GEN-LAST:event_menuDesabilitarFuncionarioMouseClicked

    private void menuDesabilitarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuDesabilitarFuncionarioActionPerformed

    }//GEN-LAST:event_menuDesabilitarFuncionarioActionPerformed

    private void menuRegistrarGuardiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuRegistrarGuardiaMouseClicked
        Controlpestanas.setSelectedIndex(2);
        // TODO add your handling code here:
    }//GEN-LAST:event_menuRegistrarGuardiaMouseClicked

    private void menuRegistrarGuardiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRegistrarGuardiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuRegistrarGuardiaActionPerformed

    private void menuDesabilitarGuardiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuDesabilitarGuardiaMouseClicked
        Controlpestanas.setSelectedIndex(3);
        // TODO add your handling code here:
    }//GEN-LAST:event_menuDesabilitarGuardiaMouseClicked

    private void menuDesabilitarGuardiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuDesabilitarGuardiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuDesabilitarGuardiaActionPerformed

    private void btnRegistrarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarFuncionarioActionPerformed
        registrarFuncionario();
        documentoRegistroSalida.setText("");
        documentoRegistroFuncionario.setText("");
        empresaFuncionario.setText("");
    }//GEN-LAST:event_btnRegistrarFuncionarioActionPerformed

    private void btnCancelarRegistroFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarRegistroFuncionarioActionPerformed
        documentoRegistroSalida.setText("");
        documentoRegistroFuncionario.setText("");
        empresaFuncionario.setText("");
    }//GEN-LAST:event_btnCancelarRegistroFuncionarioActionPerformed

    private void btnDesabilitarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesabilitarFuncionarioActionPerformed
        desactivarFuncionario();
        documentoRegistroDesabilitar.setText("");
    }//GEN-LAST:event_btnDesabilitarFuncionarioActionPerformed

    private void btnCancelarDesabilitarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarDesabilitarFuncionarioActionPerformed
       documentoRegistroDesabilitar.setText("");
       
    }//GEN-LAST:event_btnCancelarDesabilitarFuncionarioActionPerformed

    private void btnRegistrarGuardiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarGuardiaActionPerformed
        registrarGuardia();
        
        RegistrarGuardia.setText("");
        documentoRegistroGuardia.setText("");
    }//GEN-LAST:event_btnRegistrarGuardiaActionPerformed

    private void btnCancelarRegistroGuardiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarRegistroGuardiaActionPerformed
        RegistrarGuardia.setText("");
        documentoRegistroGuardia.setText("");
    }//GEN-LAST:event_btnCancelarRegistroGuardiaActionPerformed

    private void btnDesabilitarGuardiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesabilitarGuardiaActionPerformed
        desactivarGuardia();
        desabilitarGuardia.setText("");
    }//GEN-LAST:event_btnDesabilitarGuardiaActionPerformed

    private void btnCancelarDesabilitarGuardiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarDesabilitarGuardiaActionPerformed

        desabilitarGuardia.setText("");
    }//GEN-LAST:event_btnCancelarDesabilitarGuardiaActionPerformed

    private void documentoRegistroSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_documentoRegistroSalidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_documentoRegistroSalidaActionPerformed

    private void empresaFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empresaFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_empresaFuncionarioActionPerformed

    private void documentoRegistroFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_documentoRegistroFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_documentoRegistroFuncionarioActionPerformed

    private void RegistrarGuardiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarGuardiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RegistrarGuardiaActionPerformed

    private void documentoRegistroGuardiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_documentoRegistroGuardiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_documentoRegistroGuardiaActionPerformed

    private void documentoRegistroDesabilitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_documentoRegistroDesabilitarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_documentoRegistroDesabilitarActionPerformed

    private void desabilitarGuardiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desabilitarGuardiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_desabilitarGuardiaActionPerformed

    private void cerrarSesionSupervisorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarSesionSupervisorMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cerrarSesionSupervisorMouseClicked

    private void cerrarSesionSupervisorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarSesionSupervisorActionPerformed
        this.dispose();
        new Login().setVisible(true);
        
    }//GEN-LAST:event_cerrarSesionSupervisorActionPerformed

    private void registrarFuncionario(){
        String nombre = documentoRegistroSalida.getText();
        String empresa = empresaFuncionario.getText();
        String num_doc = documentoRegistroFuncionario.getText();
        long documento = Long.parseLong(num_doc);
        int idEmpresa = Procesos.obtenerIdEmpresa(empresa);
        String contrasena = num_doc + empresa;

        Procesos.agg_usuario(documento,contrasena,3,1,idEmpresa,nombre); 
    }
    
    private void registrarGuardia(){
        String nombre = RegistrarGuardia.getText();
        String num_doc = documentoRegistroGuardia.getText();
        long documento = Long.parseLong(num_doc);
        String contrasena = num_doc + "acme";

        Procesos.agg_usuario(documento,contrasena,2,1,1,nombre); 
    }
    
    private void desactivarFuncionario(){
        String num_doc = documentoRegistroDesabilitar.getText();
        long documento = Long.parseLong(num_doc);
        
        Procesos.desUsuario(documento);
    }
    
    private void desactivarGuardia(){
        String num_doc = desabilitarGuardia.getText();
        long documento = Long.parseLong(num_doc);
        
        Procesos.desUsuario(documento);
    }
    
    private void cargarDatosEnTablaFuncionarios(){
        getProcesos procesosGuardias = new getProcesos();
        List<Object[]> datosFuncionarios = procesosGuardias.getDataFuncionarios();
        
        String[] columnNames = {"Nombre","Documento","Empresa"};
        
        DefaultTableModel modelRegistrosFn = new DefaultTableModel(columnNames,0);
        
        for(Object[] row: datosFuncionarios){
            modelRegistrosFn.addRow(row);
        }
        
        tblRegistrarSalida.setModel(modelRegistrosFn);
    }
    
    private void cargarDatosEnTablaFuncionariosDes(){
        getProcesos procesosGuardias = new getProcesos();
        List<Object[]> datosFuncionariosDes = procesosGuardias.getDataDesFun();
        
        String[] columnNames = {"Nombre","Documento","Empresa","Estado"};
        
        DefaultTableModel modelFunDes = new DefaultTableModel(columnNames,0);
        
        for(Object[] row: datosFuncionariosDes){
            modelFunDes.addRow(row);
        }
        
        tblRegistrarEntrada.setModel(modelFunDes);
    }
    
    private void cargarDatosEnTablaGuardias(){
        getProcesos procesosGuardias = new getProcesos();
        List<Object[]> datosGuardias = procesosGuardias.getDataGuardias();
        
        String[] columnNames = {"Nombre","Documento","Estado"};
        
        DefaultTableModel modelGuardias = new DefaultTableModel(columnNames,0);
        
        for(Object[] row: datosGuardias){
            modelGuardias.addRow(row);
        }
        
        tblRegistrarSalida1.setModel(modelGuardias);
    }
    
    private void cargarDatosEnTablaGuardiasDes(){
        getProcesos procesosGuardias = new getProcesos();
        List<Object[]> datosGuardiasDes = procesosGuardias.getDataDesGuard();
        
        String[] columnNames = {"Nombre","Documento","Estado"};
        
        DefaultTableModel modelDesGuard = new DefaultTableModel(columnNames,0);
        
        for(Object[] row: datosGuardiasDes){
            modelDesGuard.addRow(row);
        }
        
        tblRegistrarEntrada1.setModel(modelDesGuard);
    }
    
    private void iniciarActualizacionAuto(){
        actualizacionDatosFuncionarios = new Timer(1000, e-> cargarDatosEnTablaFuncionarios());
        actualizacionDatosDesFuncionarios = new Timer(1000, e-> cargarDatosEnTablaFuncionariosDes());
        actualizacionDatosGuardias = new Timer(1000, e-> cargarDatosEnTablaGuardias());
        actualizacionDatosDesGuardias = new Timer(1000, e-> cargarDatosEnTablaGuardiasDes());
        
        actualizacionDatosFuncionarios.start();
        actualizacionDatosDesFuncionarios.start();
        actualizacionDatosGuardias.start();
        actualizacionDatosDesGuardias.start();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane Controlpestanas;
    private javax.swing.JTextField RegistrarGuardia;
    private javax.swing.JButton btnCancelarDesabilitarFuncionario;
    private javax.swing.JButton btnCancelarDesabilitarGuardia;
    private javax.swing.JButton btnCancelarRegistroFuncionario;
    private javax.swing.JButton btnCancelarRegistroGuardia;
    private javax.swing.JButton btnDesabilitarFuncionario;
    private javax.swing.JButton btnDesabilitarGuardia;
    private javax.swing.JButton btnRegistrarFuncionario;
    private javax.swing.JButton btnRegistrarGuardia;
    private javax.swing.JButton cerrarSesionSupervisor;
    private javax.swing.JTextField desabilitarGuardia;
    private javax.swing.JTextField documentoRegistroDesabilitar;
    private javax.swing.JTextField documentoRegistroFuncionario;
    private javax.swing.JTextField documentoRegistroGuardia;
    private javax.swing.JTextField documentoRegistroSalida;
    private javax.swing.JTextField empresaFuncionario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JButton menuDesabilitarFuncionario;
    private javax.swing.JButton menuDesabilitarGuardia;
    private javax.swing.JButton menuRegistrarFuncionario;
    private javax.swing.JButton menuRegistrarGuardia;
    private javax.swing.JTable tblRegistrarEntrada;
    private javax.swing.JTable tblRegistrarEntrada1;
    private javax.swing.JTable tblRegistrarSalida;
    private javax.swing.JTable tblRegistrarSalida1;
    // End of variables declaration//GEN-END:variables
}
