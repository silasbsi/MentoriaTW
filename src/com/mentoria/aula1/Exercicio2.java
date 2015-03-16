package com.mentoria.aula1;

import java.util.Scanner;

public class Exercicio2 {
    public void exe1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Lado A: ");
        int ladoA = sc.nextInt();

        System.out.print("Lado B: ");
        int ladoB = sc.nextInt();

        System.out.print("Lado C: ");
        int ladoC = sc.nextInt();

        //Equilátero
        if ((ladoA < ladoB + ladoC) && (ladoB < ladoA + ladoC) && (ladoC < ladoA + ladoB)) {
            if ((ladoA == ladoB) && (ladoA == ladoC)) {
                System.out.println("O triângulo é Equilátero!");
            } else if ((ladoA == ladoB) || (ladoA == ladoC)) {
                System.out.println("O triângulo é Isósceles!");
            } else {
                System.out.println("O triângulo é Escaleno!");
            }
        } else {
            System.out.println("Não é um triângulo!");
        }
    }
}
