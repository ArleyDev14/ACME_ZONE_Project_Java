package Main;

import Interfaz.Funcionario;
import Interfaz.Guardia;
import Interfaz.Login;
import Interfaz.SuperUsuario;
import Interfaz.Supervisor;
import Usuarios.UsuarioControl;
import Usuarios.UsuarioDAO;
import Usuarios.UsuarioVista;

public class ACME {
    public static void main(String[] args) {
        
        UsuarioDAO usuarioDao = new UsuarioDAO();
        UsuarioVista usuarioView = new UsuarioVista();
        UsuarioControl usuarioControl = new UsuarioControl(usuarioDao,usuarioView);
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
        
        System.out.println("Ingreso exitoso al sistema");
    }
    
}
