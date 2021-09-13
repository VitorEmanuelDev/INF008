package model;

import java.util.HashMap;

public class ContaCorrente extends Conta{

	private final Double TAXA = (double) 1;

	public ContaCorrente() {
		super();
	}

	public ContaCorrente(int numeroDeConta, Double taxa) {

		super(numeroDeConta);

	}

	public void cobrarTaxa(HashMap<Integer, Double> contaSaldo) {
		String data = java.time.LocalDate.now().toString();
		if(data.charAt(8) == '0' && data.charAt(9) == '1') {

			for (HashMap.Entry conta : contaSaldo.entrySet()) {
				Double saldoAtual = (Double) conta.getValue();
				saldoAtual -= TAXA; 
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


		}else {

			System.out.println("Conta não encontrada");
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


			}else {

				System.out.println("Conta não encontrada");
			}


		}else {

			System.out.println("Não é possível sacar um valor negativo");
		}

	}

	@Override
	public void consultar(HashMap<Integer, String> contaCliente, HashMap<Integer, Double> contaSaldo, Integer numeroDeConta) {

		if(contaSaldo.containsKey(numeroDeConta)) {
			System.out.println("Olá, " + contaCliente.get(numeroDeConta));
		}
		if(contaSaldo.containsKey(numeroDeConta)) {
			System.out.println("Você tem atualmente: " + contaSaldo.get(numeroDeConta));
		}

	}

	@Override
	public Double calcularTotal(HashMap<Integer, Double> contaSaldo) {
		Double total = (double) 0;
		for (HashMap.Entry conta : contaSaldo.entrySet()) {
			total += (Double) conta.getValue();			
		}
		
		return total;
	}
	
	

}
