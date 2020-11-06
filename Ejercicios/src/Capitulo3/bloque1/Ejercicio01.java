package Capitulo3.bloque1;


import javax.swing.JOptionPane;

import metodos.Utils;

public class Ejercicio01 {

		public static void main(String[] args) {
	
	        int num = 1, num2 = 1, num3 = 1, num4 = 1, suma = 0;
    	 	
	     while (num > 0) {
	    	 System.out.println("Introduce un numero: ");
	    	 	num = Utils.obtenerEnteroPorScanner();
	    	 	System.out.println("Introduce un numero: ");
	    	 	num2 = Utils.obtenerEnteroPorScanner();
	    	 	System.out.println("Introduce un numero: ");
	    	 	num3 = Utils.obtenerEnteroPorScanner();
	    	 	System.out.println("Introduce un numero: ");
	    	 	num4 = Utils.obtenerEnteroPorScanner();
	    		if (num >= 10) {
		    	 	suma += num + num2 + num3 + num4;
		    	 	
	     }System.out.println("La suma total de los numeros introducidos es: " + suma);
	     
	     }
	}
} 


