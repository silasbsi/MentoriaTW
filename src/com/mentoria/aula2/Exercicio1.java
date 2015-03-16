package com.mentoria.aula2;

import java.lang.System;public class Exercicio1 {
    public void a() {
        int[] arrayA = new int[10];
        int tamArray = arrayA.length;

        for (int i = 0; i < tamArray; i++) {
            arrayA[i] = tamArray - i;
        }

        for (int j : arrayA) {
            System.out.printf("%d ", j);
        }
    }

    public void b() {
        int[] arrayB = new int[11];
        for (int i = 0; i <= arrayB.length; i++){
            arrayB[i] = i * i;
        }

        for (int x : arrayB ) {
            System.out.printf("%d ", x);
        }
    }

    public void c() {
        int[] arrayC = new int[10];

        for (int i = 0; i < arrayC.length; i++){
            if (i < 5) {
                arrayC[i] = i+1;
            } else {
                arrayC[i] = arrayC[i-5] * 10;
            }
        }

        for (int x : arrayC ) {
            System.out.printf("%d ", x);
        }
    }

    public void d(){
        int[] arrayD = new int[10];

        for (int i = 0; i < arrayD.length; i++){
            if (i == 0) {
                arrayD[i] = 3;
            } else {
                arrayD[i] = arrayD[i-1] + (2*i -1);
            }
        }

        for (int x : arrayD ) {
            System.out.printf("%d ", x);
        }
    }
}
