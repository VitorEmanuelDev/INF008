package Lab_16;

public class Teste {
	
	public static void main(String args[]) {
		
		PONTO3D ponto3d = new PONTO3D();
		
		ponto3d.setX(9);
		ponto3d.setY(6);
		ponto3d.setZ(3);
		
		System.out.println(ponto3d.getX() + " " + ponto3d.getY() + " " + ponto3d.getZ());
		
		PLANO3D plano3d = new PLANO3D(ponto3d.getX(), ponto3d.getY(), ponto3d.getZ());
		
		plano3d.horizontal();
		plano3d.perpendicular();
	}

}
