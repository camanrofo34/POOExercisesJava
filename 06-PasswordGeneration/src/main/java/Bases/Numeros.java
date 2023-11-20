/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bases;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Personal
 */
public class Numeros {
                    
    public static int numeroAleatorioEnRango(int minimo, int maximo) {
        return ThreadLocalRandom.current().nextInt(minimo, maximo + 1);
    }
    
    public String devolver(){
        String [] numeros = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"}; 
        int indiceA=numeroAleatorioEnRango(0, numeros.length - 1);
        String numeroAleatorio = numeros[indiceA];
        return numeroAleatorio;
    }
}
