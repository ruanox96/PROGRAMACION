package bloque05_Metodos_y_Arrays;

import metodos.Utils;

public class Metodo4 {

	public static void main(String[] args) {
		int array[] = new int[5];
		int num = 3;
		
		for (int i = 0; i<array.length; i++) {
			array[i] = Utils.obtenerNumeroAzar10();
		}
		Utils.mostrarArrayInt(array);
		int contador = countOccurrences(array, num);
		System.out.println("\n" +contador);
	}
	
	public static int countOccurrences(int array[], int num) {
		int contador = 0;
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] == num) {
				contador++;	
			}
			
		}
		
		return contador;
	}
	
}
