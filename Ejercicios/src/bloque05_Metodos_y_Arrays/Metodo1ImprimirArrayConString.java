package bloque05_Metodos_y_Arrays;

import javax.swing.JOptionPane;

import metodos.Utils;

public class Metodo1ImprimirArrayConString {
	/**
	 * 1.- Un método llamado "stringFromArray", que reciba un array de números enteros y devuelva una cadena de caracteres.
	 *  El método debe recorrer el array, de la misma forma en la que harías para mostrarlo en consola, 
	 *  pero en lugar de imprimir en consola debes construir un objeto String. Finalmente debes devolver el String e 
	 *  imprimirlo en el método "main".
	 * @param args
	 */

	public static void main(String[] args) {
		
		int array[] = new int[5];
		stringFromArray(array);
		
	}
		
	public static String stringFromArray (int array[]) {

		String str = " ";
		for (int i = 0; i < array.length; i++) {
			array[i] = Utils.obtenerNumeroAzar100();
			System.out.print(array[i] + "  ");
			
		}
		return str;
		
	}

}
