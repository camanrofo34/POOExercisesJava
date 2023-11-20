/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Instrucciones;
import Componentes.Cliente;
import Componentes.Credito;
import javax.swing.JOptionPane;
/**
 *
 * @author Personal
 */
public class Main {
    static Cliente objCln = new Cliente();
    static Credito objCrd = new Credito();
    
    public static void main(String[] args) {
        int vlr;
        objCln.setClId(JOptionPane.showInputDialog(null, "Ingrese el documento del usuario"));
        objCrd.setNombre(JOptionPane.showInputDialog(null, "Ingrese el número del crédito"));
        objCln = new Cliente (" ", objCln.getClId(), "", " " );
        objCrd = new Credito (objCrd.getNombre(), 12, 0, 24000, 0);
        while (objCrd.getCuoPag()<objCrd.getNoCuo() && objCrd.getMontoAct()<objCrd.getMontoIni()){
            vlr = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el valor a pagar en la cuota " +(objCrd.CuoPag+1)+ ", recuerde que debe ser mayor que la cuota"));
            if (vlr>=(objCrd.getMontoIni()/objCrd.getNoCuo())){
                if(vlr<=(objCrd.MontoIni-objCrd.MontoAct)){
                    objCrd.CuoPag+=1;
                    objCrd.MontoAct+=vlr;  
                }
                else{
                    JOptionPane.showMessageDialog(null, "El valor a pagar excede el monto restante");
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "El valor a añadir es menor al definido como cuota");
            }
        
        }
        JOptionPane.showMessageDialog(null, "Gracias por realizar tus pagos, usuario "+objCln.clId+", su pago total fue de: "+objCrd.MontoAct+" en un total de: "+objCrd.CuoPag+" cuotas.");
    }
}
