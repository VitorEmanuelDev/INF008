package model;

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
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
		
	public abstract void depositar(double montante);

	public abstract void sacar(double montante);
	
	public abstract void consultar(Integer numeroDeConta);


}
