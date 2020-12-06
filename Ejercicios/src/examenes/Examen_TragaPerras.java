package examenes;

import javax.swing.JOptionPane;

import metodos.Utils;

public class Examen_TragaPerras {

	public static void main(String[] args) {
		int array[] = new int[3];
		int acumulador = 0;
		
		do {
			menuprincipal();
			for (int i = 0; i<array.length; i++) {
				array[i]=menu();
				if (array[0] == array[1] && array[0] == array[2] && array[1] == array[0] && array[1] == array[2] && array[2] == array[1] && array[2] == array[0]) {
					acumulador += 1000;
				}else if(array[0] != array[1] && array[0] != array[2] && array[1] != array[2] && array[2] != array[0] && array[2] != array[1]){
					acumulador -= 100;
				}
				if (array[0] == 4 && array[1] == 4 && array[2] == 4) { 
					acumulador += 3000;
				}
				
					System.out.println(array[i]);
				}System.out.println("Has obtenido " + acumulador + " puntos");
				
		}while(menuprincipal() != 0);
		
		
	}
	
	public static int menu() {
			/*String strmenu = "\nMenu" 
					+ "\n0- Abandonar programa" 
					+ "\n1- Mora"
					+ "\n2- Naranja"
					+ "\n3- Campana" 
					+ "\n4- Dolar";
		
			int opcionMenu = Integer.parseInt(JOptionPane.showInputDialog(strmenu));*/
			int opcionMenu = Utils.numAleatorioLimSupInf(1, 4);
			if (opcionMenu == 0) {
				System.exit(0);
			}
			return opcionMenu;
	}
	
	public static int menuprincipal() {
		String strmenu = "\nMenu" 
				+ "\n0- Abandonar programa" 
				+ "\n1- Para jugar";
		int opcionMenu = Integer.parseInt(JOptionPane.showInputDialog(strmenu));
		return opcionMenu;
	}
}
