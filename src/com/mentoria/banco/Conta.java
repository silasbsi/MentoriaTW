package com.mentoria.banco;

public class Conta {
	private String dono = "Silas";
	private String cpf = "068.529.104-90";
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
	
	
	
}
