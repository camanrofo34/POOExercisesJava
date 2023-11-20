/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.e;

import java.util.Scanner;

/**
 *
 * @author Personal
 */
public class E {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int k=scanner.nextInt();
        int total=0;
        int consexo;
        String [] polen = new String[k];
        for (int i=0; i<n; i++){
            String e=scanner.next();
            polen[i]=e;
            total+=Integer.parseInt(e);
        }
        int i=0, j=0;
        for(int a=0; a<k; a++){
        do{
            int control=0;
            int d=polen[i].length();
            for(int l=0; l<d; l++){
            String num = String.valueOf(polen[i].charAt(l));
            control+=Integer.parseInt(num);
            }
            polen[i]=Integer.toString(Integer.parseInt(polen[i])-control);
            j+=1;
            if (j==k) break;
            if (Integer.parseInt(polen[i])==0) j+=1;
        }while(Integer.parseInt(polen[i])!=0);
        }
    }
}
