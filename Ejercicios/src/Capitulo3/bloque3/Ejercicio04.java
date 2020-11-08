package Capitulo3.bloque3;

import metodos.Utils;

public class Ejercicio04 {

	public static void main(String[] args) {
	int num=1, menor=0;
		
	
		while (num != 0) {
			System.out.println("Introduce un numero");
			num = Utils.obtenerEnteroPorScanner();
			if (num > 0 && num <=4) {
				menor = num;
			}
		}System.out.println("El menor es " + menor);
	}
}
