package model;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
	
	
	public static void main(String args[]) {
		
		ContaCorrente cc = new ContaCorrente(); 
		ContaPoupanca cp = new ContaPoupanca();
		Cliente cliente = new Cliente();
		HashMap<Integer, String> contaClientePoupanca = new HashMap<Integer, String>();
		HashMap<Integer, Double> contaSaldoPoupanca = new HashMap<Integer, Double>();
		HashMap<Integer, String> contaClienteCorrente = new HashMap<Integer, String>();
		HashMap<Integer, Double> contaSaldoCorrente = new HashMap<Integer, Double>();
	
		cc.setNumeroDeConta(1234);
		cc.setSaldo((double) 50000);
		cliente.setNome("André");		
		contaClienteCorrente.put(cc.getNumeroDeConta(), cliente.getNome());
		contaSaldoCorrente.put(cc.getNumeroDeConta(), cc.getSaldo());
		
		cc.setNumeroDeConta(2134);
		cc.setSaldo((double) 65000);
		cliente.setNome("Maria");
		contaClienteCorrente.put(cc.getNumeroDeConta(), cliente.getNome());
		contaSaldoCorrente.put(cc.getNumeroDeConta(), cc.getSaldo());
		
		cp.setNumeroDeConta(5647);
		cp.setSaldo((double) 450030);
		cliente.setNome("Luís");
		contaClientePoupanca.put(cp.getNumeroDeConta(), cliente.getNome());
		contaSaldoPoupanca.put(cp.getNumeroDeConta(), cp.getSaldo());
		
		cp.setNumeroDeConta(1285);
		cp.setSaldo((double) 789452);
		cliente.setNome("Joana");
		contaClientePoupanca.put(cp.getNumeroDeConta(), cliente.getNome());
		contaSaldoPoupanca.put(cp.getNumeroDeConta(), cp.getSaldo());
		
		System.out.println("\nTeste conta corrente:");
		System.out.println("\nDeposito corrente:");
		cc.depositar(contaSaldoCorrente, (double) 8463 , 2134);
		System.out.println("\nConsulta corrente:");
		cc.consultar(contaClienteCorrente, contaSaldoCorrente, 2134);
		System.out.println("\nSaque corrente:");
		cc.sacar(contaSaldoCorrente, (double) 4235, 2134);
		cc.cobrarTaxa(contaSaldoCorrente);
	
		System.out.println("\nTeste conta poupanca:");
		System.out.println("\nDeposito poupanca:");
		cp.depositar(contaSaldoPoupanca, (double) 18456 , 5647);
		System.out.println("\nConsulta poupanca:");
		cp.consultar(contaClientePoupanca, contaSaldoPoupanca, 5647);
		System.out.println("\nSaque poupanca:");
		cp.sacar(contaSaldoPoupanca, (double) 25456, 5647);
		cp.aplicarJuros(contaSaldoPoupanca);
		
	}

}
