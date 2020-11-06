package Capitulo3.bloque1;

import metodos.Utils;

public class Ejercicio03 {

	public static void main(String[] args) {
		
		int num = 1, contp = 0, contn = 0;
		
		

		  while (num != 0) {
			  System.out.println("Introduce un numero (0 para terminar): ");
			 	num = Utils.obtenerEnteroPorScanner();
	    	 	if (num > 0) {
	    	 		contp ++;
	    	 		
	    	 	}else {
	    	 		contn++;
	    	 	}System.out.println("los numeros positivos son " + contp + " y los numeros negativos" + contn);
	    	 	}
		  }
	}


