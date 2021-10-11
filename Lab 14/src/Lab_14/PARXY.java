package Lab_14;

public class PARXY {

	private String x;
	private String y;
	
	public PARXY() {}

	public PARXY(String x, String y) {
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

	public void iguaisXY(String x, String y){
		if(x.equals(y) ) {
			System.out.println("Objetos 'iguais'");
		}else {
			System.out.println("Objetos diferentes");
		}		
	}

}
