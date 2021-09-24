package model;

public class Corrente extends Conta{

	public Corrente() {

	}

	public Corrente(Integer numero, double saldo) {
		super(numero, saldo);
	}

	@Override
	public Double calcularTotal(Cliente[] lista) {
		Double total = (double) 0;
		for(int i = 0; i < lista.length; i++) {
			total += lista[i].getConta().getSaldo();
		}	
		return total;
	}

	@Override
	public void calcularTaxa(Cliente[] lista) {
		Double novoSaldo = null;
		for(int i = 0; i < lista.length; i++) {
			novoSaldo = lista[i].getConta().getSaldo() - 1;
			lista[i].getConta().setSaldo(novoSaldo);
		}	
	}


	@Override
	public void depositar(Double montante, Integer numero, Cliente[] lista) {

		for(int i = 0; i < lista.length; i++) {	
			
			if(lista[i].getConta().getNumeroDeConta().equals(numero)) {

				Double saldoAnterior = lista[i].getConta().getSaldo();
				System.out.println(lista[i].getConta().getSaldo());

				System.out.println("Saldo anterior: " + saldoAnterior);
				lista[i].getConta().setSaldo(montante + saldoAnterior);
				System.out.println("Saldo atual: " + lista[i].getConta().getSaldo());


			}else 				
				continue;
		}
	}

	@Override
	public void sacar(Double montante, Integer numero, Cliente[] lista) {

		for(int i = 0; i < lista.length; i++) {
			
			if(lista[i].getConta().getNumeroDeConta().equals(numero) && montante <= lista[i].getConta().getSaldo()) {

				Double saldoAnterior = lista[i].getConta().getSaldo();

				System.out.println("Saldo anterior: " + saldoAnterior);
				Double saldoAtual = saldoAnterior - montante;
				lista[i].getConta().setSaldo(saldoAtual);
				System.out.println("Saldo atual: " + lista[i].getConta().getSaldo());


			}else 				
				continue;
		}
	}


	@Override
	public void consultar(Integer numero, Cliente[] lista) {
		
		for(int i = 0; i < lista.length; i++) {
			
			if(lista[i].getConta().getNumeroDeConta().equals(numero)) {
				System.out.println("Olá, " + lista[i].getNome());
			}else {
				
				continue;
				
			}
			if(lista[i].getConta().getNumeroDeConta().equals(numero)) {
				System.out.println("Você tem atualmente: " + lista[i].getConta().getSaldo());
			}else 				
				continue;
		}
	}

}

