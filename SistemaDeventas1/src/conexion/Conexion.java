package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion {

    //conexion local
    public static Connection conectar() {
        try {
            String url = "jdbc:mysql://" + "localhost" + ":" + 3306 + "/" + "bd_sistema_ventas" + "?user=" + "root" + "&password=" + "1097096174" + "&useSSL=false";
            Connection cn = DriverManager.getConnection(url);
            return cn;
        } catch (SQLException e) {
            System.out.println("Error en la conexion local " + e);
        }
        return null;
    }
}
