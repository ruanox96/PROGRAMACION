package bloque05_Metodos_y_Arrays;

import metodos.Utils;

public class Metodo3 {
	/**
	 * 3.- Realiza un método llamado "addInteger", que reciba:
   - Un array de números enteros.
   - Un valor entero.
Dentro del método debes:
   - Crear un nuevo array, cuya longitud sea la del array recibido como primer parámetro + 1.
   - Copiar el array del primer parámetro en el array creado dentro del método, elemento tras elemento.
   - Agregar el nuevo elemento al final del nuevo array.
   - Asignar, al array recibido mediante el primer parámetro, el puntero al nuevo array creado en el interior del método.
   - El método debe devolver un array de tipo entero. Main debe recoger el array devuelto e imprimirlo en consola.
	 * @param args
	 */

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
			
		for (int i = 0; i < array.length; i++) { //Recorro la longitud del array1
			array2[i] = array[i];		//
			}
		array2[array2.length -1] = num;
		
		return array2;
	}

}
