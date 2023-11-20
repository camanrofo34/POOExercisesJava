package Instrucciones;

import Paquetes.Banco;
import Paquetes.BancoDAO;
import Paquetes.Usuario;
import Paquetes.UsuarioDAO;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {
    static Banco objBnc;
    static Usuario objUsr;
    static UsuarioDAO objUsdao;
    static BancoDAO objBndao;

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        int anothertime;
        do {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String connectionURL = "jdbc:sqlserver://DESKTOP-M3DKATA\\SQLEXPRESS:1433;databaseName=Banco;user=userSQL;password=1097096174;";
            Connection con = DriverManager.getConnection(connectionURL);
            int decision, evento;

            decision = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese qué desea hacer: 1 para registrar usuarios y 2 para realizar transacciones"));

            switch (decision) {
                case 1:
                    objUsdao = new UsuarioDAO();
                    objUsdao.CrearUsuario();
                    objBndao = new BancoDAO();
                    objBndao.crearBanco();
                    break;
                case 2:
                    int posicion = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la ID de la cuenta"));
                    evento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa 1 si desea consignar y 2 si desea retirar"));
                    objBndao = new BancoDAO();
                    int montoactual = objBndao.obtenerMontoPorId(posicion);
                    String updateQuery = "UPDATE Banco SET Monto = ? WHERE NoCnt = ?";
                    PreparedStatement updateStatement = con.prepareStatement(updateQuery);
                    switch (evento) {
                        case 1:
                            objBnc = new Banco();
                            objBnc.setMontoActual(montoactual);
                            objBnc.Consignar(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el valor a consignar")));
                            updateStatement.setInt(1, objBnc.getMontoActual());
                            updateStatement.setInt(2, posicion);
                            updateStatement.executeUpdate();
                            updateStatement.close();
                            con.close();
                            break;
                        case 2:
                            objBnc = new Banco();
                            objBnc.setMontoActual(montoactual);
                            objBnc.Retirar(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el valor a retirar")));
                            updateStatement.setInt(1, objBnc.getMontoActual());
                            updateStatement.setInt(2, posicion);
                            updateStatement.executeUpdate();
                            updateStatement.close();
                            con.close();
                            break;
                        default:
                            break;
                    }
                    break;
                default:
                    break;
            }
            
            anothertime = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese 1 para continuar o 0 para terminar"));
        } while (anothertime == 1);

        JOptionPane.showMessageDialog(null, "Gracias por usar nuestros servicios");
    }
}

