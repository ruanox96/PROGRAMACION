package Capitulo3.bloque2;

import metodos.Utils;

public class Ejercicio04 {

	public static void main(String[] args) {
		
		int i, max, num;
		
		System.out.println("Introduzca el limite maximo del numero que vaya a introducir: ");
		max=Utils.obtenerEnteroPorScanner();
		System.out.println("Introduce el numero para ver sus multiplos, maximo " + max );
		num = Utils.obtenerEnteroPorScanner();
		for (i = 1; (i*num)<max ; i++) {
			System.out.println("los multiplos de " + num + " son "  + (i*num));
		
			
		}

	}

}
