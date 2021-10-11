package Lab_16;

public class PLANO3D {

	private PONTO3D ponto3d;
	private int x;
	private int y;
	private int z;

	public PLANO3D() {

	}

	public PLANO3D(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}


	public void horizontal() {

		if(x > 0 && y > 0) {
			System.out.println("Há plano horizontal");
		}else {
			System.out.println("Não há plano horizontal");
		}

	}

	public void perpendicular() {

		if(x > 0 && y > 0 && z > 0) {
			System.out.println("Há plano perpendicular");
		}else {
			System.out.println("Não há plano perpendicular");
		}

	}

}
