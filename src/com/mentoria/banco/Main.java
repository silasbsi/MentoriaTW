package com.mentoria.banco;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {		
		int op;

        Conta conta = new Conta();


		do {
			System.out.println("\nAjuda Banqueiro");
			System.out.println("1 - Sacar");
			System.out.println("2 - Depositar");
			System.out.println("3 - Transferencia");
			System.out.println("4 - Consultar Notas");
			System.out.println("5 - Verificar Caixa");
			System.out.println("6 - Sair\n");

			Scanner scanner = new Scanner(System.in);
			System.out.print("Opcao: ");
			op = scanner.nextInt();

			if (op == 1) {
				System.out.print("Valor de saque: ");
				double valor = scanner.nextDouble();
				boolean saca = conta.saca(valor);

				if (saca) {
					System.out.println("Saque efetuado com sucesso.");
				} else {
					System.out.println("Nao ha saldo suficiente.");
				}
			} else if (op == 2) {
				System.out.print("Valor de deposito: ");
				double valor = scanner.nextDouble();
				conta.deposita(valor);
			} else if (op == 3) {
				boolean transf = conta.transfere(conta, 100);
				
				if (transf) {
					System.out.println("Transferencia feita com sucesso.\n");
				} else { 
					System.out.println("O saldo nao e suficiente para fazer essa tranferencia.\n");
				}
			} else if (op == 4) {
                System.out.print("Valor: ");
                double valor = scanner.nextDouble();
                conta.consultaNotas(valor);


			} else if (op == 5){
				System.out.println("\n=====================");
				System.out.println("Dono: " + conta.getDono());
				System.out.println("CPF: " + conta.getCPF());
				System.out.println("Saldo: " + conta.getSaldo());
				System.out.println("=====================");
			} else {
						
				System.out.println("Fim!");				
			}
			
			
		} while (op != 6);


		
	}

}
