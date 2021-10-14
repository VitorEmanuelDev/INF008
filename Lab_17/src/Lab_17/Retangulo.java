package Lab_17;

public class Retangulo {
	
	private int largura;
	private int comprimento;
	
	public Retangulo() {}
	
	public Retangulo(int largura, int comprimento) {
		this.largura = largura;
		this.comprimento = comprimento;
	}

	public int getLargura() {
		return largura;
	}

	public void setLargura(int largura) {
		this.largura = largura;
	}

	public int getComprimento() {
		return comprimento;
	}

	public void setComprimento(int comprimento) {
		this.comprimento = comprimento;
	}

	public int getArea(int largura, int comprimento) {			
		return largura * comprimento;
	}
	
	public int perimetro() {		
		return largura * 2 + comprimento * 2;
	}
	
	public Retangulo divide() {		
		largura /= 2;
		comprimento /= 2;
		return new Retangulo(largura, comprimento);
	}

	


}
