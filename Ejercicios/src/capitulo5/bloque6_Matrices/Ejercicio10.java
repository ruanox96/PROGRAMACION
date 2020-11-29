package capitulo5.bloque6_Matrices;

import metodos.Utils;

public class Ejercicio10 {

	public static void main(String[] args) {
		
		int matriz[][] = new int[5][5];

		for (int i = 0; i < matriz[i].length; i++) {
			for (int j = 0; j < matriz[j].length; j++) {
				matriz[i][j] = Utils.obtenerNumeroAzarSinLimites(); 
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("La triangular de la matriz es superior = " + (matriz));
	}
		
}
