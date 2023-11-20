/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Operaciones;

/**
 *
 * @author Personal
 */
public class Operaciones {
    public int sumatoria(int cns, int valor){
        return cns + valor;
    }
    public int diferencia(int cns, int valor){
        return cns - valor;
    }
    public int multiplo(int cns, int valor){
        return cns * valor;
    }
    public int resDiv(int cns, int valor){
        return cns / valor;
    }
    public int fact(int cns){
        int cnt;
        cnt=1;
        for (int i=1; i<cns; i++){
            cnt*=i;
        }
        return cnt;
    }
}
