/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Componentes;

/**
 *
 * @author Personal
 */
public class Retiros{
    static Banco objBanco;
    public void Retirar(int vlr){
        objBanco.MontoActual-=vlr;
    }
    
}
