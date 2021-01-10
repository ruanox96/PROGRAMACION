package practicasNavidad.Capitulo2.Bloque1;

import javax.swing.JOptionPane;

public class Ejercicio02 {

	public static void main(String[] args) {
		//Mostrar el Menor de los 2 numeros introducidos
		
		int n1, n2;

		n1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer numero"));
		n2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el segundo numero"));

		if (n1 < n2) {
			System.out.println("El menor es el " + n1);
		} else {
			System.out.println("El menor es el " + n2);
		}

	}

}
