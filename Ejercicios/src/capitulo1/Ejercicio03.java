package capitulo1;

import javax.swing.JOptionPane;

public class Ejercicio03 {

	public static void main(String[] args) {
		
		int numentero;
		float numflotante;
		double numdoble;
		double suma;
		
		String str = JOptionPane.showInputDialog("Introduce un numero entero:");
		numentero = Integer.parseInt(str);
		
		str = JOptionPane.showInputDialog("Introduce un numero flotante");
		numflotante = Float.parseFloat(str);
		
		str = JOptionPane.showInputDialog("Introduce un numero doble");
		numdoble = Double.parseDouble(str);
		
		suma = numentero + numflotante + numdoble;
		System.out.println("La suma de los 3 numeros introducidos es:" +suma);
	}
}
