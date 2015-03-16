package com.mentoria.aula1;

import java.util.Scanner;

public class Exercicio7 {
    public void exe1() {
        System.out.println("Calculadora!!!");
        System.out.println("1 - Somar");
        System.out.println("2 - Mutiplicar");
        System.out.println("3 - Dividir");
        System.out.println("4 - Subtrair");
        System.out.println("0 - Sair");

        int op;
        double num1;
        double num2;
        double resultado;

        do {
            Scanner sc = new Scanner(System.in);
            System.out.print("Escolha uma opção: ");
            op = sc.nextInt();

            Scanner calc = new Scanner(System.in);
            if (op == 1) {
                System.out.println("Somar");
                System.out.print("1º Número: ");
                num1 = calc.nextDouble();

                System.out.print("2º Número: ");
                num2 = calc.nextDouble();

                resultado = num1 + num2;

                System.out.println(num1 + " + " + num2 + " = " + resultado);
            } else if (op == 2) {
                System.out.println("Multiplicar");
                System.out.print("1º Número: ");
                num1 = calc.nextDouble();

                System.out.print("2º Número: ");
                num2 = calc.nextDouble();

                resultado = num1 * num2;

                System.out.println(num1 + " X " + num2 + " = " + resultado);
            } else if (op == 3) {
                System.out.println("Dividir");
                System.out.print("1º Número: ");
                num1 = calc.nextDouble();

                System.out.print("2º Número: ");
                num2 = calc.nextDouble();

                resultado = num1 / num2;

                System.out.println(num1 + " / " + num2 + " = " + resultado);
            } else if (op == 4) {
                System.out.println("Subtrair");
                System.out.print("1º Número: ");
                num1 = calc.nextDouble();

                System.out.print("2º Número: ");
                num2 = calc.nextDouble();

                resultado = num1 - num2;

                System.out.println(num1 + " - " + num2 + " = " + resultado);
            }

        } while (op != 0);

        System.out.println("Calculadora encerrada!");
    }
}
