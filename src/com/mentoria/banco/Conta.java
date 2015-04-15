package com.mentoria.banco;

public class Conta {
	private String dono = "Silas";
	private String cpf = "000.000.000-00";
	private double saldo = 1000.0;

	//Dono
	public String getDono() {
		return this.dono;
	}
	public void setDono(String nome) {
		this.dono = nome;
	}
	
	//CPF
	public String getCPF() {
		return this.cpf;
	}
	public void setCPF(String cpf) {
		this.cpf = cpf;
	}
	
	//Saldo
	public double getSaldo() {
		return this.saldo;
	}
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public boolean transfere(Conta conta, double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			conta.saldo += valor;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}

    public void consultaNotas(double valor) {
        int resto = 0, quantidadeCem = 0, quantidadeCinquenta = 0, quantidadeVinte = 0,
                quantidadeDez = 0, quantidadeCinco = 0, quantidadeDois = 0, quantidadeUm = 0;

        if (valor >= 100) {
            quantidadeCem = (int)valor / 100;
            resto = (int)valor % 100;
            valor = resto;
        }
        if (valor >= 50) {
            quantidadeCinquenta = (int)valor / 50;
            resto = (int)valor % 50;
            valor = resto;
        }
        if (valor >= 20) {
            quantidadeVinte = (int)valor / 20;
            resto = (int)valor % 20;
            valor = resto;
        }
        if (valor >= 10) {
            quantidadeDez = (int)valor / 10;
            resto = (int)valor % 10;
            valor = resto;
        }
        if (valor >= 5) {
            quantidadeCinco = (int)valor / 5;
            resto = (int)valor % 5;
            valor = resto;
        }
        if (valor >= 2){
            quantidadeDois = (int)valor / 2;
            resto = (int)valor % 2;
            valor = resto;
        }
        if (valor >= 1) {
            quantidadeUm = (int)valor / 1;
            resto = (int)valor % 2;
            valor = resto;
        }

        System.out.println(quantidadeCem + " notas de 100");
        System.out.println(quantidadeCinquenta + " notas de 50");
        System.out.println(quantidadeVinte + " notas de 20");
        System.out.println(quantidadeDez + " notas de 10");
        System.out.println(quantidadeCinco + " notas de 5");
        System.out.println(quantidadeDois + " notas de 2");
        System.out.println(quantidadeUm + " moeda de 1");

    }

}
