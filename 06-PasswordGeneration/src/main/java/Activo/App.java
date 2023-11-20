/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Activo;
import Bases.Letras;
import static Bases.Letras.numeroAleatorioEnRango;
import Bases.Numeros;
import Bases.Simbolos;
import Bases.Contraseña;
import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JOptionPane;
/**
 *
 * @author Personal
 */
public class App {
    static Letras objLtr = new Letras();
    static Numeros objNmr = new Numeros();
    static Simbolos objSmb = new Simbolos();
    public static void main(String[] args) {
        
        
        int i;
        String Contraseña = "";
        do{
        i=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese de cuántos carácteres quiere su contraseña, recuerda que debe ser mayor o igual a 8 y menor o igual a 16"));
        } while(i<8 || i>16);
        for (int j=0; j<i; j++){
            int indiceA=numeroAleatorioEnRango(1, 3);
            switch (indiceA){
                case 1:
                    Contraseña+=objLtr.devolver();
                    break;
                case 2:
                    Contraseña+=objNmr.devolver();
                    break;
                case 3:
                    Contraseña+=objSmb.devolver();
                    break;
                default:
                    break;
            }
        }
        JOptionPane.showMessageDialog(null, "Su contraseña generada fue: "+Contraseña);
    
}
public static int numeroAleatorioEnRango(int minimo, int maximo) {
        return ThreadLocalRandom.current().nextInt(minimo, maximo + 1);
    }    
}
