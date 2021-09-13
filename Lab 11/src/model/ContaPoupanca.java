package model;

import java.util.HashMap;

public class ContaPoupanca extends Conta{

	private Double juros = 1.01;

	public ContaPoupanca() {
		super();
	}

	public ContaPoupanca(int numeroDeConta, Double juros) {
		super(numeroDeConta);

	}


	public void aplicarJuros(HashMap<Integer, Double> contaSaldo) {
		String data = java.time.LocalDate.now().toString();
		if(data.charAt(8) == '0' && data.charAt(9) == '1') {

			for (HashMap.Entry conta : contaSaldo.entrySet()) {
				Double saldoAtual = (Double) conta.getValue();
				saldoAtual *= juros; 
				contaSaldo.put((Integer) conta.getKey(), saldoAtual);
			}
		}

	}

	@Override
	public void depositar(HashMap<Integer, Double> contaSaldo, Double montante,
			Integer numeroDeConta) {
		if(contaSaldo.containsKey(numeroDeConta)) {

			Double saldoAnterior = contaSaldo.get(numeroDeConta);

			System.out.println("Saldo anterior: " + saldoAnterior);
			contaSaldo.put(numeroDeConta, contaSaldo.get(numeroDeConta) + montante);
			System.out.println("Saldo atual: " + contaSaldo.get(numeroDeConta));


		}

	}

	@Override
	public void sacar(HashMap<Integer, Double> contaSaldo,
			Double montante, Integer numeroDeConta) {
		if(montante > 0 && montante <= saldo) {

			if(contaSaldo.containsKey(numeroDeConta)) {

				Double saldoAnterior = contaSaldo.get(numeroDeConta);

				System.out.println("Saldo anterior: " + saldoAnterior);
				contaSaldo.put(numeroDeConta, contaSaldo.get(numeroDeConta) - montante);
				System.out.println("Saldo atual: " + contaSaldo.get(numeroDeConta));


			}


		}else {

			System.out.println("Não é possível sacar um valor negativo");
		}

	}

	@Override
	public void consultar(HashMap<Integer, String> contaCliente, HashMap<Integer, Double> contaSaldo,
			Integer numeroDeConta) {

		if(contaSaldo.containsKey(numeroDeConta)) {
			System.out.println("Olá, " + contaCliente.get(numeroDeConta));
		}
		if(contaSaldo.containsKey(numeroDeConta)) {
			System.out.println("Você tem atualmente: " + contaSaldo.get(numeroDeConta));
		}

	}

}
