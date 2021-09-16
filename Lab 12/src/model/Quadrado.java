package model;

public class Quadrado extends FormaGeometrica{

	@Override
	public Double calcularArea(Double lado) {	
		Double area = Math.pow(lado, 2);
		return area;
	}

	@Override
	public Double calcularPerimetro(Double lado) {
		Double perimetro = lado * 4;
		return perimetro;
	}

}
