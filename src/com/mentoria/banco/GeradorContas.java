package com.mentoria.banco;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by Silas Silva on 13/04/2015.
 */
public class GeradorContas {
    public void gerarContas() {
        Conta cont1 = new Conta();
        Conta cont2 = new Conta();

        cont1.setDono("Paulo");
        cont1.setCPF("000.000.000-00");

        cont2.setDono("Tiago");
        cont2.setCPF("000.000.000-00");


        //ArrayList<String> ArrayConta = new ArrayList<String>();
        //ArrayConta.add(cont1);
        //ArrayConta.add(cont2.getDono());

    }
}
