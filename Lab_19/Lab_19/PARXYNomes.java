package Lab_19;

public class PARXYNomes extends PARXY{

	public String x;
	public String y;
	
	public PARXYNomes() {
		
	}
	
	public PARXYNomes(String x, String y) {
		this.x = x;
		this.y = y;
	}

	public String getX() {
		return x;
	}
	public void setX(String x) {
		this.x = x;
	}
	public String getY() {
		return y;
	}
	public void setY(String y) {
		this.y = y;
	}

	@Override
	public boolean iguais() {
		if(x.equals(y))
			return true;
		else
			return false;
	}

	@Override
	public boolean xMaior() {
		if(x != null && y != null) {
			if(x.length() > y.length())
				return true;
			else
				return false;
		}else {
			System.out.println("Valor nulo detectado");
			return false;
		}
	}

}
