package com.mentoria.aula2;

import java.lang.System;import java.util.Scanner;

/**
 * Created by Silas Silva on 04/03/2015.
 */
public class Exercicio2 {
    public void exe2(){
        int num, menorDez = 0, maiorDez = 0, igualDez = 0;
        int cont = 0;

        int[] arrayExe2 = new int[10];

        while ( cont < arrayExe2.length) {
            Scanner sc = new Scanner(System.in);
            System.out.printf("Digitar um número %d: ", cont+1);
            num = sc.nextInt();

            arrayExe2[cont] = num;

            cont++;
        }

        for (int eleArray : arrayExe2){
            if (eleArray == 10){
                igualDez += 1;
            }else if(eleArray < 10){
                 menorDez += 1;
            }else{
                maiorDez += 1;
            }
        }

        System.out.printf("Quantidade de números iguais a 10: \n%d\n", igualDez);
        System.out.printf("Quantidade de números menores que 10: \n%d\n", menorDez);
        System.out.printf("Quantidade de números maiores que 10: \n%d", maiorDez);
    }
}
