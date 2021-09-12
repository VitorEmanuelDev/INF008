package model;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
	
	
	public static void main(String args[]) {
		
		ContaCorrente cc = new ContaCorrente(); 
		ContaPoupanca cp = new ContaPoupanca();
		Cliente cliente = new Cliente();
		HashMap<Integer, String> contaCliente = new HashMap<Integer, String>();
		HashMap<Integer, Double> contaSaldo = new HashMap<Integer, Double>();

		
		cc.setNumeroDeConta(1234);
		cc.setSaldo(50000);
		cliente.setNome("André");		
		contaCliente.put(cc.getNumeroDeConta(), cliente.getNome());
		contaSaldo.put(cc.getNumeroDeConta(), cc.getSaldo());
		
		cc.setNumeroDeConta(2134);
		cc.setSaldo(65000);
		cliente.setNome("Maria");
		contaCliente.put(cc.getNumeroDeConta(), cliente.getNome());
		contaSaldo.put(cc.getNumeroDeConta(), cc.getSaldo());
		
		cp.setNumeroDeConta(5647);
		cp.setSaldo(450030);
		cliente.setNome("Luís");
		contaCliente.put(cc.getNumeroDeConta(), cliente.getNome());
		contaSaldo.put(cc.getNumeroDeConta(), cc.getSaldo());
		
		cp.setNumeroDeConta(1234);
		cp.setSaldo(789452);
		cliente.setNome("Joana");
		contaCliente.put(cc.getNumeroDeConta(), cliente.getNome());
		contaSaldo.put(cc.getNumeroDeConta(), cc.getSaldo());
		
		
	}

}
