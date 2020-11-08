package Capitulo3.bloque3;

import metodos.Utils;

public class Ejercicio03 {

	public static void main(String[] args) {
		int num=1, mayor=0;
		
		while (num > 0) {
			System.out.println("Introduce un numero (0 para finalizar)");
			num = Utils.obtenerEnteroPorScanner();
			if (num > mayor) {
				mayor = num;
			}
		}System.out.println("El mayor valor introducido es " + mayor);

	}

}
