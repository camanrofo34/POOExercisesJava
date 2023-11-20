/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Calculadora;
import Operaciones.Operaciones;
import javax.swing.JOptionPane;

/**
 *
 * @author Personal
 */
public class Main {
    static Operaciones objOp;
    public static void main(String[] args){
        int i, cnt, dec, vlr;
        cnt=0;
        JOptionPane.showMessageDialog(null, "El conteo arranca en "+cnt);
        objOp = new Operaciones();
        i=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese cuantos números va a realizarles operaciones consecutivas"));
        for (int y=0; y<i; y++){
            JOptionPane.showMessageDialog(null, "Ingrese 1 para sumar, 2 para restar, 3 para multiplicar, 4 para dividir, 5 para hallar el factorial del último resultado");
            do{
            dec=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese qué operación va a realizar: "));
            switch(dec){
                case 1:
                    vlr=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el valor con el que va a realizar la operación"));
                    cnt=objOp.sumatoria(cnt, vlr);
                    break;
                case 2:
                    vlr=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el valor con el que va a realizar la operación"));
                    cnt=objOp.diferencia(cnt, vlr);
                    break;
                case 3:
                    vlr=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el valor con el que va a realizar la operación"));
                    cnt=objOp.multiplo(cnt, vlr);
                    break;
                case 4:
                    vlr=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el valor con el que va a realizar la operación"));
                    cnt=objOp.resDiv(cnt, vlr);
                    break;
                case 5:
                    cnt=objOp.fact(cnt);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "No ingresó ningún número válido, vuelva a intentarlo");
                    break;
                       
            }
            }while(dec!=1 && dec!=2 && dec!=3 && dec!=4 && dec!=5);
            JOptionPane.showMessageDialog(null, "El resultado fue "+cnt);
        }
        JOptionPane.showMessageDialog(null, "Gracias por usar nuestros servicios");
            
    }
}
