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
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Personal
 */
public class UsuarioDAO {
    static Usuario objUsr = new Usuario();

    public void CrearUsuario() throws ClassNotFoundException, SQLException {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectionURL = "jdbc:sqlserver://DESKTOP-M3DKATA\\SQLEXPRESS:1433;databaseName=Banco;user=userSQL;password=1097096174;";
        Connection con = DriverManager.getConnection(connectionURL);
        String sql1 = "insert into Usuario(Nombre, ID) values(?,?)";
        PreparedStatement ps = con.prepareStatement(sql1, Statement.RETURN_GENERATED_KEYS); // Usar RETURN_GENERATED_KEYS
        String name = JOptionPane.showInputDialog(null, "Ingrese el nombre del usuario");
        String Id = JOptionPane.showInputDialog(null, "Ingrese su número de Identificación");
        ps.setString(1, name);
        ps.setString(2, Id);
        ps.executeUpdate();

        // Obtener el número de cuenta asignado
        int numeroDeCuenta = -1;
        ResultSet generatedKeys = ps.getGeneratedKeys();
        if (generatedKeys.next()) {
            numeroDeCuenta = generatedKeys.getInt(1);
        }

        ps.close();
        con.close();

        if (numeroDeCuenta != -1) {
            JOptionPane.showMessageDialog(null, "Se han insertado los datos. Número de cuenta asignado: " + numeroDeCuenta);
        } else {
            JOptionPane.showMessageDialog(null, "Se han insertado los datos, pero no se pudo obtener el número de cuenta.");
        }
    }
}
