package Capitulo3.bloque3;

import metodos.Utils;

public class Ejercicio01 {

	public static void main(String[] args) {
		
		int num=1, suma = 0;
		
		while (num != 0) {
			System.out.println("Introduzca un numero (0 para terminar :)");
			num = Utils.obtenerEnteroPorScanner();
			suma += num;
		}System.out.println("la suma total es " + suma);
			

	}

}
