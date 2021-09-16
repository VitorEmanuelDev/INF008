package model;

public class Main {
	
	public static void main(String [] args) {
		
		Ponto medida = new Ponto();
		FormaGeometrica quadrado = new Quadrado();
		FormaGeometrica circulo = new Circulo();
		
		medida.setX((double) 3);
		medida.setY((double) 6);
		
		quadrado.setCorDaLinha("preta");
		quadrado.setCorDoFUndo("vermelho");
		System.out.println("Area quadrado " + quadrado.calcularArea(medida.getX()));
		System.out.println("Perimetro quadrado " + quadrado.calcularPerimetro(medida.getX()));
		System.out.println("Cor linha quadrado " + quadrado.getCorDaLinha());
		System.out.println("Cor fundo quadrado " + quadrado.getCorDoFUndo());
		
		circulo.setCorDaLinha("azul");
		circulo.setCorDoFUndo("branco");
		System.out.println("Area circulo " + circulo.calcularArea(medida.getX()));
		System.out.println("Perimetro circulo " + circulo.calcularPerimetro(medida.getY()));
		System.out.println("Cor linha circulo " + circulo.getCorDaLinha());
		System.out.println("Cor fundo circulo " + circulo.getCorDoFUndo());
		
			
	}

}
