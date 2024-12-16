package Interfaz;

import DataBase.getProcesos;
import Procesos.Procesos;
import Usuarios.UsuarioControl;
import java.sql.SQLException;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.Timer;

public class SuperUsuario extends javax.swing.JFrame {
    private Timer actualizacionDatosSuperUser;
    private Timer actualizacionDatosDesSuperUser;
    private UsuarioControl usuarioControl;
    
    public SuperUsuario(UsuarioControl usuarioControl) {
        this.usuarioControl = usuarioControl;
        initComponents();
        cargarDatosEnTablaRegistros();
        cargarDatosEnTablaDesSp();
        iniciarActualizacionAuto();
        this.setLocationRelativeTo(null);
    }
    
    public SuperUsuario() {
        initComponents();
        this.setLocationRelativeTo(null);  }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnRegistrarSupervisor = new javax.swing.JButton();
        btnDesabilitarFuncionario = new javax.swing.JButton();
        cerrarSesionSuperUsuario = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Controlpestanas = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        documentoRegistroSalida = new javax.swing.JTextField();
        btnRegitrarSalida = new javax.swing.JButton();
        btnCancelarRegistroSalida = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblRegistrarSalida = new javax.swing.JTable();
        documentoRegistroSalida2 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        documentoRegistro = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRegistrarEntrada = new javax.swing.JTable();
        btnRegitrar = new javax.swing.JButton();
        btnCancelarRegistro = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo1.png"))); // NOI18N

