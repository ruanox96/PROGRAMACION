package capitulo1;

import javax.swing.JOptionPane;

public class Ejercicio07 {

	public static void main(String[] args) {
		

		String str = JOptionPane.showInputDialog("Escribe un Primer valor: ");
			int var1 = Integer.parseInt(str);
				int var2 = (int) var1 + 1; 
					System.out.println("\nel complemento a dos del numero introducido es: " + var2);		
		}


	}
