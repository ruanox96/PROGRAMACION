package practicasNavidad.Capitulo2.Bloque2;

import javax.swing.JOptionPane;

public class Ejercicio02 {

	public static void main(String[] args) {
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
		int num3 = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
		int num4 = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
		int num5 = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
		int contador = 0;
		
		if (num1 < 0) {
			System.exit(num1);
		}else if (num2 < 0) {
			System.exit(num2);
		}else if (num3 < 0) {
			System.exit(num3);
		}else if (num4 < 0) {
			System.exit(num4);
		}else if (num5 < 0) {
			System.exit(num5);
		}
		
		if (num1 >= 0 && num1 <= 25) {
			System.out.println("Has introducido un numero bajo " + num1);
			
		}else if (num2 >= 0 && num2 <= 25) {
			System.out.println("Has introducido un numero bajo " + num2);
			
		}else if (num3 >= 0 && num3 <= 25) {
			System.out.println("Has introducido un numero bajo " + num3);
			
		}else if (num4 >= 0 && num4 <= 25) {
			System.out.println("Has introducido un numero bajo " + num4);
			
		}else if (num5 >= 0 && num5 <= 25) {
			System.out.println("Has introducido un numero bajo " + num5);
			
		}contador ++;
		
		if (num1 >= 26 && num1 <=250) {
			System.out.println("Has introducido un numero medio " + num1);
			
		}else if (num2 >= 26 && num2 <=250) {
			System.out.println("Has introducido un numero medio " + num2);
			
		}else if (num3 >= 26 && num3 <=250) {
			System.out.println("Has introducido un numero medio " + num3);
			
		}else if (num4 >= 26 && num4 <=250) {
			System.out.println("Has introducido un numero medio " + num4);
			
		}else if (num5 >= 26 && num5 <= 250) {
			System.out.println("Has introducido un numero bajo " + num5);
			
		}contador ++;
		
		if (num1 > 250) {
			System.out.println("Has introducido un numero grande " + num1);

		}else if (num2 > 250) {
			System.out.println("Has introducido un numero grande " + num2);
			
		}else if (num3 > 250) {
			System.out.println("Has introducido un numero grande " + num3);
			
		}else if (num4 > 250) {
			System.out.println("Has introducido un numero grande " + num4);
			
		}else if (num5 > 250) {
			System.out.println("Has introducido un numero bajo " + num5);
			
		}contador ++;

	}

}
