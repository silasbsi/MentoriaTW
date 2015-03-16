package com.mentoria.aula1;

public class Exercicio3 {
    public void exe1() {
        int numero = 1;
        int somaPar = 0;
        int somaImpar = 0;
        int limite = 100;

        while (numero <= limite) {
            if (numero % 2 == 1) {
                somaImpar += numero;
            } else {
                somaPar += numero;
            }
            numero++;
        }

        System.out.println("Soma dos número pares de 1 até " + limite + " é: " + somaPar); // Usar String.format para concatenar
        System.out.println("Soma dos número ímpares de 1 até " + limite + " é: " + somaImpar);
    }

    public void exe2() {

        int somaPar = 0;
        int somaImpar = 0;
        int limite = 100;

        for (int numero = 1; numero <= limite; numero++) {
            if (numero % 2 == 1) {
                somaImpar += numero;
            } else {
                somaPar += numero;
            }
        }

        System.out.println("Soma dos número pares de 1 até " + limite + " é: " + somaPar);
        System.out.println("Soma dos número ímpares de 1 até " + limite + " é: " + somaImpar);
    }
}
