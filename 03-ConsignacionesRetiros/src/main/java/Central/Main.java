/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Central;
import Componentes.Banco;
import Componentes.Consignacion;
import Componentes.Retiros;
import javax.swing.JOptionPane;
/**
 *
 * @author Personal
 */
public class Main {
    static Banco objBnc = new Banco();
    
    
    public static void main(String[] args) {
        int i, j, vlr;
        objBnc.setIdPersona(JOptionPane.showInputDialog(null, "Ingrese el Id del Usuario: "));
        objBnc= new Banco ("",objBnc.getIdPersona() ,5000 );
        do{
        JOptionPane.showMessageDialog(null, "Bienvenido usuario "+objBnc.getIdPersona()+" su monto actual es de: $"+objBnc.getMontoActual()+".");
        j=Integer.parseInt(JOptionPane.showInputDialog(null, "¿Qué desea realizar? Escriba 1 para consignar o escriba 2 para retirar."));
        if (j==1){
            vlr=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el valor a consignar"));
            objBnc.Consignar(vlr);
        }
        else if (j==2){
            vlr=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el valor a retirar"));
            if (vlr<objBnc.getMontoActual()){
            objBnc.Retirar(vlr);}
            else{
                JOptionPane.showMessageDialog(null, "Operación cancelada, saldo insuficiente para retirar");
            }
        }
        i=Integer.parseInt(JOptionPane.showInputDialog(null, "Gracias por usar nuestros servicios, en total quedó con un saldo de "+objBnc.getMontoActual()+", si desea continuar ingrese 1, o 0 para cerrar"));
        }while(i==1);
        JOptionPane.showMessageDialog(null, "Gracias por usar nuestros servicios");
    }
    
}

