package Lab_18;

public class Test {

	public static void main(String [] args) {
		
		Lista lista = new Lista();
		
		lista.putObj("ACT");
		lista.putObj("RA");
		lista.putObj("PASK");
		lista.putObj("HGEAKJB");
		lista.putObj("E");
		lista.putObj("ALKNALAL");
		
		lista.remObj(0);
		
		lista.posObj("D");
		
		lista.temObj("F");
		
		lista.isEmpty(6);
		
		lista.isEmpty();
		
		lista.tamanho();
		
	}
}
