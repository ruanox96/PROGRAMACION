package bloque05_Metodos_y_Arrays;

import metodos.Utils;

public class Metodo2 {
	/**
	 * 2.- Un método llamado "findAndReplace", que reciba: 
   - Un array de números enteros.
   - Un valor entero que debe buscarse en el array.
   - Un valor entero que debe servir para reemplazar.
	El método buscará todas las ocasiones en las que el segundo parámetro aparezca dentro del array y reemplazará ese valor con el valor del tercer parámetro.
	El método main debe crear un array, imprimirlo en consola, llamar al método "findAndReplace" y volver a imprimir el array en consola.
	 * @param args
	 */
	public static void main(String[] args) {
		int array[] = new int [5];
		findAndReplace(array);
	}
	public static int findAndReplace(int array[]) {
		int num1 = 5;
		int reemplazo = 9;
		
		for (int i = 0; i < array.length; i++) {
			array[i] = Utils.obtenerNumeroAzar10();
			if (num1 == array[i]) {
				array[i] = reemplazo;
			}
			System.out.println(array[i]);
		}
		return reemplazo;
	}
	
}
