/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pruebamaraton;

import java.util.Scanner;



public class PruebaMaraton {
    public static void main(String[] args) {
    int contador=0;
    Scanner scanner = new Scanner(System.in);
    int i = scanner.nextInt();
    int estatura=scanner.nextInt(); 
    for (int j=0; j<i; j++){
        int comparar=scanner.nextInt();
        if (estatura>=comparar) contador++;
    }
    System.out.print(contador);
    }
}