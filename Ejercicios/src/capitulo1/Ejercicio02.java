package capitulo1;

import javax.swing.JOptionPane;


public class Ejercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numentero;
		float numflotante;
		double numdouble;
		
		String src = JOptionPane.showInputDialog("Introduzca el numero entero");
		numentero = Integer.parseInt(src);
		System.out.println("El numero entero es:" + numentero);
		
		src = JOptionPane.showInputDialog("Introduzca el numero flotante");
		numflotante = Float.parseFloat(src);
		System.out.println("El numero flotante es:" + numflotante);
		
		src = JOptionPane.showInputDialog("Introduzca el numero doble");
		numdouble = Double.parseDouble(src);
		System.out.println("El numero doble es:" + numdouble);
		
		
	
	}

}
