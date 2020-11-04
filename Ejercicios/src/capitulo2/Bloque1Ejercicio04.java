package capitulo2;

import javax.swing.JOptionPane;

public class Bloque1Ejercicio04 {

	public static void main(String[] args) {
		String str = JOptionPane.showInputDialog("introduce un numero");
		int num1 = Integer.parseInt(str);
		str = JOptionPane.showInputDialog("introduce otro numero");
		int num2 = Integer.parseInt(str);
		str = JOptionPane.showInputDialog("introduce otro numero");
		int num3 = Integer.parseInt(str);
		str = JOptionPane.showInputDialog("introduce otro numero");
		int num4 = Integer.parseInt(str);
		str = JOptionPane.showInputDialog("introduce otro numero");
		int num5 = Integer.parseInt(str);
		
			if (num1 < num2){
				if (num1 < num3){
					if (num1 < num4){
						if (num1 < num5){
							System.out.println("El menor numero es: " + num1);
						}}}}
		
		if (num2 < num1){
				if (num2 < num3){
					if (num2 < num4){
						if (num2 < num5){
							System.out.println("El menor numero es:" + num2);
						}}}}
		
		
		if (num3 < num1){
			if (num3 < num2){
					if (num3 < num4){
						if (num3 < num5){
							System.out.println("El menor numero es:" + num3);
						}}}}
				
	
		if (num4 < num1) {
			if (num4 < num2){
				if (num4 < num3){
						if (num4 < num5){
							System.out.println("El menor numero es:" + num4);
						}}}}
						
		
		if (num5 < num1){
			if (num5 < num2){
				if (num5 < num3){
					if (num5 < num4){
							System.out.println("El menor numero es:" + num5);
					}}}}

	}

}
