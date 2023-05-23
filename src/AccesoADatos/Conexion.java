
package AccesoADatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Conexion {
//    private static final String url = "jdbc:mysql://localhost:3306/unniversidadg6";
// 
//    private static final String usuario = "usuario1";
//    private static String password = " ";

    private static Connection connection;

    //no se crean instancias de la conexion ppor ser construsctor privado
    private Conexion() {
    }

    public static Connection getConexion() {

        //si es nula es porque nadie ha llamado a este metodo
        if (connection == null)
        {

            try
            {
            Class.forName("org.mariadb.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/universidadg6";
            String usuario = "usuario1";
            String contraseña = "";

            //Connection connection = DriverManager.getConnection(url, usuario, contraseña);
                //equivale a un new de driver

             connection = DriverManager.getConnection(url,usuario,contraseña);
                System.out.println("conexion existosa");

            } catch (SQLException ex)
            {
                JOptionPane.showMessageDialog(null, "Error al conectarse a la bd" + ex.getMessage());
            } catch (ClassNotFoundException ex)
            {
                Logger.getLogger(null, "Error al cargar los drivers");
            }

        }
        return connection;
    }
}
