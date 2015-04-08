package com.mentoria.aula3;

/**
 * Created by Silas Silva on 31/03/2015.
 */
public class Funcionario {
    String nome;
    String departamento;
    double salario;
    Data dataEntrada;
    String rg;

    void recebeAumento(double aumento) {
        this.salario += aumento;
    }

    double calculaGanhoAnual(){
        double ganhoAnual = this.salario * 12;
        return ganhoAnual;
    }

    void mostra() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Departamento: " + this.departamento);
        System.out.println("Salario: " + this.salario);
        System.out.println("Data de Entrada: " + this.dataEntrada.formataData());
        System.out.println("RG: " + this.rg);
        System.out.println("Ganho anual: " + this.calculaGanhoAnual());
    }


}
