package model;

public class Banco{
	public static void main(String args[]) {
		
		Conta cc = new Corrente();
		Conta cp = new Poupanca();
		Cliente[] lista = new Cliente[4];
		
		lista[0] = new Cliente("Nome 123", new Corrente(1233, 45789.0));
		
		lista[1] = new Cliente("Nome 456", new Corrente(7548, 85746.0));
			
		lista[2] = new Cliente("Nome 789", new Poupanca(1598, 638457.0));
			
		lista[3] = new Cliente("Nome 963", new Poupanca(8572, 87945.0));
		
		System.out.println("\nTeste conta corrente:");
		System.out.println("\nDeposito corrente:");
		cc.depositar(4587.0, 1233, lista);
		System.out.println("\nConsulta corrente:");
		cc.consultar(1233, lista);
		System.out.println("\nSaque corrente:");
		cc.sacar((double) 4235.0, 1233, lista);
		cc.calcularTaxa(lista);
	
		System.out.println("\nTeste conta poupanca:");
		System.out.println("\nDeposito poupanca:");
		cp.depositar((double) 8463.0 , 1598, lista);
		System.out.println("\nConsulta corrente:");
		cp.consultar(1598, lista);
		System.out.println("\nSaque corrente:");
		cp.sacar((double) 4235.0, 1598, lista);
		cp.calcularTaxa(lista);
		
		System.out.println("\nTeste total em depósitos");
		Double totalBanco = cp.calcularTotal(lista) + cc.calcularTotal(lista);
		System.out.println("\nHá R$ " + totalBanco + "0 depositados no banco Teste");
		
	}


}
