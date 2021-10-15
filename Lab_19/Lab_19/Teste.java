package Lab_19;

public class Teste {
	
	public static void main(String [] args) {
		
		
		PARXYInt xyInt = new PARXYInt();
		PARXYNomes xyString = new PARXYNomes();
		
		xyInt.setX(15);
		xyInt.setY(13);
		
		xyString.setX("Hello");
		xyString.setY("World");
		
		boolean iguaisS = xyString.iguais();
		boolean maiorS = xyString.xMaior();
		
		System.out.println(xyString.getX() + " =? " + xyString.getY() + " " + iguaisS);
		System.out.println(xyString.getX() + " >? " + xyString.getY() + " " + maiorS);
		
		boolean iguaisI = xyInt.iguais();
		boolean maiorI = xyInt.xMaior();
		
		System.out.println(xyInt.getX() + " =? " + xyInt.getY() + " " + iguaisI);
		System.out.println(xyInt.getX() + " >? " + xyInt.getY() + " " + maiorI);

		
	}

}
