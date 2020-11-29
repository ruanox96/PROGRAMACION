package capitulo5.bloque6_Matrices;

public class Ejercicio7 {

	public static void main(String[] args) {

		int matriz[][] = new int[][] {{ 1, 1, 1 }, 
									  { 0, 1, 1 }, 
									  { 0, 0, 1 }};
		for (int i = 0; i < matriz[i].length; i++) {
			for (int j = 0; j < matriz[j].length; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("La triangular de la matriz es superior = " + (matriz));

	}
	

}
