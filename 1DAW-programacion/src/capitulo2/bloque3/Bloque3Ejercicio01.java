package capitulo2.bloque3;

import javax.swing.JOptionPane;

public class Bloque3Ejercicio01 {

	public static void main(String[] args) {
		
		
		String str = JOptionPane.showInputDialog("Introduce la nota del alumno");
		int nota = Integer.parseInt(str);
		
		
			switch (nota) {
				case 0:
				case 1: 
				case 2: 
					System.out.println("La nota del alumno es muy deficiente");
					break;
				case 3: 
					System.out.println("La nota del alumno es Deficiente");
					break;
				case 4: 
					System.out.println("La nota del alumno es Insuficiente");
					break;
				case 5: 
					System.out.println("La nota del alumno es Suficiente");
					break;
				case 6: 
					System.out.println("La nota del alumno es Bien");
					break;
				case 7:
				case 8: 
					System.out.println("La nota del alumno es Notable");
					break;
				case 9:
				case 10: 
					System.out.println("La nota del alumno es Sobresaliente");
					break;
					default:
						System.out.println("El numero introducido no es valido :P");
		}
		

	}

}
