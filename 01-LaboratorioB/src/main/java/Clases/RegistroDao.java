/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Personal
 */
public class RegistroDao {

    public RegistroDao() {
    }
    
    public void crearParking(String Placa, String Propietario, String Fecha, int horEnt, int horSal, int minEnt, int minSal, int tiempo, int valor) throws ClassNotFoundException, SQLException{
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectionURL = "jdbc:sqlserver://DESKTOP-M3DKATA\\SQLEXPRESS:1433;databaseName=Parqueadero;user=userSQL;password=1097096174;";
        Connection con = DriverManager.getConnection(connectionURL);
        String sql1 = "insert into Datos(Placa, Propietario, fecha, horEnt, horSal, minEnt, minSal, tiempo, valor) values(?,?,?,?,?,?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(sql1);   
        ps.setString(1, Placa);
        ps.setString(2, Propietario);
        ps.setString(3, Fecha);
        ps.setInt(4, horEnt);
        ps.setInt(5, horSal);
        ps.setInt(6, minEnt);
        ps.setInt(7, minSal);
        ps.setInt(8, tiempo);
        ps.setInt(9, valor);
        ps.executeUpdate();        
    }
}
