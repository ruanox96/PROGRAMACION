package Capitulo3.bloque2;

import metodos.Utils;

public class Ejercicio02 {

	public static void main(String[] args) {
		int num1, num2 = 0, mayor = 1, menor=0;
		
		System.out.println("Cuantos numeros desea introducir?");
		num1 = Utils.obtenerEnteroPorScanner();
		
		for (int i=0; i<num1; i++) {
			System.out.println("Introduce un numero ");
			num2 = Utils.obtenerEnteroPorScanner();
			if (num2 > mayor) {
				
			}
		}System.out.println("el numero mayor es " + num2);
	}
}

