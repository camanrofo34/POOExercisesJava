/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Instructor;
import Clases.Y;
import javax.swing.JOptionPane;

/**
 *
 * @author Personal
 */
public class Quiz1 {
    static Y X = new Y();
    public static void main(String[] args) {
        String entry;
        entry=JOptionPane.showInputDialog(null, "Ingresa algo miamor <3");
        JOptionPane.showMessageDialog(null, "Su mensaje fue: "+entry);
        X.hacer();
        X.hacer(1);
        X.hacer("Hola");
        X.hacer();
    }
}
