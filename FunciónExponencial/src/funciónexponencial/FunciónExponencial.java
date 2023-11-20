package funciónexponencial;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
public class FunciónExponencial {
    static Operaciones o;
    public static void main(String[] args) {
        o= new Operaciones();
        DecimalFormat format= new DecimalFormat("#.00000");
        int dnm, prc, c, otro;
        double x, rsl;
        String cad, cdn1, cdn2, cdn3;
        cdn1="Numero a calcular";
        cdn2="Cantidad de terminos";
        cdn3= "Desea otro?";
        do{
            x=Double.parseDouble(JOptionPane.showInputDialog(null, cdn1));
            prc= Integer.parseInt(JOptionPane.showInputDialog(null, cdn2));
            rsl= 1+x; dnm=2; c=2;
            cad="Iter\tDenox\tFact\tResult\nl\t"+dnm+"\t"+o.getFct(dnm)+"\t"+rsl+"\n";
            while (c<= prc){
                rsl = rsl + (Math.pow(x, dnm))/o.getFct(dnm);
                cad += c+"\t"+dnm+"\t"+o.getFct(dnm)+"\t"+format.format(rsl)+"\n";
                dnm+=1; c+=1;
            }
            JOptionPane.showMessageDialog(null, cad);
            JOptionPane.showMessageDialog(null, new JTextArea(cad));
            otro=Integer.parseInt(JOptionPane.showInputDialog(null, cdn3));
            
        }while (otro==1);
        
    }
    
}
