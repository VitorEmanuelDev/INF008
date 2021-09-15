package model;

import java.util.HashMap;

public abstract class Conta {

	protected Integer numeroDeConta;
	protected Double saldo;

	public Conta() {

	}

	public Conta(Integer numeroDeConta, Double saldo) {

		this.numeroDeConta = numeroDeConta;
		this.saldo = saldo;

	}
	
	public void setNumeroDeConta(Integer numeroDeConta) {
		this.numeroDeConta = numeroDeConta;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Integer getNumeroDeConta() {
		return numeroDeConta;
	}
	
	public Double getSaldo() {
		return saldo;
	}
			
	public abstract void depositar(HashMap<Integer, Double> contaSaldo, Double montante, Integer numeroDeCont);

	public abstract void sacar(HashMap<Integer, Double> contaSaldo, Double montante, Integer numeroDeConta);
	
	public abstract void consultar(HashMap<Integer, String> contaCliente, HashMap<Integer, Double> contaSaldo,
			Integer numeroDeConta);
	public abstract Double calcularTotal(HashMap<Integer, Double> contaSaldo);
	
	public abstract void calcularTaxa(HashMap<Integer, Double> contaSaldo);

}
