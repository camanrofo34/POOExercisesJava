/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Componentes;


/**
 *
 * @author Personal
 */
public class Cajero {
    public int billete10, billete20, billete50;
    public Cajero(){
        
    }
    public Cajero(int billete10, int billete20, int billete50) {
        this.billete10 = billete10;
        this.billete20 = billete20;
        this.billete50 = billete50;
    }
    

    public int getBillete10() {
        return billete10;
    }

    public int getBillete20() {
        return billete20;
    }

    public int getBillete50() {
        return billete50;
    }

    public void setBillete10(int billete10) {
        this.billete10 = billete10;
    }

    public void setBillete20(int billete20) {
        this.billete20 = billete20;
    }

    public void setBillete50(int billete50) {
        this.billete50 = billete50;
    }
    
    
    public int Total (int value){
        int t50, t20, t10, total;     
        t50=(int)value/50;
        t20=(int)((value%50)/20);
        t10=(int)(((value%50)%20)/10);
        total=t50+t20+t10;
        this.billete10=t10;
        this.billete20=t20;
        this.billete50=t50;
        return total;
    }
}
