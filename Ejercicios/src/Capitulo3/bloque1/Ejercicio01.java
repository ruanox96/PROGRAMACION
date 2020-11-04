package Capitulo3.bloque1;


import javax.swing.JOptionPane;

public class Ejercicio01 {

		public static void main(String[] args) {
	
	        int num, suma = 0;
	  
	        for (int i = 0; i < 4; i++) {
	            String str = JOptionPane.showInputDialog("Introduce un Número: ");
	            num = Integer.parseInt(str);
	            if (num >= 10) {
	                suma += num; 
	            }
	            System.out.println(
	                    "Nº Introducido: " + num + ". El resultado de la suma de los números mayores a 10 es: " + suma);
	        }

	}
} 


