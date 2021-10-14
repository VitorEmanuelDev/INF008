package Lab_17;

public class Teste {
	
	public static void main(String ags[]) {
		Retangulo ret1 = new Retangulo();
		
		ret1.setComprimento(20);
		ret1.setLargura(10);
		
		System.out.println("Perimetro ret1 " + ret1.perimetro());
		System.out.println("Area ret1 " + ret1.getArea(ret1.getComprimento(), ret1.getLargura()));
		
		Retangulo ret2 = ret1.divide();
		
		System.out.println("Perimetro ret1 " + ret2.perimetro());
		System.out.println("Area ret1 " + ret2.getArea(ret2.getComprimento(), ret2.getLargura()));
		
		
	}

}
