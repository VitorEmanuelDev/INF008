package lab_13;

public class Usuario {
	
	private double tempInicial;
	private double temp;
	
	public Usuario(){}
	
	public Usuario(double tempInicial){	
		this.tempInicial = tempInicial;	
	}

	public double getTempInicial() {
		return tempInicial;
	}

	public void setTempInicial(double tempInicial) {
		this.tempInicial = tempInicial;
	}

	public double getTempForno() {
		return temp;
	}

	public void setTempForno(double temp) {
		this.temp = temp;
	}
	
	
	
}
