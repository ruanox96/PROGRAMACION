package Capitulo3.bloque2;

import javax.swing.JOptionPane;

import metodos.Utils;

public class Ejercicio01 {

	public static void main(String[] args) {
		
		
		int num=1, num2, media = 0; 
		
		System.out.println("¿Cuantos numeros desea introducir?");
		num2 = Utils.obtenerEnteroPorScanner();
		
		for (int i =0 ; i < num2; i++) {
			System.out.println("Introduce un numero");
			num = Utils.obtenerEnteroPorScanner();
			media = media + num / num2;
			
		}System.out.println("la media de los numeros introducidos es " + media);
				

	}

}
