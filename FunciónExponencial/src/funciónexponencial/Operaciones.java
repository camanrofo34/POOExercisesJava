/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funciónexponencial;

/**
 *
 * @author Personal
 */
public class Operaciones {
    public int getFct(int nf){
        int i, f=1;
        for (i=2; i<=nf; i++){
            f=f*i;
        }
        return f;
    }
}
