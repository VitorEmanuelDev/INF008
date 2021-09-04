package model;

import java.util.Random;

public abstract class Manipula {

	int array[] = {5,8,32,67,99,15,12,9,1,99};
	int temp = 0;

	public void preencher() {
		int array[] = new int[10];
		Random aleatorio = new Random();
		int i = 0;
		while (i < array.length) {
			int valor = 10 + aleatorio.nextInt(100);
			array[i] = valor;
			i++;
		}

	}

	public void ordenar() {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (array[i] < array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
	}

	public void imprimir() {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
	

}
