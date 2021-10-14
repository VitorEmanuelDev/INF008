package Lab_18;

public class Lista {
	
	private Object lista = new Object();
	private String[] array = new String[10];
	private int i;
	
	public Lista() {
		i = 0;
	}

	
	public void putObj(String obj){
		array[i] = obj;
		i++;
		System.out.println("Objeto colocado no índice " + i);
		lista.setIndice(i);	
	
	}

	public void remObj(int indice) {
		if (array[indice] != null)
			array[indice] = null;		
	}

	public int posObj(String obj){
		for(int i = 0; i < array.length; i++) {
			if(array[i] != null && array[i].contains(obj)) {
				System.out.println("Objeto presente na posição " + i);
				return i;
			}
		}
		System.out.println("Não existe na lista.");
		return 0;		
	}
	
	public void temObj(String obj) {
		for(int i = 0; i < array.length; i++) {
			if(array[i] != null && array[i].contains(obj)) {
				System.out.println("O objeto '" + obj + "' está na posição " + i);
			}
		}
		System.out.println("Objeto " + obj + " não existe na lista.");
	}
	
	public void isEmpty(int ind){
		if(array[ind] == null) {
			System.out.println("Posicao informada está vazia.");
		}else {
			System.out.println("Posicao " + ind + " contém objeto.");
		}		
	}
	
	public boolean isEmpty() {
		for(int i = 0; i < array.length; i++) {
			if(array[i] != null) {
				System.out.println("A lista não está vazia.");
				return false;
			}
		}
		System.out.println("A lista está vazia.");
		return true;
	}
	
	public void tamanho() {
		for(int i = 0; i < array.length; i++) {
			if(array[i] != null) {
				System.out.println("Tamanho do objeto " + array[i].length());	
			}
		}
	}

}
