package capitulo1;

import javax.swing.JOptionPane;

public class Ejercicio01 {

	public static void main(String[] args) {
	
		int numentero;
		float numflotante;
		double numdouble;

		String str = JOptionPane.showInputDialog("introduce un numero entero");
		numentero = Integer.parseInt(str);
		str = JOptionPane.showInputDialog("introduce un numero flotante");
		numflotante = Float.parseFloat(str);
		str = JOptionPane.showInputDialog("introduce un numero doble");
		numdouble = Double.parseDouble(str);
		
		
		
		System.out.println("El numero entero es:" + numentero +
				"\nEl numero flotante es:" + numflotante +
				"\nEl numero doble es:" +numdouble);
		

	}

}
