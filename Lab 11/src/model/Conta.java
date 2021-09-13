package model;

import java.util.HashMap;

public abstract class Conta {

	private Integer numeroDeConta;
	protected Double saldo;

	public Conta() {

	}

	public Conta(int numeroDeConta) {

		this.numeroDeConta = numeroDeConta;
		saldo = (double) 0;

	}

	public Integer getNumeroDeConta() {
		return numeroDeConta;
	}
	
	public void setNumeroDeConta(Integer numeroDeConta) {
		this.numeroDeConta = numeroDeConta;
	}

	public Double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
		
	public abstract void depositar(HashMap<Integer, Double> contaSaldo, Double montante, Integer numeroDeCont);

	public abstract void sacar(HashMap<Integer, Double> contaSaldo, Double montante, Integer numeroDeConta);
	
	public abstract void consultar(HashMap<Integer, String> contaCliente, HashMap<Integer, Double> contaSaldo,
			Integer numeroDeConta);

}
