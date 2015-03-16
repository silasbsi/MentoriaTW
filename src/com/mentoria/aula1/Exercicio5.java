package com.mentoria.aula1;

import java.util.Scanner;

/**
 * Created by Silas Silva on 18/02/2015.
 */
public class Exercicio5 {
    public void exe1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("X: ");
        int x = sc.nextInt();

        while (x > 2) {
            if (x % 2 != 1) {
                x /= 2;
            } else {
                x = 3 * x + 1;
            }
            System.out.print(x + " -> ");
        }
        System.out.print("1");
    }
}
