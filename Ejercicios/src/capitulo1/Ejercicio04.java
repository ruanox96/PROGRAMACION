package capitulo1;

import javax.swing.JOptionPane;

public class Ejercicio04 {

	public static void main(String[] args) {
		
		int numentero;
		float numflotante;
		double numdouble;
		double suma;
		
		String src = JOptionPane.showInputDialog("Introduce un numero entero");
		numentero = Integer.parseInt(src);
		
		src= JOptionPane.showInputDialog("Introduzca cualquier numero floante");
		numflotante = Float.parseFloat(src);
		
		src = JOptionPane.showInputDialog("Introduzca cualquier numero doble");
		numdouble = Double.parseDouble(src);
		
		suma = numentero + numflotante + numdouble;
		
		System.out.println("La media de los 3 numeros introducidos es:" + (suma /3));
		
		
		
	}

}
