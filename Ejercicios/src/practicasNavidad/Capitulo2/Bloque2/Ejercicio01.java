package practicasNavidad.Capitulo2.Bloque2;

import javax.swing.JOptionPane;

public class Ejercicio01 {

	public static void main(String[] args) {
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
		int num3 = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
		int num4 = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
		int suma = num1 + num2 + num3 + num4;
		
		if (num1 < 0) {
			System.out.println("Has introducido un numero negativo " + num1);
		}else if (num2 < 0) {
			System.out.println("Has introducido un numero negativo " + num2);
		}else if (num3 < 0) {
			System.out.println("Has introducido un numero negativo " + num3);
		}else if (num4 < 0) {
			System.out.println("Has introducido un numero negativo " + num4);
		}
		
		if (num1 >= 0 && num1 <= 25) {
			System.out.println("Has introducido un numero bajo " + num1);
		}else if (num2 >= 0 && num2 <= 25) {
			System.out.println("Has introducido un numero bajo " + num2);
		}else if (num3 >= 0 && num3 <= 25) {
			System.out.println("Has introducido un numero bajo " + num3);
		}else if (num4 >= 0 && num4 <= 25) {
			System.out.println("Has introducido un numero bajo " + num4);
		}
		
		if (num1 >= 26 && num1 <=250) {
			System.out.println("Has introducido un numero medio " + num1);
		}else if (num2 >= 26 && num2 <=250) {
			System.out.println("Has introducido un numero medio " + num2);
		}else if (num3 >= 26 && num3 <=250) {
			System.out.println("Has introducido un numero medio " + num3);
		}else if (num4 >= 26 && num4 <=250) {
			System.out.println("Has introducido un numero medio " + num4);
		}
		
		if (num1 > 250) {
			System.out.println("Has introducido un numero grande " + num1);
		}else if (num2 > 250) {
			System.out.println("Has introducido un numero grande " + num2);
		}else if (num3 > 250) {
			System.out.println("Has introducido un numero grande " + num3);
		}else if (num4 > 250) {
			System.out.println("Has introducido un numero grande " + num4);
		}
		
		System.out.println("La suma total es " + suma);
	}	
}
