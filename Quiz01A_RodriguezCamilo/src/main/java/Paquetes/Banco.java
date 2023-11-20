/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquetes;

/**
 *
 * @author Personal
 */
public class Banco {
    String NoCuenta;
    int MontoActual;

    public Banco() {
    }

    public Banco(int MontoActual, String NoCuenta) {
        this.MontoActual = MontoActual;
        this.NoCuenta = NoCuenta;
    }



    public int getMontoActual() {
        return MontoActual;
    }

    public String getNoCuenta() {
        return NoCuenta;
    }
    




    public void setMontoActual(int MontoActual) {
        this.MontoActual = MontoActual;
    }

    public void setNoCuenta(String NoCuenta) {
        this.NoCuenta = NoCuenta;
    }
    
    public void Retirar(int vlr){
        MontoActual-=vlr;
    }
    public void Consignar(int vlr){
        MontoActual+=vlr;
    }
    
    


}

