package DataBase;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

public class getProcesos {
    public List<Object[]> getData(String tipoProceso) {
        List<Object[]> data = new ArrayList<>();
        String query = """
                           SELECT us.nombre, us.id_usuario, tp.nombre
                           FROM procesos pr
                           JOIN usuarios us ON us.id_usuario = pr.id_usuario
                           JOIN tipos_procesos tp ON tp.id_tipo_proceso = pr.id_tipo_proceso
                           WHERE tp.nombre = ?;
                           """;
        try (Connection con = conexionDB.conectDB();
             PreparedStatement stmt = con.prepareStatement(query)) {
            // Establecer el parámetro del tipo de proceso
            stmt.setString(1, tipoProceso);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Object[] row = new Object[3];
                row[0] = rs.getString("us.nombre");
                row[1] = rs.getString("us.id_usuario");
                row[2] = rs.getString("tp.nombre");
                data.add(row);
            }
        } catch (Exception e) {
            System.out.println("Error en la lectura a la tabla: " + e.getMessage());
        }
        return data;
    }
    
    public List<Object[]> getDataVehiculos() {
        List<Object[]> data = new ArrayList<>();
        String query = """
                           SELECT id_vehiculo, us.nombre
                           FROM vehiculos vh
                           JOIN usuarios us ON vh.id_usuario = us.id_usuario
                           """;
        try (Connection con = conexionDB.conectDB();
             PreparedStatement stmt = con.prepareStatement(query)) {
            // Establecer el parámetro del tipo de proceso

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Object[] row = new Object[3];
                row[0] = rs.getString("id_vehiculo");
                row[1] = rs.getString("us.nombre");
                data.add(row);
            }
        } catch (Exception e) {
            System.out.println("Error en la lectura a la tabla: " + e.getMessage());
        }
        return data;
    }
    
   public List<Object[]> getDataAnotaciones() {
        List<Object[]> data = new ArrayList<>();
        String query = """
                           SELECT us.nombre, an.prohibicion, an.descripcion
                           FROM anotaciones an 
                           JOIN usuarios us ON us.id_usuario = an.id_usuario;
                           """;
        try (Connection con = conexionDB.conectDB();
             PreparedStatement stmt = con.prepareStatement(query)) {
            // Establecer el parámetro del tipo de proceso

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Object[] row = new Object[3];
                row[0] = rs.getString("us.nombre");
                row[1] = rs.getString("an.prohibicion");
                row[2] = rs.getString("an.descripcion");
                data.add(row);
            }
        } catch (Exception e) {
            System.out.println("Error en la lectura a la tabla: " + e.getMessage());
        }
        return data;
    }
   
   public List<Object[]> getDataRegistrosSp() {
        List<Object[]> data = new ArrayList<>();
        String query = """
                           SELECT us.nombre, us.id_usuario, tu.nombre
                           FROM usuarios us 
                           JOIN tipos_usuarios tu ON us.id_tipo_usuario = tu.id_tipo_usuario
                           WHERE us.id_tipo_usuario = 4;
                           """;
        try (Connection con = conexionDB.conectDB();
             PreparedStatement stmt = con.prepareStatement(query)) {
            // Establecer el parámetro del tipo de proceso

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Object[] row = new Object[3];
                row[0] = rs.getString("us.nombre");
                row[1] = rs.getString("us.id_usuario");
                row[2] = rs.getString("tu.nombre");
                data.add(row);
            }
        } catch (Exception e) {
            System.out.println("Error en la lectura a la tabla: " + e.getMessage());
        }
        return data;
    }
   
   public List<Object[]> getDataDesSp() {
        List<Object[]> data = new ArrayList<>();
        String query = """
                           SELECT us.nombre, us.id_usuario, es.nombre
                           FROM usuarios us 
                           JOIN tipos_usuarios tu ON us.id_tipo_usuario = tu.id_tipo_usuario
                           JOIN estados es ON es.id_estado = us.id_estado
                           WHERE us.id_tipo_usuario = 4 AND us.id_estado = 0;
                           """;
        try (Connection con = conexionDB.conectDB();
             PreparedStatement stmt = con.prepareStatement(query)) {
            // Establecer el parámetro del tipo de proceso

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Object[] row = new Object[3];
                row[0] = rs.getString("us.nombre");
                row[1] = rs.getString("us.id_usuario");
                row[2] = rs.getString("es.nombre");
                data.add(row);
            }
        } catch (Exception e) {
            System.out.println("Error en la lectura a la tabla: " + e.getMessage());
        }
        return data;
    }
   
   public List<Object[]> getDataFuncionarios() {
        List<Object[]> data = new ArrayList<>();
        String query = """
                           SELECT us.nombre, us.id_usuario, em.nombre
                           FROM usuarios us 
                           JOIN tipos_usuarios tu ON us.id_tipo_usuario = tu.id_tipo_usuario
                           JOIN empresas em ON em.id_empresa = us.id_empresa
                           WHERE us.id_tipo_usuario = 3;
                           """;
        try (Connection con = conexionDB.conectDB();
             PreparedStatement stmt = con.prepareStatement(query)) {
            // Establecer el parámetro del tipo de proceso

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Object[] row = new Object[3];
                row[0] = rs.getString("us.nombre");
                row[1] = rs.getString("us.id_usuario");
                row[2] = rs.getString("em.nombre");
                data.add(row);
            }
        } catch (Exception e) {
            System.out.println("Error en la lectura a la tabla: " + e.getMessage());
        }
        return data;
    }
   
   public List<Object[]> getDataDesFun() {
        List<Object[]> data = new ArrayList<>();
        String query = """
                           SELECT us.nombre, us.id_usuario, em.nombre, es.nombre
                           FROM usuarios us 
                           JOIN tipos_usuarios tu ON us.id_tipo_usuario = tu.id_tipo_usuario
                           JOIN empresas em ON em.id_empresa = us.id_empresa
                           JOIN estados es ON es.id_estado = us.id_estado
                           WHERE us.id_tipo_usuario = 3 AND us.id_estado = 0;
                           """;
        try (Connection con = conexionDB.conectDB();
             PreparedStatement stmt = con.prepareStatement(query)) {
            // Establecer el parámetro del tipo de proceso

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Object[] row = new Object[4];
                row[0] = rs.getString("us.nombre");
                row[1] = rs.getString("us.id_usuario");
                row[2] = rs.getString("em.nombre");
                row[3] = rs.getString("es.nombre");
                data.add(row);
            }
        } catch (Exception e) {
            System.out.println("Error en la lectura a la tabla: " + e.getMessage());
        }
        return data;
    }
   
   public List<Object[]> getDataGuardias() {
        List<Object[]> data = new ArrayList<>();
        String query = """
                           SELECT us.nombre, us.id_usuario, es.nombre
                           FROM usuarios us 
                           JOIN tipos_usuarios tu ON us.id_tipo_usuario = tu.id_tipo_usuario
                           JOIN estados es ON us.id_estado = es.id_estado
                           WHERE us.id_tipo_usuario = 2 AND us.id_estado = 1;
                           """;
        try (Connection con = conexionDB.conectDB();
             PreparedStatement stmt = con.prepareStatement(query)) {
            // Establecer el parámetro del tipo de proceso

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Object[] row = new Object[3];
                row[0] = rs.getString("us.nombre");
                row[1] = rs.getString("us.id_usuario");
                row[2] = rs.getString("es.nombre");
                data.add(row);
            }
        } catch (Exception e) {
            System.out.println("Error en la lectura a la tabla: " + e.getMessage());
        }
        return data;
    }
   
   public List<Object[]> getDataDesGuard() {
        List<Object[]> data = new ArrayList<>();
        String query = """
                           SELECT us.nombre, us.id_usuario, es.nombre
                           FROM usuarios us 
                           JOIN tipos_usuarios tu ON us.id_tipo_usuario = tu.id_tipo_usuario
                           JOIN estados es ON es.id_estado = us.id_estado
                           WHERE us.id_tipo_usuario = 2 AND us.id_estado = 0;
                           """;
        try (Connection con = conexionDB.conectDB();
             PreparedStatement stmt = con.prepareStatement(query)) {
            // Establecer el parámetro del tipo de proceso

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Object[] row = new Object[3];
                row[0] = rs.getString("us.nombre");
                row[1] = rs.getString("us.id_usuario");
                row[2] = rs.getString("es.nombre");
                data.add(row);
            }
        } catch (Exception e) {
            System.out.println("Error en la lectura a la tabla: " + e.getMessage());
        }
        return data;
    }
   
   public List<Object[]> getDataEmpleados() {
        List<Object[]> data = new ArrayList<>();
        String query = """
                           SELECT us.nombre, us.id_usuario, es.nombre
                           FROM usuarios us 
                           JOIN tipos_usuarios tu ON us.id_tipo_usuario = tu.id_tipo_usuario
                           JOIN estados es ON es.id_estado = us.id_estado
                           WHERE us.id_tipo_usuario = 1;
                           """;
        try (Connection con = conexionDB.conectDB();
             PreparedStatement stmt = con.prepareStatement(query)) {
            // Establecer el parámetro del tipo de proceso

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Object[] row = new Object[3];
                row[0] = rs.getString("us.nombre");
                row[1] = rs.getString("us.id_usuario");
                row[2] = rs.getString("es.nombre");
                data.add(row);
            }
        } catch (Exception e) {
            System.out.println("Error en la lectura a la tabla: " + e.getMessage());
        }
        return data;
    }
   
   public List<Object[]> getDataInvitados() {
        List<Object[]> data = new ArrayList<>();
        String query = """
                           SELECT us.nombre, us.id_usuario,em.nombre, es.nombre
                           FROM usuarios us 
                           JOIN tipos_usuarios tu ON us.id_tipo_usuario = tu.id_tipo_usuario
                           JOIN estados es ON es.id_estado = us.id_estado
                           JOIN empresas em ON us.id_empresa = em.id_empresa
                           WHERE us.id_tipo_usuario = 0;
                           """;
        try (Connection con = conexionDB.conectDB();
             PreparedStatement stmt = con.prepareStatement(query)) {
            // Establecer el parámetro del tipo de proceso

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Object[] row = new Object[4];
                row[0] = rs.getString("us.nombre");
                row[1] = rs.getString("us.id_usuario");
                row[2] = rs.getString("em.nombre");
                row[3] = rs.getString("es.nombre");
                data.add(row);
            }
        } catch (Exception e) {
            System.out.println("Error en la lectura a la tabla: " + e.getMessage());
        }
        return data;
    }
}