        btnRegistrarSupervisor.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRegistrarSupervisor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/archivo-nuevo.png"))); // NOI18N
        btnRegistrarSupervisor.setText("Registrar Supervisor");
        btnRegistrarSupervisor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegistrarSupervisorMouseClicked(evt);
            }
        });
        btnRegistrarSupervisor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarSupervisorActionPerformed(evt);
            }
        });

        btnDesabilitarFuncionario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnDesabilitarFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/rechazar2.png"))); // NOI18N
        btnDesabilitarFuncionario.setText("Desabilitar ");
        btnDesabilitarFuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDesabilitarFuncionarioMouseClicked(evt);
            }
        });
        btnDesabilitarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesabilitarFuncionarioActionPerformed(evt);
            }
        });

        cerrarSesionSuperUsuario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cerrarSesionSuperUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/apagar.png"))); // NOI18N
        cerrarSesionSuperUsuario.setText("Cerrar Sesion");
        cerrarSesionSuperUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cerrarSesionSuperUsuarioMouseClicked(evt);
            }
        });
        cerrarSesionSuperUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarSesionSuperUsuarioActionPerformed(evt);
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
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cerrarSesionSuperUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDesabilitarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnRegistrarSupervisor, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(119, 119, 119)
                .addComponent(btnRegistrarSupervisor, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(btnDesabilitarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 162, Short.MAX_VALUE)
                .addComponent(cerrarSesionSuperUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 660));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/encabezadosuperuser.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 1000, 160));

        jLabel9.setText("Nombre completo");

        documentoRegistroSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                documentoRegistroSalidaActionPerformed(evt);
            }
        });

        btnRegitrarSalida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/GuardarTodo.png"))); // NOI18N
        btnRegitrarSalida.setText("Registrar");
        btnRegitrarSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegitrarSalidaActionPerformed(evt);
            }
        });

        btnCancelarRegistroSalida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminar.png"))); // NOI18N
        btnCancelarRegistroSalida.setText("Cancelar");

        tblRegistrarSalida.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tblRegistrarSalida);
        if (tblRegistrarSalida.getColumnModel().getColumnCount() > 0) {
            tblRegistrarSalida.getColumnModel().getColumn(0).setResizable(false);
            tblRegistrarSalida.getColumnModel().getColumn(0).setPreferredWidth(30);
            tblRegistrarSalida.getColumnModel().getColumn(1).setResizable(false);
            tblRegistrarSalida.getColumnModel().getColumn(1).setPreferredWidth(30);
        }

        documentoRegistroSalida2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                documentoRegistroSalida2ActionPerformed(evt);
            }
        });

        jLabel11.setText("Documento");

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
                                .addComponent(btnRegitrarSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(88, 88, 88)
                                .addComponent(btnCancelarRegistroSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(documentoRegistroSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(documentoRegistroSalida2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))))))
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
                        .addComponent(documentoRegistroSalida2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(52, 52, 52)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegitrarSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelarRegistroSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(94, Short.MAX_VALUE))
        );

        Controlpestanas.addTab("tab2", jPanel3);

        documentoRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                documentoRegistroActionPerformed(evt);
            }
        });

        tblRegistrarEntrada.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Documento", "Descripcion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblRegistrarEntrada);
        if (tblRegistrarEntrada.getColumnModel().getColumnCount() > 0) {
            tblRegistrarEntrada.getColumnModel().getColumn(0).setResizable(false);
            tblRegistrarEntrada.getColumnModel().getColumn(1).setResizable(false);
            tblRegistrarEntrada.getColumnModel().getColumn(2).setResizable(false);
        }

        btnRegitrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/GuardarTodo.png"))); // NOI18N
        btnRegitrar.setText("Inactivar");
        btnRegitrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegitrarActionPerformed(evt);
            }
        });

        btnCancelarRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminar.png"))); // NOI18N
        btnCancelarRegistro.setText("Cancelar");

        jLabel5.setText("Documento");

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
                            .addComponent(documentoRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnRegitrar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(89, 89, 89)
                                .addComponent(btnCancelarRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 549, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(documentoRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegitrar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelarRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(89, Short.MAX_VALUE))
        );

        Controlpestanas.addTab("tab1", jPanel2);

        getContentPane().add(Controlpestanas, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 910, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDesabilitarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesabilitarFuncionarioActionPerformed

    }//GEN-LAST:event_btnDesabilitarFuncionarioActionPerformed

    private void btnDesabilitarFuncionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDesabilitarFuncionarioMouseClicked
        Controlpestanas.setSelectedIndex(1);
    }//GEN-LAST:event_btnDesabilitarFuncionarioMouseClicked

    private void btnRegistrarSupervisorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarSupervisorActionPerformed

    }//GEN-LAST:event_btnRegistrarSupervisorActionPerformed

    private void btnRegistrarSupervisorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarSupervisorMouseClicked
        Controlpestanas.setSelectedIndex(0);
    }//GEN-LAST:event_btnRegistrarSupervisorMouseClicked

    private void documentoRegistroSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_documentoRegistroSalidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_documentoRegistroSalidaActionPerformed

    private void documentoRegistroSalida2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_documentoRegistroSalida2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_documentoRegistroSalida2ActionPerformed

    private void btnRegitrarSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegitrarSalidaActionPerformed
        registrarSupervisor();
    }//GEN-LAST:event_btnRegitrarSalidaActionPerformed

    private void documentoRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_documentoRegistroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_documentoRegistroActionPerformed

    private void btnRegitrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegitrarActionPerformed
        desactivarUsuario();
    }//GEN-LAST:event_btnRegitrarActionPerformed

    private void cerrarSesionSuperUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarSesionSuperUsuarioMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cerrarSesionSuperUsuarioMouseClicked

    private void cerrarSesionSuperUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarSesionSuperUsuarioActionPerformed
        this.dispose();  
        new Login().setVisible(true);
    }//GEN-LAST:event_cerrarSesionSuperUsuarioActionPerformed
    
    
    private void registrarSupervisor(){
        String num_doc = documentoRegistroSalida2.getText();
        String nombre = documentoRegistroSalida.getText();
        long documento = Long.parseLong(num_doc);
        
        String contrasena = num_doc + "acme";
        System.out.println(contrasena);
        
        Procesos.agg_usuario(documento,contrasena,4,1,1,nombre);
    }
    
    private void desactivarUsuario(){
        String num_doc = documentoRegistro.getText();
        long documento = Long.parseLong(num_doc);
        
        Procesos.desUsuario(documento);
    }
    
    private void cargarDatosEnTablaRegistros(){
        getProcesos procesosGuardias = new getProcesos();
        List<Object[]> datosSupervisor = procesosGuardias.getDataRegistrosSp();
        
        String[] columnNames = {"Nombre","Documento","Tipo de usuario"};
        
        DefaultTableModel modelRegistrosSp = new DefaultTableModel(columnNames,0);
        
        for(Object[] row: datosSupervisor){
            modelRegistrosSp.addRow(row);
        }
        
        tblRegistrarSalida.setModel(modelRegistrosSp);
    }
    
    private void cargarDatosEnTablaDesSp(){
        getProcesos procesosGuardias = new getProcesos();
        List<Object[]> datosDesSp = procesosGuardias.getDataDesSp();
        
        String[] columnNames = {"Nombre","Documento","Estado"};
        
        DefaultTableModel modelDesSp = new DefaultTableModel(columnNames,0);
        
        for(Object[] row: datosDesSp){
            modelDesSp.addRow(row);
        }
        
        tblRegistrarEntrada.setModel(modelDesSp);
    }
    
    private void iniciarActualizacionAuto(){
        actualizacionDatosSuperUser = new Timer(1000, e-> cargarDatosEnTablaRegistros());
        actualizacionDatosDesSuperUser = new Timer(1000, e-> cargarDatosEnTablaDesSp());
        actualizacionDatosSuperUser.start();
        actualizacionDatosDesSuperUser.start();
    }
    
    private void pararActualizacionAuto(){
        if(actualizacionDatosSuperUser != null){
            actualizacionDatosSuperUser.stop();

        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane Controlpestanas;
    private javax.swing.JButton btnCancelarRegistro;
    private javax.swing.JButton btnCancelarRegistroSalida;
    private javax.swing.JButton btnDesabilitarFuncionario;
    private javax.swing.JButton btnRegistrarSupervisor;
    private javax.swing.JButton btnRegitrar;
    private javax.swing.JButton btnRegitrarSalida;
    private javax.swing.JButton cerrarSesionSuperUsuario;
    private javax.swing.JTextField documentoRegistro;
    private javax.swing.JTextField documentoRegistroSalida;
    private javax.swing.JTextField documentoRegistroSalida2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblRegistrarEntrada;
    private javax.swing.JTable tblRegistrarSalida;
    // End of variables declaration//GEN-END:variables
}
