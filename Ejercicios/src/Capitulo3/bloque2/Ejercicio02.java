package Capitulo3.bloque2;

import metodos.Utils;

public class Ejercicio02 {

	public static void main(String[] args) {
		int num1, num2 = 0, mayor = 0, menor=1;
		
		System.out.println("Cuantos numeros desea introducir?");
		num1 = Utils.obtenerEnteroPorScanner();
		
		for (int i=0; i<num1; i++) {
			System.out.println("Introduce un numero ");
			num2 = Utils.obtenerEnteroPorScanner();
			if (num2 > mayor) {
				mayor = num2;
			
			}if (num2 > menor) {
					menor = num2;
			}
		}System.out.println("El mayor es " + mayor + " y el menor es " + menor);
	}
}


