package com.mentoria.aula1;

public class Exercicio1 {
    public void exe1() {
        //Exercicio1 - Hora do exercício
        int x, y, z;
        x = y = 10;
        z = ++x;
        x = -x;
        y++;
        x = x + y - (z--);
        System.out.println("x = " + x);
    }

    public void exe2() {
        int c, anterior, atual, proximo;
        anterior = 0;
        atual = 1;
        for (c = 1; c <= 8; c++) {
            System.out.println(atual);
            proximo = anterior + atual;
            anterior = atual;
            atual = proximo;
        }
    }
}
