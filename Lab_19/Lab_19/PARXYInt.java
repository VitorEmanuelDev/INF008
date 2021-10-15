package Lab_19;

public class PARXYInt extends PARXY {
	
	public int x;
	public int y;
	
	public PARXYInt() {
	}

	public PARXYInt(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	@Override
	public boolean iguais() {
		if(x == y)
			return true;
		else
			return false;
	}
	@Override
	public boolean xMaior() {
		if(x > y)
			return true;
		else
			return false;
	}
	
}
