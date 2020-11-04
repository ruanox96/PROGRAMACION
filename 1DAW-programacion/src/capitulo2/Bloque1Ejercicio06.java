package capitulo2;

import javax.swing.JOptionPane;

public class Bloque1Ejercicio06 {

	public static void main(String[] args) {
		

		String str = JOptionPane.showInputDialog("introduce un numero");
		int num = Integer.parseInt(str);
		
		if (num % 2 == 0) {
			System.out.println("El " + num + " es un numero PAR");
		}else {
			System.out.println("El " + num + " es un numero IMPAR");
		}
	}

}
