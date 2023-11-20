/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Personal
 */
public class Avion {
    String Id, placa, marca, añoFab, valorcmp;
    int cln;

    public Avion() {
    }

    public Avion(String Id, String placa, String marca, String añoFab, String valorcmp, int cln) {
        this.Id = Id;
        this.placa = placa;
        this.marca = marca;
        this.añoFab = añoFab;
        this.valorcmp = valorcmp;
        this.cln = cln;
    }

    public String getId() {
        return Id;
    }

    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public String getAñoFab() {
        return añoFab;
    }

    public String getValorcmp() {
        return valorcmp;
    }

    public int getCln() {
        return cln;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setAñoFab(String añoFab) {
        this.añoFab = añoFab;
    }

    public void setValorcmp(String valorcmp) {
        this.valorcmp = valorcmp;
    }

    public void setCln(int cln) {
        this.cln = cln;
    }
    
}
