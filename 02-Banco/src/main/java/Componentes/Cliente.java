/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Componentes;

/**
 *
 * @author Personal
 */
public class Cliente {

    public Cliente() {
    }
    public String clNombre, clId, clBrt, clGnd;
    public Cliente (String clNombre, String clId, String clBrt, String clGnd){
        this.clNombre=clNombre;
        this.clId=clId;
        this.clBrt=clBrt;
        this.clGnd=clGnd;
    }

    public String getClNombre() {
        return clNombre;
    }

    public String getClId() {
        return clId;
    }

    public String getClBrt() {
        return clBrt;
    }

    public String getClGnd() {
        return clGnd;
    }

    public void setClNombre(String clNombre) {
        this.clNombre = clNombre;
    }

    public void setClId(String clId) {
        this.clId = clId;
    }

    public void setClBrt(String clBrt) {
        this.clBrt = clBrt;
    }

    public void setClGnd(String clGnd) {
        this.clGnd = clGnd;
    }
    
}
