package com.mentoria.aula3;

/**
 * Created by Silas Silva on 31/03/2015.
 */
public class Data {
    int dia;
    int mes;
    int ano;

    public String formataData() {
        int dia = this.dia;
        int mes = this.mes;
        int ano = this.ano;

        String dataFormatada = dia + "/" + mes + "/" + ano;

        return dataFormatada;
    }
}
