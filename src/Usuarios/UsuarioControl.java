package Usuarios;

import DataBase.conexionDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UsuarioControl {
   
    private UsuarioDAO usuarioDAO;
    private UsuarioVista usuarioView;
    
    public UsuarioControl(UsuarioDAO usuarioDao, UsuarioVista usuarioView){
        this.usuarioDAO = usuarioDao;
        this.usuarioView = usuarioView;
    }
    
    public void add_usuario(long documento, String nombre, int idTipoUsuario, int idEstado, int idEmpresa) {
        if (usuarioDAO.existeUsuario(documento)) {
            usuarioView.mostrarMensaje("El documento ya está registrado.");
            return;
        }

        Usuario usuario = new Usuario(documento, nombre);
        boolean resultado = usuarioDAO.agregarUsuario(usuario, idTipoUsuario, idEstado, idEmpresa);

        if (resultado) {
            usuarioView.mostrarMensaje("Registro de usuario exitoso");
        } else {
            usuarioView.mostrarMensaje("Error al registrar usuario");
        }
    }
    
    public boolean verificar_usuario(long documento){
        return usuarioDAO.existeUsuario(documento);
    }
     public boolean verificarestado(long id_usuario){
       return usuarioDAO.estado_usuario(id_usuario);
 }
}
