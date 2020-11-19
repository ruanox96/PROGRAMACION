package bloque05_Metodos_y_Arrays;

import metodos.Utils;

public class Metodo3 {

	public static void main(String[] args) {
		int array[] = new int[5];
		int array2[] = new int[5];
		int num = 3;
		
		for (int i = 0; i < array.length; i++) {
			array[i] = Utils.obtenerNumeroAzar10();
		}
		Utils.mostrarArrayInt(array);
		array2 = addInteger(array, num);

	}
	public static int[] addInteger(int array[], int num) {
		int array2[] = new int [array.length +1];		
			
		for (int i = 0; i < array.length; i++) {
			array2[i] = array[i];
			}
		array2[array2.length -1] = num;
		
		return array2;
	}

}
