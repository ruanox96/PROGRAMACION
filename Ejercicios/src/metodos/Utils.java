package metodos;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Utils {

	public static int obtenerNumeroAzar() {
		return (int) Math.round(Math.random() * 50);

	}
	
	public static int obtenerEnteroPorScanner() {
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}
	public static int obtenerEnteroPorJOptionPane() {
		String str = JOptionPane.showInputDialog("Introduce un número");
		int numEntero = Integer.parseInt(str);
		return numEntero;
	}
	public static int obtenerEntero() {
		return obtenerEnteroPorJOptionPane();
	}
}
