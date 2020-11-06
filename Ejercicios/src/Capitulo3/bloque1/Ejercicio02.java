package Capitulo3.bloque1;

import metodos.Utils;

public class Ejercicio02 {
	
	public static void main(String[] args) {
		
	      int num = 1, suma = 0;
		  
		     while (num != 0) {
		    	 	System.out.println("Introduce un numero (0 para terminar): ");
		    	 	num = Utils.obtenerEnteroPorScanner();
		    	 	if (num >= 10) {
		    	 		suma += num;
		    	 	}
		     } System.out.println("La suma de los numeros introducidos es: " + suma);
	}
}

