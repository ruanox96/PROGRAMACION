package capitulo5.bloque6_Matrices;

import metodos.Utils;

public class Ejercicio3 {

	public static void main(String[] args) {
		int matriz[][] = new int[3][3];
		System.out.println(ComprobarMatrizPositiva(matriz) + " positivo");
		
		
	}
	
	
	public static Boolean ComprobarMatrizPositiva(int matriz[][]) {
	
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = Utils.obtenerNumeroAzarSinLimites();
				if (matriz[i][j] < 0) {
				}
			}
		}
		return false;
	}
}

