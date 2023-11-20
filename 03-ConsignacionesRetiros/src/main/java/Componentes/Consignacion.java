/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Componentes;

/**
 *
 * @author Personal
 */
public class Consignacion {
    static Banco objBanco;
    public void Consignar(int vlr){
        objBanco.MontoActual+=vlr;
    }
            
}
