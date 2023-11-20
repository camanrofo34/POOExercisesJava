/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Personal
 */
public class Calcular {
   
    public Calcular() {
    }

    public int CalcularTiempo(int horEnt, int horSal, int minEnt, int minSal){
        int horrest, minrest;
        horrest=horSal-horEnt;
        minrest=minSal-minEnt;
        if (minrest!=0) horrest+=1;
        else;
        return horrest;   
        
    }
    public int CalcularValor(int horrest){
        int val=4000;
        int valortotal=4000*horrest;
        return valortotal;
    }
}
