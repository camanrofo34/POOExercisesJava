/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Componentes;



/**
 *
 * @author Personal
 */     
public class Banco {
    String nombre, IdPersona;
    int MontoActual;

    public Banco() {
    }

    public Banco(String nombre, String IdPersona, int MontoActual) {
        this.nombre = nombre;
        this.IdPersona = IdPersona;
        this.MontoActual = MontoActual;

    }

    public String getNombre() {
        return nombre;
    }

    public String getIdPersona() {
        return IdPersona;
    }

    public int getMontoActual() {
        return MontoActual;
    }



    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setIdPersona(String IdPersona) {
        this.IdPersona = IdPersona;
    }

    public void setMontoActual(int MontoActual) {
        this.MontoActual = MontoActual;
    }
    public void Retirar(int vlr){
        MontoActual-=vlr;
    }
    public void Consignar(int vlr){
        MontoActual+=vlr;
    }
    
    


}
