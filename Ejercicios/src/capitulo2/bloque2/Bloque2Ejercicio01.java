package capitulo2.bloque2;

import javax.swing.JOptionPane;

public class Bloque2Ejercicio01 {

	public static void main(String[] args) {
		
		int suma;
		
		int numnegativo = 0, Numbajo = 0, Nummedio = 0, Numgrande = 0;
		
		String str = JOptionPane.showInputDialog("Introduce un numero negativo");
		int num1 = Integer.parseInt(str);
		
		str = JOptionPane.showInputDialog("Introduce un numero bajo (entre 0 y 25)");
		int num2 = Integer.parseInt(str);
		
		str = JOptionPane.showInputDialog("Introduce un numero medio (entre 26 y 250)");
		int num3 = Integer.parseInt(str);
		
		str = JOptionPane.showInputDialog("Introduce un numero grande (mayor de 250)");
		int num4 = Integer.parseInt(str);
		
		str = JOptionPane.showInputDialog("Introduce un numero al azar");
		int num5 = Integer.parseInt(str);
		
		suma = num1 + num2 + num3 + num4 + num5;	
		
		if (suma < 0 ) {
			System.out.println("El " + suma + " es negativo");
		}
		if (suma >= 0 && suma <= 25) {
			System.out.println("El " + suma + " es un numero bajo");
		}
		if (suma >= 26 && suma <= 250) {
			System.out.println("El " + suma + " es un numero medio");
		}
			
		if (suma > 250) {
			System.out.println("El " + suma + " es un numero grande");
		}
			System.out.println("La suma total es: " + suma);
		
	}										
}
