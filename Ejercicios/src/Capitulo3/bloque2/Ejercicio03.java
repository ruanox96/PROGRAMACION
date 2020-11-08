package Capitulo3.bloque2;

import metodos.Utils;

public class Ejercicio03 {

	public static void main(String[] args) {
		int i, num;
		
		System.out.println("Introduce un numero para ver su multiplo (max 100): ");
		num=Utils.obtenerEnteroPorScanner();
		
		for (i = 0; (i*num) <100; i++) {
			System.out.println("Los multiplos de " + num  + " son: " + (i*num));
		}
	}

}
