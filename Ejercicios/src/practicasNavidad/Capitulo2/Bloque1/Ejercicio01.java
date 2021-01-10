package practicasNavidad.Capitulo2.Bloque1;

import javax.swing.JOptionPane;

public class Ejercicio01 {

	public static void main(String[] args) {
		
		//Mostrar el mayor de los 2 numeros introducidos
		
		int n1, n2;
		
		n1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer numero"));
		n2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el segundo numero"));
		
		if (n1 > n2) {
			System.out.println("El mayor es el" + n1);
		}else {
			System.out.println("El mayor es el" + n2);
		}
	}

}
