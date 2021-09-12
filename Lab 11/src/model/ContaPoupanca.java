package model;

public class ContaPoupanca extends Conta{

	private double juros = 1.01;

	public ContaPoupanca() {
		super();
	}

	public ContaPoupanca(int numeroDeConta, double juros) {
		super(numeroDeConta);
		this.juros = juros;

	}

	@Override
	public void depositar(double montante) {

		if(montante > 0) {

			saldo += montante;

		}else {

			System.out.println("Não é possível depositar um valor negativo");
		}

	}

	@Override
	public void sacar(double montante) {

		if(montante > 0) {

			saldo += montante;

			if(montante <= saldo) {

				saldo -= montante;

			}

		}else {

			System.out.println("Não é possível sacar um valor negativo");
		}
	}

	@Override
	public void consultar(Integer numeroDeConta) {


	}
	
	public void aplicarJuros(double montante) {


	}
	
}
