package kata5p2.view;

/**
 *
 * @author Fabián B.
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionBD {
    
    // Método que realiza la conexión con la Base de Datos
    
    public static Connection connect() {
        String URL_BD_SQLite = "jdbc:sqlite:C:\\Users\\fbeir\\Documents\\NetBeansProjects\\Kata5 P2\\src\\kata5p2\\KATA5.db";
        Connection connection = null;
        
        try {
            connection = DriverManager.getConnection(URL_BD_SQLite);
            System.out.println("Conexion establecida con la Base de Datos...");
        } catch(SQLException e){
            System.out.println("Error en Kata5::connect(SQLException) " + e.getMessage());
        }

        return connection;
    }
}