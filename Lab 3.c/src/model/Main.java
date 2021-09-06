package model;

public class Main {

	public static void main(String args []) {

		Derivada manipula = new Derivada();

		manipula.empilha("Ola!");
		manipula.empilha("Tudo bem?");
		manipula.empilha("Como vai?");
		manipula.empilha("Como se chama?");
		manipula.desempilha();
		manipula.verifica();

	}

}
