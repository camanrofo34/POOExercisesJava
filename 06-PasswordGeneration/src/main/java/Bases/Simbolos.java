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
public class Simbolos {
                    
    public static int numeroAleatorioEnRango(int minimo, int maximo) {
        return ThreadLocalRandom.current().nextInt(minimo, maximo + 1);
    }
    
    public String devolver(){
        String [] simbolos = {"!", "@", "#", "$", "%", "&", "*", "(", ")", "-", "_", "=", "+", "[", "]", "{", "}", ";", ":", ",", ".", "/", "?", "<", ">", "|"}; 
        int indiceA=numeroAleatorioEnRango(0, simbolos.length - 1);
        String simboloAleatorio = simbolos[indiceA];
        return simboloAleatorio;
    }
}
