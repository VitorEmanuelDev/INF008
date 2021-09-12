package model;

public abstract class Manipula {

	String stringArray[] = new String [10];    
	int topo = -1; 

	public int estaVazia() {

		if(topo == -1)
			return 1;
		else
			return 0;
	}

	public int estaCheia() {

		if(topo == 10)
			return 1;
		else
			return 0;
	}

	void verifica() {
		System.out.println("Topo atual " + stringArray[topo]);
	}

	public void desempilha() {
		String primeiraPalavra;
		if(estaVazia() == 0) {
			primeiraPalavra = stringArray[topo];
			System.out.println("Desempilhando " + primeiraPalavra);
			topo--;   
		} else 
			System.out.println("Pilha vazia.\n");
	}

	public void empilha(String novaPalavra) {

		if(estaCheia() == 0) {
			topo++;   
			stringArray[topo] = novaPalavra;
			System.out.println("Empilhando " + novaPalavra);

		} else 
			System.out.println("Stack cheia.\n");
		
	}

}
