package capitulo2;

import javax.swing.JOptionPane;

public class Bloque1Ejercicio01 {

	public static void main(String[] args) {
	
		
		
		String str = JOptionPane.showInputDialog("introduce un numero");
		int var1 = Integer.parseInt(str);
		
		str = JOptionPane.showInputDialog("introduce otro numero");
		int var2 = Integer.parseInt(str);
		
		System.out.println("El numero mayor de los introducidos es:" + Math.max(var1, var2));
		
	}

}
