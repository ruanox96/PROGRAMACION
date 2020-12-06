package capitulo5.bloque6_Matrices;

public class Ejercicio4MatrizDiagonal {

	public static void main(String[] args) {
		int matriz[][] = new int[][] { { 1, 0, 0 }, 
									   { 0, 1, 0 }, 
									   { 0, 0, 1 } };
		for (int i = 0; i < matriz[i].length; i++) {
			for (int j = 0; j < matriz[j].length; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("La matriz diagonal es = " + ComprobarmatrizDiagonal(matriz));
	}

	public static boolean ComprobarmatrizDiagonal(int matriz[][]) {

		/*
		 * Crea un método que compruebe si la matriz es diagonal (Todos los elementos
		 * que no están en la diagonal principal son nulos).
		 */
		boolean diagonal = true;

		for (int i = 0; i < matriz[i].length; i++) {
			for (int j = 0; j < matriz[j].length; j++) {

					if (matriz[i][j] == 0) {
						diagonal = false;
					}else {
						diagonal = true;
					}
			}
		}
		return diagonal;
	}

}
