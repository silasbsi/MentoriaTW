package com.mentoria.aula2;

import java.lang.System;import java.util.Scanner;

/**
 * Created by Silas Silva on 04/03/2015.
 */
public class Exercicio4 {
    public void exe4(){
        int[] arrayExe4 = new int[10];
        int num, numMaior = 0, indice = 0;

        for (int i = 0; i < arrayExe4.length; i++){
            Scanner sc = new Scanner(System.in);
            System.out.printf("Digitar um número %d: ", i+1);
            num = sc.nextInt();

            arrayExe4[i] = num;
        }

        for (int j = 0; j < arrayExe4.length; j++) {
            if (j == 0) {
                numMaior = arrayExe4[j];
                indice = j;
            }else{
                if (arrayExe4[j] > arrayExe4[j-1]){
                    numMaior = arrayExe4[j];
                    indice = j;
                }
            }
        }

        System.out.printf("Maior número: %d\nIndice: %d", numMaior, indice);
    }
}
