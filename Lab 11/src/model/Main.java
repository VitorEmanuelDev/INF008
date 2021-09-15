package model;

import java.util.HashMap;

public class Main {
	
	
	public static void main(String args[]) {
		
		Conta cc = new ContaCorrente(); 
		Conta cp = new ContaPoupanca();
		Cliente cliente = new Cliente();
		HashMap<Integer, String> contaClientePoupanca = new HashMap<Integer, String>();
		HashMap<Integer, Double> contaSaldoPoupanca = new HashMap<Integer, Double>();
		HashMap<Integer, String> contaClienteCorrente = new HashMap<Integer, String>();
		HashMap<Integer, Double> contaSaldoCorrente = new HashMap<Integer, Double>();
		
		cliente.setNome("André");
		cc.setNumeroDeConta(5421);
		cc.setSaldo((double) 457896);
		contaClienteCorrente.put(cc.getNumeroDeConta(), cliente.getNome());
		contaSaldoCorrente.put(cc.getNumeroDeConta(), cc.getSaldo());

		cliente.setNome("Mariana");
		cc.setNumeroDeConta(9876);
		cc.setSaldo((double) 450030);
		contaClienteCorrente.put(cc.getNumeroDeConta(), cliente.getNome());
		contaSaldoCorrente.put(cc.getNumeroDeConta(), cc.getSaldo());
		
		cliente.setNome("Vitor");
		cp.setNumeroDeConta(2134);
		cp.setSaldo((double) 789452);
		contaClientePoupanca.put(cp.getNumeroDeConta(), cliente.getNome());
		contaSaldoPoupanca.put(cp.getNumeroDeConta(), cp.getSaldo());
		
		cliente.setNome("Joana");
		cp.setNumeroDeConta(1285);
		cp.setSaldo((double) 65000);
		contaClientePoupanca.put(cp.getNumeroDeConta(), cliente.getNome());
		contaSaldoPoupanca.put(cp.getNumeroDeConta(), cp.getSaldo());
		
		System.out.println("\nTeste conta corrente:");
		System.out.println("\nDeposito corrente:");
		cc.depositar(contaSaldoCorrente, (double) 8463 , 5421);
		System.out.println("\nConsulta corrente:");
		cc.consultar(contaClienteCorrente, contaSaldoCorrente, 5421);
		System.out.println("\nSaque corrente:");
		cc.sacar(contaSaldoCorrente, (double) 4235, 5421);
		cc.calcularTaxa(contaSaldoCorrente);
	
		System.out.println("\nTeste conta poupanca:");
		System.out.println("\nDeposito poupanca:");
		cp.depositar(contaSaldoPoupanca, (double) 18456 , 2134);
		System.out.println("\nConsulta poupanca:");
		cp.consultar(contaClientePoupanca, contaSaldoPoupanca, 2134);
		System.out.println("\nSaque poupanca:");
		cp.sacar(contaSaldoPoupanca, (double) 25456, 2134);
		cp.calcularTaxa(contaSaldoPoupanca);
		
		System.out.println("\nTeste total em depósitos");
		Double totalBanco = cp.calcularTotal(contaSaldoPoupanca) + cc.calcularTotal(contaSaldoCorrente);
		System.out.println("\nHá R$ " + totalBanco + "0 depositados no banco Teste");
			
	}

}
