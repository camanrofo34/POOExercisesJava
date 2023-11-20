/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquetes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Personal
 */
public class BancoDAO {
    public void crearBanco() throws ClassNotFoundException, SQLException{
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectionURL = "jdbc:sqlserver://DESKTOP-M3DKATA\\SQLEXPRESS:1433;databaseName=Banco;user=userSQL;password=1097096174;";
        Connection con = DriverManager.getConnection(connectionURL);
        String sql1 = "insert into Banco(Monto) values(?)";
        PreparedStatement ps = con.prepareStatement(sql1);   
        ps.setInt(1, 0);
        ps.executeUpdate();        
    }
    public int obtenerMontoPorId(int id) {
        int monto=0;
        try {
            Connection connection = DriverManager.getConnection("jdbc:sqlserver://DESKTOP-M3DKATA\\SQLEXPRESS:1433;databaseName=Banco;user=userSQL;password=1097096174;");
            String query = "SELECT Monto FROM Banco WHERE NoCnt = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            
            if (resultSet.next()) {
                monto = resultSet.getInt("Monto");
            }
            
            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
        }
        JOptionPane.showMessageDialog(null, "Su monto actual es de: "+ monto);
        return monto;
    }
    
}
