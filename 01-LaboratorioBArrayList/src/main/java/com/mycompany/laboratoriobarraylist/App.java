package com.mycompany.laboratoriobarraylist;

import Clases.Calcular;
import Clases.Cliente;
import Clases.Vehiculo;
import Clases.Registro;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class App {
    static Calcular objCal = new Calcular();
    static ArrayList<Registro> registros = new ArrayList<>();
    static Vehiculo objVh;
    static Cliente objCln;
    public static void main(String[] args) {
        String cad;
        int otro;
        JOptionPane.showMessageDialog(null, "Bienvenidos al servicio de parking");
        int i=1;
        do {
            JOptionPane.showMessageDialog(null, "A continuación indique los datos que se le comunican:");
            String placa = JOptionPane.showInputDialog(null, "Ingrese la placa de su auto");
            String prop = JOptionPane.showInputDialog(null, "Ingrese el nombre del propietario");
            String fecha = JOptionPane.showInputDialog(null, "Ingrese la fecha de hoy");
            int horEnt = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la hora de entrada"));
            int minEnt = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el minuto de entrada"));
            int horSal = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la hora de salida"));
            int minSal = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el minuto de salida"));
            
            objCln = new Cliente(prop);
            objVh = new Vehiculo(prop, placa);
            int tiempo = objCal.CalcularTiempo(horEnt, horSal, minEnt, minSal);
            int valorpagar = objCal.CalcularValor(tiempo);
            cad = "Placa\tPropietario\tfecha\thorEnt\thorSal\tTiempo\tValor\n";
            Registro registro = new Registro(placa, prop, fecha, horEnt, horSal, minEnt, minSal, tiempo, valorpagar);
            registros.add(registro);
            for (Registro reg: registros){
            cad += reg.placa+"\t" +reg.prop + "\t" + reg.fecha + "\t" + reg.horEnt + ":" + reg.minEnt + "\t" + reg.horSal + ":" + reg.minSal + "\t" + reg.tiempo + "\t" + reg.valorpagar+"\n";
            }
            JOptionPane.showMessageDialog(null, new JTextArea(cad));
            i+=1;
            otro = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese 1 para hacer otra operación o 0 para terminar"));
        } while (otro == 1);
    }
}


