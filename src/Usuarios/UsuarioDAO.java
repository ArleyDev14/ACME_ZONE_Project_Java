package Usuarios;

import DataBase.conexionDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class UsuarioDAO {
    public boolean agregarUsuario(Usuario usuario, int idTipoUsuario, int idEstado, int idEmpresa) {
        String sql = "INSERT INTO usuarios(id_usuario, id_tipo_usuario, id_estado, id_empresa, nombre) VALUES (?, ?, ?, ?, ?)";

        try (Connection conexion = conexionDB.conectDB();
             PreparedStatement valor = conexion.prepareStatement(sql)) {

            valor.setLong(1, usuario.getDocumento());
            valor.setInt(2, idTipoUsuario);
            valor.setInt(3, idEstado);
            valor.setInt(4, idEmpresa);
            valor.setString(5, usuario.getNombre());

            int filasAgregadas = valor.executeUpdate();
            return filasAgregadas > 0;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al registrar al usuario: " + ex.getMessage());
            return false;
        }
    }
    
    public boolean existeUsuario(long documento) {
    String sql = "SELECT COUNT(*) AS conteo FROM usuarios WHERE id_usuario = ?";
    try (Connection conexion = conexionDB.conectDB();
         PreparedStatement consulta = conexion.prepareStatement(sql)) {

        consulta.setLong(1, documento);
        ResultSet resultado = consulta.executeQuery();
        if (resultado.next()) {
            int conteo = resultado.getInt("conteo");
            return conteo > 0;
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null,"Error al verificar usuario: " + ex.getMessage());
    }
    return false;
}
   public boolean validarCredenciales(String id_usuario, String contraseña) {
    String sql = "SELECT * FROM usuarios WHERE id_usuario = ? AND contrasena = ?";

    try (Connection conn = conexionDB.conectDB();
         PreparedStatement stmt = conn.prepareStatement(sql)) {
        
        stmt.setString(1, id_usuario);
        stmt.setString(2, contraseña);

        try (ResultSet rs = stmt.executeQuery()) {
            return rs.next();
        }

    } catch (SQLException ex) {
        System.out.println("Error al validar credenciales: " + ex.getMessage());
        return false;
    }
}



 public int obtenerUsuarioPorDocumento(String id_usuario) {
        int tipoUsuario = -1;  
        String sql = "SELECT * FROM usuarios WHERE id_usuario = ?";

        try (Connection conn = conexionDB.conectDB();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, id_usuario);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                tipoUsuario = rs.getInt("id_tipo_usuario");
            }

        } catch (SQLException ex) {
            System.out.println("Error al obtener tipo de usuario: " + ex.getMessage());
        }

        return tipoUsuario;
    }
 public boolean estado_usuario(long id_usuario){
      int estado = 0;
        String sql = "SELECT id_estado FROM usuarios WHERE id_usuario = ?";
         try(Connection conn = conexionDB.conectDB();
             PreparedStatement stmt = conn.prepareStatement(sql)){
            stmt.setLong(1, id_usuario); 

            ResultSet rs = stmt.executeQuery();


            if (rs.next()) {
            estado = rs.getInt("id_estado");
                
                return switch (estado) {
                    case 1 -> true;
                    case 2 -> false;
                    default -> false;
                };
                
         } }
         catch(SQLException ex) {
           
        }
        return false;
 }
 

}
