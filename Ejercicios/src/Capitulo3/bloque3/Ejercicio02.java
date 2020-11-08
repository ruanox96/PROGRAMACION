package Capitulo3.bloque3;

import metodos.Utils;

public class Ejercicio02 {

	public static void main(String[] args) {
		
		int  num1, num2 = -1, media=0;
		
		
			System.out.println("¿Cuantos numeros desea introducir?");
			num1 = Utils.obtenerEnteroPorScanner();
			
		for (int i =0; i != num1; i++) {
			System.out.println("Introduzca un numero ");
			num2 = Utils.obtenerEnteroPorScanner();
				media = media + (num1 / num2);
				
			}System.out.println("La media de los numeros introducidos es " + media);
		}
	}

