package practicasNavidad.Capitulo2.Bloque3;

import javax.swing.JOptionPane;

public class Ejercicio02 {

	public static void main(String[] args) {
	 int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero para obtener su raiz cuadrada"));
	 int raiz;
	 raiz = (int) Math.round(Math.sqrt(num));
	 System.out.println("La raiz cuadrada del numero introducido es "  + raiz);
	 
	 System.out.println("Ahora vamos a calcular la potencia ");
	 int num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
	 int num3 = Integer.parseInt(JOptionPane.showInputDialog("Introduce exponente"));

	 int potencia;
	 potencia = (int) Math.round(Math.pow(num2, num3));
	 
	 
	 System.out.println("La raiz cuadrada del numero introducido es "  + potencia);

	 System.out.println();
	 System.out.println("Y ahora a dividir!");
	 int a = Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer numero"));
	 int b = Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer numero"));
	 int resto = a%b;
	 System.out.println("El resto de la division es " + resto);
	}

}
