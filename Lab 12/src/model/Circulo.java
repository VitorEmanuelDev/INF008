package model;

public class Circulo extends FormaGeometrica{

	@Override
	public Double calcularPerimetro(Double diametro) {
		Double perimetro = Math.PI * diametro;
		return perimetro;
	}

	@Override
	public Double calcularArea(Double raio) {
		Double area = Math.PI * Math.pow(raio, 2);
		return area;
	}

}
