package practicasNavidad.Capitulo2.Bloque1;

import javax.swing.JOptionPane;

public class Ejercicio06 {

	public static void main(String[] args) {
		int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
		
		if (num % 2 == 0) {
			System.out.println("El " + num + " es Par");
		}else if (num % 2 == 1) {
			System.out.println("El " + num + " es Impar");
		}

	}

}
