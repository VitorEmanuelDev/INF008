package model;

public class Cliente {

	private String nome;
	private Conta conta;

	public Cliente() {

	}
	
	public Cliente(String nome, Conta conta) {	
		this.nome = nome;
		this.conta = conta;	
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Conta getConta() {
		return conta;
	}

	public void setConta(Integer numeroDeConta, double saldo) {	
		conta.setNumeroDeConta(numeroDeConta);
		conta.setSaldo(saldo);
	}



}
