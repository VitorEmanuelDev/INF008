package lab_13;

public class Termostato {
	
	private Usuario user;

	public Termostato() {}
	
	public Termostato(double tempInicial) {
		user.setTempInicial(tempInicial);;
	}

	public double gettempInicial() {
		return user.getTempInicial();
	}

	public void settempInicial(double tempInicial) {
		user.setTempInicial(tempInicial);
	}
	
}
