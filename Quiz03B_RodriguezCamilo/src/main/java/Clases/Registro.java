/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.ArrayList;

/**
 *
 * @author Personal
 */
public class Registro {
    int valoreight, valorten, valortwelve, valorothers;
    public Registro() {
    }

    public Registro(int valoreight, int valorten, int valortwelve, int valorothers) {
        this.valoreight = valoreight;
        this.valorten = valorten;
        this.valortwelve = valortwelve;
        this.valorothers = valorothers;
    }

    public int getValoreight() {
        return valoreight;
    }

    public int getValorten() {
        return valorten;
    }

    public int getValortwelve() {
        return valortwelve;
    }

    public int getValorothers() {
        return valorothers;
    }

    public static ArrayList<Avion> getAvioneseight() {
        return avioneseight;
    }

    public static ArrayList<Avion> getAvionesten() {
        return avionesten;
    }

    public static ArrayList<Avion> getAvionestwelve() {
        return avionestwelve;
    }

    public static ArrayList<Avion> getAvionesothers() {
        return avionesothers;
    }
    
    
    static ArrayList<Avion> avioneseight = new ArrayList<>();
    static ArrayList<Avion> avionesten = new ArrayList<>();
    static ArrayList<Avion> avionestwelve = new ArrayList<>();
    static ArrayList<Avion> avionesothers = new ArrayList<>();
    public int eightcilinder(Avion av){
        avioneseight.add(av);   
        valoreight+=300;
        return 300;
    }
    public int tencilinder(Avion av){
        avionesten.add(av);  
        valorten+=4000;
        return 4000;
    }
    public int twelvecilinder(Avion av){
        avionestwelve.add(av);
        valortwelve+=6000;
        return 6000;
    }
    public int othercilinder(Avion av){
        avionesothers.add(av);
        valorothers+=5000;
        return 5000;
    }
}
