package Interfaz;

import DataBase.getProcesos;
import Procesos.Procesos;
import Usuarios.UsuarioControl;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.Timer;

public class Funcionario extends javax.swing.JFrame {
    private Timer actualizacionDatosEmpleados;
    private Timer actualizacionDatosInvitados;
    private UsuarioControl usuarioControl;
    
    public Funcionario(UsuarioControl usuarioControl) {
        this.usuarioControl = usuarioControl;
        iniciarActualizacionAuto();
        initComponents();
        this.setLocationRelativeTo(null);
    }

     public Funcionario() {
        initComponents();
        this.setLocationRelativeTo(null);   }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        menuRegistrarEmpleados = new javax.swing.JButton();
        menuDesabilitarEmpleados = new javax.swing.JButton();
        menuRegistrarInvitados = new javax.swing.JButton();
        menuDesabilitarInvitados = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Controlpestanas = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        nombreRegistroEmpleados = new javax.swing.JTextField();
        btnRegistrarEmpleado = new javax.swing.JButton();
        btnCancelarRegistroEmpleado = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblRegistrarSalida = new javax.swing.JTable();
        documentoRegistroEmpleado = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        empresaEmpleado = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        documentoDesabilitarEmpleado = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRegistrarEntrada = new javax.swing.JTable();
        btnDesabilitarFuncionario = new javax.swing.JButton();
        btnCancelarDesabilitarFuncionario = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        btnRegistrarInvitado = new javax.swing.JButton();
        btnCancelarRegistroInvitado = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblRegistrarSalida1 = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        nombreRegistrarInvitados = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        documentoRegistroInvitados = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        empresaRegistroInvitado = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        documentoDesabilitarInvitados = new javax.swing.JTextField();
        btnDesabilitarInvitado = new javax.swing.JButton();
        btnCancelarDesabilitarInvitado = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblRegistrarEntrada1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 51, 102));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo1.png"))); // NOI18N

        menuRegistrarEmpleados.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        menuRegistrarEmpleados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nueva-llegada.png"))); // NOI18N
        menuRegistrarEmpleados.setText("Registrar Empleados");
        menuRegistrarEmpleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuRegistrarEmpleadosMouseClicked(evt);
            }
        });
        menuRegistrarEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRegistrarEmpleadosActionPerformed(evt);
            }
        });

        menuDesabilitarEmpleados.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        menuDesabilitarEmpleados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/alerta-de-tiempo.png"))); // NOI18N
        menuDesabilitarEmpleados.setText("Desabilitar Empleados");
        menuDesabilitarEmpleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuDesabilitarEmpleadosMouseClicked(evt);
            }
        });
        menuDesabilitarEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuDesabilitarEmpleadosActionPerformed(evt);
            }
        });

        menuRegistrarInvitados.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        menuRegistrarInvitados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/inscribirse.png"))); // NOI18N
        menuRegistrarInvitados.setText("Registrar Invitados");
        menuRegistrarInvitados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuRegistrarInvitadosMouseClicked(evt);
            }
        });
        menuRegistrarInvitados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRegistrarInvitadosActionPerformed(evt);
            }
        });

        menuDesabilitarInvitados.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        menuDesabilitarInvitados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/anadir-amigo.png"))); // NOI18N
        menuDesabilitarInvitados.setText("Desabilitar Invitados");
        menuDesabilitarInvitados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuDesabilitarInvitadosMouseClicked(evt);
            }
        });
        menuDesabilitarInvitados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuDesabilitarInvitadosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(menuRegistrarEmpleados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(menuDesabilitarEmpleados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(menuRegistrarInvitados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(menuDesabilitarInvitados, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(menuRegistrarEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(menuDesabilitarEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(menuRegistrarInvitados, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(menuDesabilitarInvitados, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(202, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 660));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/encabezado Funcionario.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 1000, 160));

        jLabel9.setText("Nombre completo");

        nombreRegistroEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreRegistroEmpleadosActionPerformed(evt);
            }
        });

        btnRegistrarEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/GuardarTodo.png"))); // NOI18N
        btnRegistrarEmpleado.setText("Registrar");
        btnRegistrarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarEmpleadoActionPerformed(evt);
            }
        });

        btnCancelarRegistroEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminar.png"))); // NOI18N
        btnCancelarRegistroEmpleado.setText("Cancelar");
        btnCancelarRegistroEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarRegistroEmpleadoActionPerformed(evt);
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

        documentoRegistroEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                documentoRegistroEmpleadoActionPerformed(evt);
            }
        });

        jLabel11.setText("Documento");

        jLabel12.setText("Empresa");

        empresaEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empresaEmpleadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 865, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(btnRegistrarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(88, 88, 88)
                                .addComponent(btnCancelarRegistroEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nombreRegistroEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(documentoRegistroEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(empresaEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nombreRegistroEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(documentoRegistroEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(empresaEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(52, 52, 52)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelarRegistroEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(95, Short.MAX_VALUE))
        );

        Controlpestanas.addTab("tab2", jPanel4);

        documentoDesabilitarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                documentoDesabilitarEmpleadoActionPerformed(evt);
            }
        });

        tblRegistrarEntrada.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Documento", "Descripcion"
            }
        ));
        jScrollPane1.setViewportView(tblRegistrarEntrada);

        btnDesabilitarFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/GuardarTodo.png"))); // NOI18N
        btnDesabilitarFuncionario.setText("Registrar");
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

        jLabel6.setText("Documento");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 865, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(23, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(documentoDesabilitarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnDesabilitarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(89, 89, 89)
                                .addComponent(btnCancelarDesabilitarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 549, Short.MAX_VALUE))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(documentoDesabilitarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDesabilitarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelarDesabilitarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(89, Short.MAX_VALUE))
        );

        Controlpestanas.addTab("tab1", jPanel5);

        btnRegistrarInvitado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/GuardarTodo.png"))); // NOI18N
        btnRegistrarInvitado.setText("Registrar");
        btnRegistrarInvitado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarInvitadoActionPerformed(evt);
            }
        });

        btnCancelarRegistroInvitado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminar.png"))); // NOI18N
        btnCancelarRegistroInvitado.setText("Cancelar");
        btnCancelarRegistroInvitado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarRegistroInvitadoActionPerformed(evt);
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

        jLabel16.setText("Nombre completo");

        nombreRegistrarInvitados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreRegistrarInvitadosActionPerformed(evt);
            }
        });

        jLabel17.setText("Documento");

        documentoRegistroInvitados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                documentoRegistroInvitadosActionPerformed(evt);
            }
        });

        jLabel18.setText("Empresa");

        empresaRegistroInvitado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empresaRegistroInvitadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 865, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nombreRegistrarInvitados, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(documentoRegistroInvitados, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(empresaRegistroInvitado, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(btnRegistrarInvitado, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(88, 88, 88)
                                .addComponent(btnCancelarRegistroInvitado, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nombreRegistrarInvitados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(documentoRegistroInvitados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(empresaRegistroInvitado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(57, 57, 57)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrarInvitado, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelarRegistroInvitado, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(95, Short.MAX_VALUE))
        );

        Controlpestanas.addTab("tab3", jPanel6);

        jLabel7.setText("Documento");

        documentoDesabilitarInvitados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                documentoDesabilitarInvitadosActionPerformed(evt);
            }
        });

        btnDesabilitarInvitado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/GuardarTodo.png"))); // NOI18N
        btnDesabilitarInvitado.setText("Registrar");
        btnDesabilitarInvitado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesabilitarInvitadoActionPerformed(evt);
            }
        });

        btnCancelarDesabilitarInvitado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminar.png"))); // NOI18N
        btnCancelarDesabilitarInvitado.setText("Cancelar");
        btnCancelarDesabilitarInvitado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarDesabilitarInvitadoActionPerformed(evt);
            }
        });

        tblRegistrarEntrada1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Documento", "Descripcion"
            }
        ));
        jScrollPane5.setViewportView(tblRegistrarEntrada1);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 865, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(23, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(documentoDesabilitarInvitados, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnDesabilitarInvitado, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(89, 89, 89)
                                .addComponent(btnCancelarDesabilitarInvitado, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 549, Short.MAX_VALUE))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(documentoDesabilitarInvitados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDesabilitarInvitado, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelarDesabilitarInvitado, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(89, Short.MAX_VALUE))
        );

        Controlpestanas.addTab("tab4", jPanel7);

        getContentPane().add(Controlpestanas, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 910, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuRegistrarEmpleadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuRegistrarEmpleadosMouseClicked
        Controlpestanas.setSelectedIndex(0);
    }//GEN-LAST:event_menuRegistrarEmpleadosMouseClicked

    private void menuRegistrarEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRegistrarEmpleadosActionPerformed

    }//GEN-LAST:event_menuRegistrarEmpleadosActionPerformed

    private void menuDesabilitarEmpleadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuDesabilitarEmpleadosMouseClicked
        Controlpestanas.setSelectedIndex(1);
    }//GEN-LAST:event_menuDesabilitarEmpleadosMouseClicked

    private void menuDesabilitarEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuDesabilitarEmpleadosActionPerformed

    }//GEN-LAST:event_menuDesabilitarEmpleadosActionPerformed

    private void menuRegistrarInvitadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuRegistrarInvitadosMouseClicked
        Controlpestanas.setSelectedIndex(2);
        // TODO add your handling code here:
    }//GEN-LAST:event_menuRegistrarInvitadosMouseClicked

    private void menuRegistrarInvitadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRegistrarInvitadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuRegistrarInvitadosActionPerformed

    private void menuDesabilitarInvitadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuDesabilitarInvitadosMouseClicked
        Controlpestanas.setSelectedIndex(3);
        // TODO add your handling code here:
    }//GEN-LAST:event_menuDesabilitarInvitadosMouseClicked

    private void menuDesabilitarInvitadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuDesabilitarInvitadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuDesabilitarInvitadosActionPerformed

    private void btnRegistrarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarEmpleadoActionPerformed
        registrarEmpleado();
        nombreRegistroEmpleados.setText("");
        documentoRegistroEmpleado.setText("");
        empresaEmpleado.setText("");
    }//GEN-LAST:event_btnRegistrarEmpleadoActionPerformed

    private void btnCancelarRegistroEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarRegistroEmpleadoActionPerformed
        nombreRegistroEmpleados.setText("");
        documentoRegistroEmpleado.setText("");
        empresaEmpleado.setText("");
    }//GEN-LAST:event_btnCancelarRegistroEmpleadoActionPerformed

    private void btnDesabilitarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesabilitarFuncionarioActionPerformed
        desactivarEmpleado();
        documentoDesabilitarEmpleado.setText("");
    }//GEN-LAST:event_btnDesabilitarFuncionarioActionPerformed

    private void btnCancelarDesabilitarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarDesabilitarFuncionarioActionPerformed
        documentoDesabilitarEmpleado.setText("");
    }//GEN-LAST:event_btnCancelarDesabilitarFuncionarioActionPerformed

    private void btnRegistrarInvitadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarInvitadoActionPerformed
        registrarInvitado();
        nombreRegistrarInvitados.setText("");
        documentoRegistroInvitados.setText("");
        empresaRegistroInvitado.setText("");
    }//GEN-LAST:event_btnRegistrarInvitadoActionPerformed

    private void btnCancelarRegistroInvitadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarRegistroInvitadoActionPerformed
        nombreRegistrarInvitados.setText("");
        documentoRegistroInvitados.setText("");
        empresaRegistroInvitado.setText("");
    }//GEN-LAST:event_btnCancelarRegistroInvitadoActionPerformed

    private void btnDesabilitarInvitadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesabilitarInvitadoActionPerformed
        desactivarInvitado();
        documentoDesabilitarInvitados.setText("");
    }//GEN-LAST:event_btnDesabilitarInvitadoActionPerformed

    private void btnCancelarDesabilitarInvitadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarDesabilitarInvitadoActionPerformed
        documentoDesabilitarInvitados.setText("");
    }//GEN-LAST:event_btnCancelarDesabilitarInvitadoActionPerformed

    private void nombreRegistroEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreRegistroEmpleadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreRegistroEmpleadosActionPerformed

    private void documentoRegistroEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_documentoRegistroEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_documentoRegistroEmpleadoActionPerformed

    private void empresaEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empresaEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_empresaEmpleadoActionPerformed

    private void nombreRegistrarInvitadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreRegistrarInvitadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreRegistrarInvitadosActionPerformed

    private void documentoRegistroInvitadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_documentoRegistroInvitadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_documentoRegistroInvitadosActionPerformed

    private void empresaRegistroInvitadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empresaRegistroInvitadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_empresaRegistroInvitadoActionPerformed

    private void documentoDesabilitarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_documentoDesabilitarEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_documentoDesabilitarEmpleadoActionPerformed

    private void documentoDesabilitarInvitadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_documentoDesabilitarInvitadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_documentoDesabilitarInvitadosActionPerformed

    private void cerrarSesionGuardiasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarSesionGuardiasMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cerrarSesionGuardiasMouseClicked

    private void cerrarSesionGuardiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarSesionGuardiasActionPerformed
        this.dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_cerrarSesionGuardiasActionPerformed

    private void registrarEmpleado(){
        String nombre = nombreRegistroEmpleados.getText();
        String empresa = empresaEmpleado.getText();
        String num_doc = documentoRegistroEmpleado.getText();
        long documento = Long.parseLong(num_doc);
        int idEmpresa = Procesos.obtenerIdEmpresa(empresa);

        Procesos.agg_usuario(documento,"",1,1,idEmpresa,nombre); 
    }
    
    private void registrarInvitado(){
        String nombre = nombreRegistrarInvitados.getText();
        String empresa = empresaRegistroInvitado.getText();
        String num_doc = documentoRegistroInvitados.getText();
        long documento = Long.parseLong(num_doc);
        int idEmpresa = Procesos.obtenerIdEmpresa(empresa);

        Procesos.agg_usuario(documento,"",0,1,idEmpresa,nombre); 
    }
    
    private void desactivarEmpleado(){
        String num_doc = documentoDesabilitarEmpleado.getText();
        long documento = Long.parseLong(num_doc);
        
        Procesos.desUsuario(documento);
    }
    
    private void desactivarInvitado(){
        String num_doc = documentoDesabilitarInvitados.getText();
        long documento = Long.parseLong(num_doc);
        
        Procesos.desUsuario(documento);
    }
    
    private void cargarDatosEnTablaEmpleados(){
        getProcesos procesosGuardias = new getProcesos();
        List<Object[]> datosEmpleados = procesosGuardias.getDataEmpleados();
        
        String[] columnNames = {"Nombre","Documento","Empresa"};
        
        DefaultTableModel modelEmpleados = new DefaultTableModel(columnNames,0);
        
        for(Object[] row: datosEmpleados){
            modelEmpleados.addRow(row);
        }
        
        tblRegistrarSalida.setModel(modelEmpleados);
        tblRegistrarEntrada.setModel(modelEmpleados);
    }
    
    private void cargarDatosEnTablaInvitados(){
        getProcesos procesosGuardias = new getProcesos();
        List<Object[]> datosInvitados = procesosGuardias.getDataInvitados();
        
        String[] columnNames = {"Nombre","Documento","Empresa","Estado"};
        
        DefaultTableModel modelInvitados = new DefaultTableModel(columnNames,0);
        
        for(Object[] row: datosInvitados){
            modelInvitados.addRow(row);
        }
        
        tblRegistrarSalida1.setModel(modelInvitados);
        tblRegistrarEntrada1.setModel(modelInvitados);
    }
    
    private void iniciarActualizacionAuto(){
        actualizacionDatosEmpleados = new Timer(1000, e-> cargarDatosEnTablaEmpleados());
        actualizacionDatosInvitados = new Timer(1000, e-> cargarDatosEnTablaInvitados());
        
        actualizacionDatosEmpleados.start();
        actualizacionDatosInvitados.start();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane Controlpestanas;
    private javax.swing.JButton btnCancelarDesabilitarFuncionario;
    private javax.swing.JButton btnCancelarDesabilitarInvitado;
    private javax.swing.JButton btnCancelarRegistroEmpleado;
    private javax.swing.JButton btnCancelarRegistroInvitado;
    private javax.swing.JButton btnDesabilitarFuncionario;
    private javax.swing.JButton btnDesabilitarInvitado;
    private javax.swing.JButton btnRegistrarEmpleado;
    private javax.swing.JButton btnRegistrarInvitado;
    private javax.swing.JTextField documentoDesabilitarEmpleado;
    private javax.swing.JTextField documentoDesabilitarInvitados;
    private javax.swing.JTextField documentoRegistroEmpleado;
    private javax.swing.JTextField documentoRegistroInvitados;
    private javax.swing.JTextField empresaEmpleado;
    private javax.swing.JTextField empresaRegistroInvitado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JButton menuDesabilitarEmpleados;
    private javax.swing.JButton menuDesabilitarInvitados;
    private javax.swing.JButton menuRegistrarEmpleados;
    private javax.swing.JButton menuRegistrarInvitados;
    private javax.swing.JTextField nombreRegistrarInvitados;
    private javax.swing.JTextField nombreRegistroEmpleados;
    private javax.swing.JTable tblRegistrarEntrada;
    private javax.swing.JTable tblRegistrarEntrada1;
    private javax.swing.JTable tblRegistrarSalida;
    private javax.swing.JTable tblRegistrarSalida1;
    // End of variables declaration//GEN-END:variables
}
