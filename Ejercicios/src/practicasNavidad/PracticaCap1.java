package practicasNavidad;

import javax.swing.JOptionPane;

public class PracticaCap1 {

	public static void ejercicio1capitulo1() {
		int num1;
		float num2;
		double num3;
		
		String str = JOptionPane.showInputDialog(" Introduce un numero entero ");
		num1 = Integer.parseInt(str);

		str = JOptionPane.showInputDialog(" Introduce un numero entero ");
		num2 = Integer.parseInt(str);
		
		str = JOptionPane.showInputDialog(" Introduce un numero entero ");
		num3 = Integer.parseInt(str);
		
		System.out.println(num1 + "\t" + num2 + "\t" + num3);
	}
	
	public static void ejercicio2capitulo1() {
		int num1;
		float num2;
		double num3;
		
		String str = JOptionPane.showInputDialog(" Introduce un numero entero ");
		num1 = Integer.parseInt(str);
		System.out.println(num1);

		str = JOptionPane.showInputDialog(" Introduce un numero entero ");
		num2 = Integer.parseInt(str);
		System.out.println(num2);
		
		str = JOptionPane.showInputDialog(" Introduce un numero entero ");
		num3 = Integer.parseInt(str);
		System.out.println(num3);
		
	}
	public static void ejercicio3capitulo1() {
		int num1;
		float num2;
		double num3;
		double suma = 0;
		
		String str = JOptionPane.showInputDialog(" Introduce un numero entero ");
		num1 = Integer.parseInt(str);
		System.out.println(num1);
		
		str = JOptionPane.showInputDialog(" Introduce un numero entero ");
		num2 = Integer.parseInt(str);
		System.out.println(num2);
		
		str = JOptionPane.showInputDialog(" Introduce un numero entero ");
		num3 = Integer.parseInt(str);
		System.out.println(num3);
		
		suma = num1 + num2 + num3; 
		
		System.out.println("La suma es: " + suma);
	}
	
	public static void ejercicio4capitulo1() {
		int num1;
		int num2;
		int num3;
		int suma = 0;
		int media = 0;
		int cantNum=0;
		
		String str = JOptionPane.showInputDialog(" Introduce un numero entero ");
		num1 = Integer.parseInt(str);
		cantNum++;

		str = JOptionPane.showInputDialog(" Introduce un numero entero ");
		num2 = Integer.parseInt(str);
		cantNum++;
		
		str = JOptionPane.showInputDialog(" Introduce un numero entero ");
		num3 = Integer.parseInt(str);
		cantNum++;
		
		suma = num1 + num2 + num3; 
		
		media = suma / cantNum;
		
		System.out.println("La media es: " + media);
	}
	
	public static void ejercicio5capitulo1() {
		int num1;
		int num2;
		
		String str = JOptionPane.showInputDialog(" Introduce un numero entero ");
		num1 = Integer.parseInt(str);

		str = JOptionPane.showInputDialog(" Introduce un numero entero ");
		num2 = Integer.parseInt(str);
		
		System.out.println("El valor de numero1 es " + num1 + " y el del numero2 es " + num2);
		
		int aux = num1;
		num1 = num2;
		num2 = num1; //el num1 pierde el valor y vale lo que se le asigne al num2
		System.out.println("El valor de numero1 es " + num1 + " y el del numero2 es " + aux);
	}
	
	public static void ejercicio6capitulo1() {
		float Euribor = 5000;
		float Diferencial = 2000;
		int intAnu = 70000;
		float capital = 6000;
		int NumPlazos = 10;
		int cuotaMensual;
		int im = 1200;
		
		im = (intAnu /12) /100;
		System.out.println("El interes mensual es " + im);
		
		
	}
	
}
