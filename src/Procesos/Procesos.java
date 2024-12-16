package Procesos;

import DataBase.conexionDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Procesos {

    public static void agg_proceso(int id_tipo_proceso,long id_usuario) {
        String sql = "INSERT INTO procesos(id_tipo_proceso,id_usuario,fecha)VALUES(?,?,CURRENT_TIMESTAMP)";

        try (Connection conexion = conexionDB.conectDB();
             PreparedStatement valor = conexion.prepareStatement(sql)) {
                
                valor.setInt(1, id_tipo_proceso);
                valor.setLong(2,id_usuario);

                int filasAgregadas = valor.executeUpdate();
                if (filasAgregadas > 0){
                    JOptionPane.showMessageDialog(null,"Ingreso exitoso!");
                }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al ingresar: " + ex.getMessage());
        }
    }
    
    public static void agg_vehiculo(String placa, long id_usuario){
        String sql = "INSERT INTO vehiculos(id_vehiculo,id_usuario)VALUES(?,?)";

        try (Connection conexion = conexionDB.conectDB();
             PreparedStatement valor = conexion.prepareStatement(sql)) {
                
                valor.setString(1,placa);
                valor.setLong(2,id_usuario);

                int filasAgregadas = valor.executeUpdate();
                if (filasAgregadas > 0){
                    JOptionPane.showMessageDialog(null, "Ingreso exitoso!");
                }

        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"Error al ingresar: " + ex.getMessage());
        }
    }
    
    public static void agg_anotacion(long id_usuario, int prohibicion, String descripcion){
        String sql = "INSERT INTO anotaciones(id_usuario,prohibicion,descripcion)VALUES(?,?,?)";

        try (Connection conexion = conexionDB.conectDB();
             PreparedStatement valor = conexion.prepareStatement(sql)) {
                
                valor.setLong(1,id_usuario);
                valor.setInt(2,prohibicion);
                valor.setString(3,descripcion);

                int filasAgregadas = valor.executeUpdate();
                if (filasAgregadas > 0){
                    JOptionPane.showMessageDialog(null, "Ingreso exitoso!");
                }

        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"Error al ingresar: " + ex.getMessage());
        }
    }
    
    public static void agg_usuario(long id_usuario,String contrasena, int id_tipo_usuario,int id_estado,int id_empresa,String nombre){
            String sql = "INSERT INTO usuarios(id_usuario,contrasena,id_tipo_usuario,id_estado,id_empresa,nombre)VALUES(?,?,?,1,?,?)";
            
            try (Connection conexion = conexionDB.conectDB();
             PreparedStatement valor = conexion.prepareStatement(sql)) {
                
                valor.setLong(1,id_usuario);
                valor.setString(2,contrasena);
                valor.setInt(3,id_tipo_usuario);
                valor.setInt(4,id_empresa);
                valor.setString(5,nombre);

                int filasAgregadas = valor.executeUpdate();
                if (filasAgregadas > 0){
                    JOptionPane.showMessageDialog(null, "Ingreso exitoso!");
                }

        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"Error al ingresar: " + ex.getMessage());
        }
    }
    
    public static int obtenerIdEmpresa(String nombreEmpresa){
    try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/ACME_ZONE", "arleydev14", "140512");){
        // Consultar el ID de la empresa
        String query = "SELECT id_empresa FROM empresas WHERE nombre = ?";
        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.setString(1, nombreEmpresa);
        ResultSet rs = stmt.executeQuery();

        if (rs.next()) {
            return rs.getInt("id_empresa");
        } else {
            // Lanzar una excepción si la empresa no existe
            throw new SQLException("La empresa '" + nombreEmpresa + "' no existe en la base de datos.");
        }
    }   catch (SQLException ex) {
            Logger.getLogger(Procesos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
    
    public static void desUsuario(long documento){
    try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/ACME_ZONE", "arleydev14", "140512")) {
        // Verificar si el usuario existe
        String verificarQuery;
        verificarQuery = """
                         SELECT us.id_usuario
                         FROM usuarios us
                         JOIN tipos_usuarios tu ON tu.id_tipo_usuario = us.id_tipo_usuario
                         WHERE us.id_usuario = ?""";
        PreparedStatement verificarStmt = conn.prepareStatement(verificarQuery);
        verificarStmt.setLong(1, documento);
        ResultSet rs = verificarStmt.executeQuery();

        if (rs.next()) {
            // Si el usuario existe, actualizar su estado a desactivado
            String updateQuery = "UPDATE usuarios SET id_estado = ? WHERE id_usuario = ?";
            PreparedStatement updateStmt = conn.prepareStatement(updateQuery);
            updateStmt.setInt(1, 0); // Asume que 0 es el estado "desactivado"
            updateStmt.setLong(2, documento);
            int rowsUpdated = updateStmt.executeUpdate();

            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(null,"Usuario desactivado exitosamente.");
            } else {
                throw new SQLException("No se pudo desactivar el usuario.");
            }
        } else {
            throw new SQLException("El usuario con documento " + documento + " no existe.");
        }
    }   catch (SQLException ex) {
            Logger.getLogger(Procesos.class.getName()).log(Level.SEVERE, null, ex);
        }
} 
    
    
}
    
    

    
  

