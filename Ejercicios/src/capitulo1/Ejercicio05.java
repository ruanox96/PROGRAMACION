package capitulo1;

import javax.swing.JOptionPane;

public class Ejercicio05 {

	public static void main(String[] args) {
		
		int numero1, numero2, aux;
		
		
		String src = JOptionPane.showInputDialog("Introduce un numero entero:");
		numero1 = Integer.parseInt(src);
		
		src = JOptionPane.showInputDialog("Introduce un nunero entero:");
		numero2 = Integer.parseInt(src);
		
		System.out.println("El valor de numero1 es:" + numero1 + "\ty el del numero2 es:" + numero2);
		
		
		
		aux = numero2;
		numero1 = numero2;
		numero2 = numero1;
		System.out.println("El valor de numero1 es:" + numero1 + "\ty el del numero2 es:" + aux);
		
		
		
		
		

		
		
	}

}
