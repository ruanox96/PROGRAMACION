package Capitulo3.bloque3;

import metodos.Utils;

public class Ejercicio05 {

	public static void main(String[] args) {
		
		int num=1, mayor=0, menor=0;
		
		while (num != 0) {
			System.out.println("Introduce un numero");
			num = Utils.obtenerEnteroPorScanner();
			if (num <= 5 && num > 0) {
				menor = num;
			}else if (num>=6) {
				mayor = num;
			}
		}System.out.println("El menor es " + menor + " y el mayor es " + mayor);

	}

}
