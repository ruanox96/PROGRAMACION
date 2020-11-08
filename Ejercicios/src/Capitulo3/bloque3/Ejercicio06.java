package Capitulo3.bloque3;

import metodos.Utils;

public class Ejercicio06 {

	public static void main(String[] args) {
		int num;
		int i=1;
		
		System.out.println("Introduzca un numero para ver su tabla de multiplicar");
		num= Utils.obtenerEnteroPorScanner();
		for (i = 0; i<11; i++) {
			System.out.println(num + "x" + i + "=" + (num*i));
		}
	}
}
