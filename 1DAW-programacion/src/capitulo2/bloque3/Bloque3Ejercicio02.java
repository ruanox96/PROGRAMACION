package capitulo2.bloque3;

import javax.swing.JOptionPane;

public class Bloque3Ejercicio02 {

	public static void main(String[] args) {
		
		String str = JOptionPane.showInputDialog("Leyenda: "
												+ "\nNumero 1 para sumar,"
												+ " \nNumero 2 para restar, "
												+ "\nNumero 3 para multiplicar, "
												+ "\nNumero 4 para dividir");
		int num1 = Integer.parseInt(str);
		
		
		 switch (num1) {             
		 
		 case 1: str = JOptionPane.showInputDialog("Introduce un numero: ");
		 		 int suma1= Integer.parseInt(str);
		 		 
		 		 str = JOptionPane.showInputDialog("Introduzca otro numero para sumarlo");
		 		 int suma2 = Integer.parseInt(str);
		 		 int resultsuma = (suma1 + suma2);
		 		 System.out.println("La suma es:" + resultsuma);
		 		 break;
		 	
		 		 
		 case 2: str = JOptionPane.showInputDialog("Introduce un numero");
		 		 int resta1 = Integer.parseInt(str);
		 		 
		 		 str= JOptionPane.showInputDialog("Introduce un numero para restarlo");
		 		 int resta2 = Integer.parseInt(str);
		 		 
		 		 int resultresta = (resta1 - resta2);
		 		 System.out.println("La resta es:" + resultresta);
		 		 break;
		 		 
		 
		 case 3: str = JOptionPane.showInputDialog("Introduce un numero");
		 		 int mult1 = Integer.parseInt(str);
		 		 
		 		 str = JOptionPane.showInputDialog("Introduce un numero para multiplicarlo");
		 		 int mult2 = Integer.parseInt(str);
		 		 
		 		 int resultmult = (mult1 * mult2);
		 		 System.out.println("El resultado de la multiplicacion es:" + resultmult);
		 		 break;
		 		 
		 case 4: str = JOptionPane.showInputDialog("Introduce un numero");
		 		 int divi1 = Integer.parseInt(str);
		 		 
		 		 str = JOptionPane.showInputDialog("Introdue un numero para dividirlo");
		 		 int divi2 = Integer.parseInt(str);
		 		 
		 		 int resultdivi = (divi1 / divi2);
		 		 System.out.println("El resultado de la division es:" + resultdivi);
		 		 break;
		 }
		
		}
	}

