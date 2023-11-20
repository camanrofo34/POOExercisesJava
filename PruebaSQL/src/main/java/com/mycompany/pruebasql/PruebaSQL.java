/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pruebasql;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author Personal
 */
public class PruebaSQL {

    public static void main(String[] args) throws ClassNotFoundException, SQLException{
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectionURL = "jdbc:sqlserver://DESKTOP-M3DKATA\\SQLEXPRESS:1433;databaseName=Banco;user=userSQL;password=1097096174;";
        Connection con = DriverManager.getConnection(connectionURL);
        String sql = "insert into Usuario(ID, Nombre) values(?,?)";
        PreparedStatement ps = con.prepareStatement(sql);
        String name=JOptionPane.showInputDialog(null, "Ingrese el nombre del usuario");
        String Id=JOptionPane.showInputDialog(null, "Ingrese su número de Indentificación");
        ps.setString(1, name);
        ps.setString(2, Id);
        ps.executeUpdate();
        JOptionPane.showMessageDialog(null, "Se han insertado los datos");
        
    }
}
