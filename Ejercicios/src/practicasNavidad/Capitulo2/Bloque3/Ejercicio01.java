package practicasNavidad.Capitulo2.Bloque3;

import javax.swing.JOptionPane;

public class Ejercicio01 {

	public static void main(String[] args) {
		int nota = Integer.parseInt(JOptionPane.showInputDialog("Introduce la nota del alumno"));
		
		if (nota == 0 || nota == 1) {
			System.out.println("El alumno ha sacado un " + nota + " (Muy deficiente)");
		}
		if (nota == 2 || nota == 3) {
			System.out.println("El alumno ha sacado un " + nota + " (Deficiente)");
		}
		if (nota == 4) {
			System.out.println("El alumno ha sacado un " + nota + " (Insuficiente)");
		}
		if (nota == 5) {
			System.out.println("El alumno ha sacado un " + nota + " (Suficiente)");
		}
		if (nota == 6) {
			System.out.println("El alumno ha sacado un " + nota + " (Bien)");
		}
		if (nota == 7 || nota == 8) {
			System.out.println("El alumno ha sacado un " + nota + " (Notable)");
		}
		if (nota == 9 || nota == 10) {
			System.out.println("El alumno ha sacado un " + nota + " (Sobresaliente)");
		}
	}

}
