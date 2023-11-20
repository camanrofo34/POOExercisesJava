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
public class Letras {
    
                
    public static int numeroAleatorioEnRango(int minimo, int maximo) {
        return ThreadLocalRandom.current().nextInt(minimo, maximo + 1);
    }
    
    public String devolver(){
        String [] abecedario = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"}; 
        int indiceA=numeroAleatorioEnRango(0, abecedario.length - 1);
        String letraAleatoria = abecedario[indiceA];
        return letraAleatoria;
    }
}
