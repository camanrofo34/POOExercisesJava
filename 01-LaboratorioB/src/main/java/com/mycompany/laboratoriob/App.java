/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.laboratoriob;

import Clases.Calcular;
import Clases.Cliente;
import Clases.RegistroDao;
import Clases.Vehiculo;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
/**
 *
 * @author Personal
 */
public class App {
    static Calcular objCal = new Calcular();
    static Cliente objCln;
    static RegistroDao objDao =new RegistroDao();
    static Vehiculo objVh;
    public static void main(String[] args) throws ClassNotFoundException, SQLException{
        String cad;
        int otro;
        JOptionPane.showMessageDialog(null, "Bienvenidos al servicio de parking");
        do{
            JOptionPane.showMessageDialog(null, "A continuación indique los datos que se le comunican:");
            String placa= JOptionPane.showInputDialog(null, "Ingrese la placa de su auto");
            String prop=JOptionPane.showInputDialog(null, "Ingrese el nombre del propietario");
            String fecha=JOptionPane.showInputDialog(null, "Ingrese la fecha de hoy");
            int horEnt=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la hora de entrada"));
            int minEnt=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el minuto de entrada"));
            int horSal=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la hora de salida"));
            int minSal=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el minuto de salida"));
            objCln= new Cliente(prop);
            objVh= new Vehiculo(prop, placa);
            int tiempo=objCal.CalcularTiempo(horEnt, horSal, minEnt, minSal);
            int valorpagar=objCal.CalcularValor(tiempo);
            cad="Id\tPlaca\tPropietario\tfecha\thorEnt\tminEnt\thorEnt\thorSal\tTiempo\tValor\n";
            cad+="1\t"+placa+"\t"+prop+"\t"+fecha+"\t"+horEnt+"\t"+minEnt+"\t"+horSal+"\t"+minSal+"\t"+tiempo+"\t"+valorpagar;
            JOptionPane.showMessageDialog(null, new JTextArea(cad));
            objDao.crearParking(placa, prop, fecha, horEnt, horSal, minEnt, minSal, tiempo, valorpagar);
            otro=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese 1 para hacer otra operación o 0 para terminar"));
        }while(otro==1);
    }
}
