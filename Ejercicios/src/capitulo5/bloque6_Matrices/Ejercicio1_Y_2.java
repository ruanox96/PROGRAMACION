package capitulo5.bloque6_Matrices;

import metodos.Utils;

public class Ejercicio1_Y_2 {
	/**
	 * 1º - Crea un método que rellena la matriz con valores creados al azar. 
	 * 		El método recibirá la matriz y devolverá "void".
	 * 
	 * 2º - Crea un método que imprima la matriz en consola. 
	 * 		El método recibirá la matriz y devolverá "void".
	 * @param args
	 */

	public static void main(String[] args) {
		int matriz [][]  = new int[3][3];
			MatrizValoresAzar(matriz);
	}
	public static void MatrizValoresAzar(int matriz[][]) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j] = Utils.obtenerNumeroAzarSinLimites();
				
				System.out.print(matriz[i][j] + " \t");
				
			}System.out.println();
		}
	}

}
