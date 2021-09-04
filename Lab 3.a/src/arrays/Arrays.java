package arrays;
import java.util.Random;

public class Arrays {

	public static void main (String args []) {
		Random aleatorio = new Random();
		int array[] = new int[10];
		int i = 0;
		while (i < 10) {
            int valor = 10 + aleatorio.nextInt(100);
            array[i] = valor;
            i++;
        }
		
		for(int j = 0; j < 10; j++) {
			System.out.println(array[j]);			
		}
		System.out.println("\nLista");
		String arrayString[] = {"Zé", "João", "Tonho"};
		
		for(int j = 0; j < 3; j++) {
			System.out.println(arrayString[j]);
		}
		System.out.println("\nLista atualizada");
		arrayString[0] = "Maria";
		
		for(int j = 0; j < 3; j++) {
			System.out.println(arrayString[j]);
		}
	}

}
