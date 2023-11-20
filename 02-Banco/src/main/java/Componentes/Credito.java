/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Componentes;


/**
 *
 * @author Personal
 */
public class Credito {

    public Credito() {
    }
    public String Nombre;
    public int NoCuo, CuoPag;
    public double MontoIni, MontoAct;

    public Credito(String Nombre, int NoCuo, int CuoPag, double MontoIni, double MontoAct) {
        this.Nombre = Nombre;
        this.NoCuo = NoCuo;
        this.CuoPag = CuoPag;
        this.MontoIni = MontoIni;
        this.MontoAct = MontoAct;
    }

    public String getNombre() {
        return Nombre;
    }

    public int getNoCuo() {
        return NoCuo;
    }

    public int getCuoPag() {
        return CuoPag;
    }

    public double getMontoIni() {
        return MontoIni;
    }

    public double getMontoAct() {
        return MontoAct;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setNoCuo(int NoCuo) {
        this.NoCuo = NoCuo;
    }

    public void setCuoPag(int CuoPag) {
        this.CuoPag = CuoPag;
    }

    public void setMontoIni(double MontoIni) {
        this.MontoIni = MontoIni;
    }

    public void setMontoAct(double MontoAct) {
        this.MontoAct = MontoAct;
    }
    
    
}
