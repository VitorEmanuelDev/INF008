package model;

import java.util.HashMap;

public abstract class Conta {

	protected Integer numeroDeConta;
	protected Double saldo;
	protected Cliente[] lista = null;

	public Conta() {

	}

	public Conta(Integer numeroDeConta, Double saldo) {

		this.numeroDeConta = numeroDeConta;
		this.saldo = saldo;

	}
	
	public void setNumeroDeConta(Integer numeroDeConta) {
		this.numeroDeConta = numeroDeConta;
	}

	public Double setSaldo(Double saldo) {
		return this.saldo = saldo;
	}

	public Integer getNumeroDeConta() {
		return numeroDeConta;
	}
	
	public Double getSaldo() {
		return saldo;
	}
			
	
	public Cliente[] getLista() {
		return lista;
	}

	public void setLista(Cliente[] lista) {
		setLista(lista);
	}

	public abstract void depositar(Double montante, Integer numero, Cliente[] lista);

	public abstract void sacar(Double montante, Integer numero, Cliente[] lista);
	
	public abstract void consultar(Integer numero, Cliente[] lista);
	public abstract Double calcularTotal(Cliente[] lista);
	
	public abstract void calcularTaxa(Cliente[] lista);

}
