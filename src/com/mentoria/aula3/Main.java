package com.mentoria.aula3;

/**
 * Created by Silas Silva on 31/03/2015.
 */
public class Main {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();

        Data data = new Data();
        data.dia = 10;
        data.mes = 02;
        data.ano = 1998;

        f1.nome = "Hugo";
        f1.departamento = "Informatica - TI";
        f1.salario = 100;
        f1.dataEntrada = data;
        f1.rg = "7.056.403";
        f1.recebeAumento(50);

        f1.mostra();

        //Funcionario f2 = new Funcionario();
        //f2.nome = "Hugo";
        //f2.salario = 100;

        //Funcionario f2 = f1;
        /*
        if (f1 == f2) {
            System.out.println("Iguais");
        } else {
            System.out.println("Diferentes");
        }
        */
    }
}
