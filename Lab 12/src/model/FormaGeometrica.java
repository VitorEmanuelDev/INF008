package model;

import java.util.HashMap;

public abstract class FormaGeometrica {

	private String corDaLinha;
	private String corDoFUndo;

	public void FormaGeometrica(){

	}

	public void FormaGeometrica(String corDaLinha, String corDoFUndo){
		this.corDaLinha = corDaLinha;
		this.corDoFUndo = corDoFUndo;
	}

	public String getCorDaLinha() {
		return corDaLinha;
	}

	public void setCorDaLinha(String corDaLinha) {
		this.corDaLinha = corDaLinha;
	}

	public String getCorDoFUndo() {
		return corDoFUndo;
	}

	public void setCorDoFUndo(String corDoFUndo) {
		this.corDoFUndo = corDoFUndo;
	}
	
	public abstract Double calcularArea(Double medida);
	public abstract Double calcularPerimetro(Double medida);

	


}
