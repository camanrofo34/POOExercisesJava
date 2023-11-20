/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.b;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int d = scanner.nextInt();
        int c = scanner.nextInt();
        int r = scanner.nextInt();
        int mayor;

        if (c > r) {
            mayor = c;
        } else {
            mayor = r;
        }

        int[] gastar = new int[mayor];
        int[] revitalizar = new int[mayor];
        int otro = 0;

        for (int i = 0; i < c; i++) {
            gastar[i] = scanner.nextInt();
        }

        for (int i = 0; i < r; i++) {
            revitalizar[i] = scanner.nextInt();
        }

        for (int i = 0; i < mayor; i++) {
            if (i < c && gastar[i] != 0) {
                if (d > gastar[i]) {
                    otro += 1;
                    d -= gastar[i];
                    gastar[i] = 0;
                }
            }
            if (i < r && revitalizar[i] != 0) {
                d += revitalizar[i];
                otro += 1;
                revitalizar[i] = 0;
            }
        }
        System.out.print(otro);
    }
}
