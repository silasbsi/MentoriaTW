package com.mentoria.aula1;

import java.util.Scanner;

public class Exercicio4 {
    public void exe1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Idade (anos): ");
        int idadeAnos = sc.nextInt();

        System.out.print("Idade (meses): ");
        int idadeMeses = sc.nextInt();

        int ano = 365; // Dias
        int mes = 30; // Dias
        int diasAno, diasMes, idadeTotalDias, idadeTotalHoras;
        int horaDia = 24; // horas

        diasAno = idadeAnos * ano;
        diasMes = idadeMeses * mes;
        idadeTotalDias = diasAno + diasMes;

        idadeTotalHoras = idadeTotalDias * horaDia;

        System.out.println("Sua idade é de " + idadeTotalDias + " dias ou " + idadeTotalHoras + " horas.");
    }
}
