package Capitulo3.bloque3;

import metodos.Utils;

public class Ejercicio07 {

	public static void main(String[] args) {
		int num1=1, contadorP = 0, contadorN = 0;
		
		while (num1 != 0) {
			System.out.println("Introduce un numero ");
			num1 = Utils.obtenerEnteroPorScanner();
			if (num1 > 0) {
				contadorP ++;
				
			}else if (num1 < 0) {
				contadorN ++;
			}
		}System.out.println("Se han introducido " + contadorP + " numeros positivos y " + contadorN + " numeros negativos ");
	}

}
