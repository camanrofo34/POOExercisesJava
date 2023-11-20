/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.d;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Logger;

/**
 *
 * @author Personal
 */
public class D {
    static ArrayList <coordenada> cordenadas=new ArrayList<>();
    static ArrayList <coordenada> cordenadaprimera;
    
    public static void main(String[] args) {
        
        coordenada objCor;
        Scanner scanner = new Scanner(System.in);
        
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        int[] distanciasmenores = new int[m];
        for (int i=0; i<m; i++){ 
        objCor=new coordenada(scanner.nextInt(),scanner.nextInt(),scanner.nextInt());
        cordenadas.add(objCor);
        }
        cordenadaprimera=cordenadas;
        for (coordenada cor:cordenadas){
            int []distancias=new int[m];
            int contador=0;
            int distancia=0;
            cordenadaprimera.remove(cor);
            int puntoinicio=cor.getInicio();
            int puntofinal=cor.getFin();
            for (coordenada coru:cordenadaprimera){
                if (cor.getInicio()==puntoinicio){
                    puntoinicio=cor.getInicio();
                    distancia+=cor.getDistancia();
                    if (puntoinicio==puntofinal){
                        distancias[contador]=distancia;
                    }
                else if (cor.getFin()==puntoinicio){
                    
                }
                }
            }
        }
    }
}

class coordenada {
    int inicio, fin, distancia;

    public coordenada(int inicio, int fin, int distancia) {
        this.inicio = inicio;
        this.fin = fin;
        this.distancia = distancia;
    }

    public int getInicio() {
        return inicio;
    }

    public int getFin() {
        return fin;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setInicio(int inicio) {
        this.inicio = inicio;
    }

    public void setFin(int fin) {
        this.fin = fin;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }
    
    
}
