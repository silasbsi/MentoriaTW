package com.mentoria.aula1;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by Silas Silva on 18/02/2015.
 */
public class Exercicio6 {
    public void exe1() throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Data de nascimento (dd/mm/aaaa): ");
        String dataNascimento = sc.nextLine();

        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Date data1 = df.parse(dataNascimento); // Capturando a data digitada
        Date data2 = new Date(); // Capturando a data atual

        Calendar cal1 = Calendar.getInstance();
        Calendar cal2 = Calendar.getInstance();

        cal1.setTime(data1);
        cal2.setTime(data2);

        int ano1 = cal1.get(Calendar.YEAR);
        int ano2 = cal2.get(Calendar.YEAR);
        int mes1 = cal1.get(Calendar.MONTH);
        int mes2 = cal2.get(Calendar.MONTH);
        int dia1 = cal1.get(Calendar.DAY_OF_MONTH);
        int dia2 = cal2.get(Calendar.DAY_OF_MONTH);

        int idade = ano2 - ano1;

        if ((mes2 < mes1) || (mes2 == mes1) && (dia2 < dia1)) {
            idade -= 1;
        }

        System.out.println(idade + " anos.");

        if (idade < 5) {
            System.out.println("Muito jovem para competir.");
        } else if (idade >= 5 && idade <= 7) {
            System.out.println("O nadador está na categoria infantil A.");
        } else if (idade >= 8 && idade <= 10) {
            System.out.println("O nadador está na categoria infantil B.");
        } else if (idade >= 11 && idade <= 13) {
            System.out.println("O nadador está na categoria juvenil A.");
        } else if (idade >= 14 && idade <= 17) {
            System.out.println("O nadador está na categoria juvenil B.");
        } else {
            System.out.println("O nadador está na categoria adulto.");
        }
    }
}
