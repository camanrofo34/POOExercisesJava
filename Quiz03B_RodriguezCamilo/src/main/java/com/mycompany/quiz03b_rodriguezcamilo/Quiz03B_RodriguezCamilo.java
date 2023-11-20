/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.quiz03b_rodriguezcamilo;

import Clases.Avion;
import Clases.Registro;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author Personal
 */
public class Quiz03B_RodriguezCamilo {
    public static void main(String[] args) {
        Registro objReg = new Registro(0,0,0,0);
        int cant;
        JOptionPane.showMessageDialog(null, "Bienvenido a la empresa de aviación UrbanoAirs");
        cant=Integer.parseInt(JOptionPane.showInputDialog("Ingrese cuántos aviones va a ingresar a continuación:"));
        int pag;
        for (int i=0; i<cant; i++){
            String Id=JOptionPane.showInputDialog(null, "Ingrese el Id de su avión");
            String Placa=JOptionPane.showInputDialog(null, "Ingrese la placa de su avión");
            String marca=JOptionPane.showInputDialog(null, "Ingrese la marca de su avión");
            String añoFab=JOptionPane.showInputDialog(null, "Ingrese el año de fabricación de su avión");
            String vlrCmp=JOptionPane.showInputDialog(null, "Ingrese el valor de compra de su avión");
            int Cln=Integer.parseInt(JOptionPane.showInputDialog("Ingrese cuántos cilindros tiene su avión"));
            Avion objAv = new Avion(Id, Placa, marca, añoFab, vlrCmp, Cln);
            if (Cln==8){
                pag=objReg.eightcilinder(objAv);
            }
            else if (Cln==10){
                pag=objReg.tencilinder(objAv);
            }
            else if (Cln==12){
                pag=objReg.twelvecilinder(objAv);
            }
            else{
                pag=objReg.othercilinder(objAv);
            }
            String cad = "Id\tPlaca\tMarca\tAñoFab\tValorCompra\tCntCilindros\tValor a Pagar\n";
            cad+=objAv.getId()+"\t"+objAv.getPlaca()+"\t"+objAv.getMarca()+"\t"+objAv.getAñoFab()+"\t"+objAv.getValorcmp()+"\t"+objAv.getCln()+"\t"+pag+"\n";
            JOptionPane.showMessageDialog(null, new JTextArea(cad));
        }
        int total=objReg.getValoreight()+objReg.getValorten()+objReg.getValortwelve()+objReg.getValorothers();
        JOptionPane.showMessageDialog(null, "En total, todos los aviones de la empresa pagaron: "+total+", repartidos en los siguientes grupos: ");
        String eight="Id\tPlaca\tMarca\tAñoFab\tValorCompra\tCntCilindros\n";
        String ten="Id\tPlaca\tMarca\tAñoFab\tValorCompra\tCntCilindros\n";
        String twelve="Id\tPlaca\tMarca\tAñoFab\tValorCompra\tCntCilindros\n";
        String others="Id\tPlaca\tMarca\tAñoFab\tValorCompra\tCntCilindros\n";
        for (Avion reg: objReg.getAvioneseight()){
            eight+=reg.getId()+"\t"+reg.getPlaca()+"\t"+reg.getMarca()+"\t"+reg.getPlaca()+"\t"+reg.getAñoFab()+"\t"+reg.getValorcmp()+"\t"+reg.getCln()+"\n";   
        }
        for (Avion reg: objReg.getAvionesten()){
            ten+=reg.getId()+"\t"+reg.getPlaca()+"\t"+reg.getMarca()+"\t"+reg.getAñoFab()+"\t"+reg.getValorcmp()+"\t"+reg.getCln()+"\n";   
        }
        for (Avion reg: objReg.getAvionestwelve()){
            twelve+=reg.getId()+"\t"+reg.getPlaca()+"\t"+reg.getMarca()+"\t"+reg.getAñoFab()+"\t"+reg.getValorcmp()+"\t"+reg.getCln()+"\n";   
        }
        for (Avion reg: objReg.getAvionesothers()){
            others+=reg.getId()+"\t"+reg.getPlaca()+"\t"+reg.getMarca()+"\t"+reg.getAñoFab()+"\t"+reg.getValorcmp()+"\t"+reg.getCln()+"\n";   
        }
        JOptionPane.showMessageDialog(null, "Aviones de 8 Cilindros:");
        JOptionPane.showMessageDialog(null, new JTextArea(eight));
        JOptionPane.showMessageDialog(null, "Aviones de 10 Cilindros:");
        JOptionPane.showMessageDialog(null, new JTextArea(ten));
        JOptionPane.showMessageDialog(null, "Aviones de 12 Cilindros:");
        JOptionPane.showMessageDialog(null, new JTextArea(twelve));
        JOptionPane.showMessageDialog(null, "Aviones de distintos Cilindros:");
        JOptionPane.showMessageDialog(null, new JTextArea(others));
    }
}
