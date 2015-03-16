package com.mentoria.aula2;

import java.lang.System;import java.util.Scanner;

/**
 * Created by Silas Silva on 04/03/2015.
 */
public class Exercicio3 {
    public void exe3(){
        int[] arrayExe3 = new int[10];
        int cont = 0;
        int num, numValor;
        boolean existe = false;

        while(cont < arrayExe3.length){
            Scanner sc = new Scanner(System.in);
            System.out.printf("Digitar um número %d: ", cont+1);
            num = sc.nextInt();

            arrayExe3[cont] = num;

            cont++;
        }

        Scanner sc = new Scanner(System.in);
        System.out.printf("Digitar valor da pesquisa: ", cont+1);
        numValor = sc.nextInt();

        for (int dados : arrayExe3){
            if (dados == numValor){
                existe = true;
            }
        }

        if (existe){
            System.out.printf("%d está no array.", numValor);
        }else{
            System.out.printf("%d não está no array.", numValor);
        }
    }
}
