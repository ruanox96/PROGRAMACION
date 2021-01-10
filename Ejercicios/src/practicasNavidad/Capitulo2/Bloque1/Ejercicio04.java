package practicasNavidad.Capitulo2.Bloque1;

import javax.swing.JOptionPane;

public class Ejercicio04 {

	public static void main(String[] args) {
		int n1, n2, n3, n4, n5;

		n1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer numero"));
		n2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el segundo numero"));
		n3 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer numero"));
		n4 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer numero"));
		n5 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer numero"));

		if (n1<n2 && n1<n3 && n1<n4 && n1<n5) {
			System.out.println("El menor es el " + n1);
			
		} else if (n2<n1 && n2<n3 && n2<n4 && n2<n5){
			System.out.println("El menor es el " + n2);
			
		} else if (n3<n1 && n3<n2 && n3<n4 && n3<n5){
			System.out.println("El menor es el " + n3);
			
		}else if (n4<n1 && n4<n2 && n4<n3 && n4<n5){
			System.out.println("El menor es el " + n4);
			
		}else if (n5<n1 && n5<n2 && n5<n3 && n5<n4){
			System.out.println("El menor es el " + n5);
		}

	}
}
