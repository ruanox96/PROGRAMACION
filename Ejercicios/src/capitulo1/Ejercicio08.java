package capitulo1;

import javax.swing.JOptionPane;

public class Ejercicio08 {

	public static void main(String[] args) {
		
		int resultado;
		
		String str = JOptionPane.showInputDialog("Introduce un numero");
		int num1 = Integer.parseInt(str);
		

		resultado = num1 % 2;
		
		if (resultado == 0) {
			System.out.println("El numero " + num1 + " es par");
			
		}else {
			System.out.println("El numero " + num1 + " es impar");
		}
	}	
}
