package lab_13;

public class Forno {
	
	private Usuario user;
	
	public Forno() {}
	
	public Forno(double temp) {
		user.setTempForno(temp);
	}
	
	public double getTemp() {
		return user.getTempForno();
	}

	public void setTemp(double temp) {
		user.setTempForno(temp);
	}

}
