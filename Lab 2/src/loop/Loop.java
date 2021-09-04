package loop;

public class Loop {

	public static void main(String args[]) {

		for(int i = 0; i < 5; i++) {

			System.out.println("e aí?");

		}

		int soma = 0;
		do {
			do {
				soma += 3 * 6;
				System.out.println(soma);

			}while(soma == 0);

		}while(soma == 0);
	}

}
