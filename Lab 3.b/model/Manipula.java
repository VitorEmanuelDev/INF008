package model;

import java.util.Random;

public abstract class Manipula {

	int array[] = new int [10];
	int temp = 0;

	public void preencher() {
		//int array[] = new int[10];
		Random aleatorio = new Random();
		int i = 0;
		while (i < array.length) {
			int valor = 10 + aleatorio.nextInt(100);
			array[i] = valor;
			i++;
		}

	}
	//teste
	//int array[] = {5,8,32,67,99,15,12,9,1,99};

	public void ordenar() {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
			array[i] = (array[i] < array[j]) ? bubble(i , j): array[i];
			}
		}
	}

		public void imprimir() {
			for (int i = 0; i < array.length; i++) {
				System.out.println(array[i]);
			}
		}

		public int bubble(int i , int j) {
			temp = array[i];
			array[i] = array[j];
			array[j] = temp;
			
			return array[i];
		}


	}
