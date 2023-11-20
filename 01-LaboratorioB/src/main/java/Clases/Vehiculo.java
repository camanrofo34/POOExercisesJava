/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Personal
 */
public class Vehiculo {
    String NmPr, Placa;

    public Vehiculo() {
    }

    public Vehiculo(String NmPr, String Placa) {
        this.NmPr = NmPr;
        this.Placa = Placa;
    }

    public String getNmPr() {
        return NmPr;
    }

    public String getPlaca() {
        return Placa;
    }

    public void setNmPr(String NmPr) {
        this.NmPr = NmPr;
    }

    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }
    
    
}
