package lab_13;

public class Teste {

	public static void main(String [] args) {
		
		Usuario user = new Usuario();
		
		user.setTempInicial(45.0);
		user.setTempForno(40.0);
		
		if(user.getTempInicial() > user.getTempForno()) {
			System.out.println("Forno sendo ligado");
		}else {
			System.out.println("Forno sendo desligado");			
		}
		
	}
	
}
