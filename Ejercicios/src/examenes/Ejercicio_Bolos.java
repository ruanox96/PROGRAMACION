package examenes;

import javax.swing.JOptionPane;

import metodos.Utils;

public class Ejercicio_Bolos {

	static int bolos[] = new int[10];
	static int puntos = 0;
	static int ronda = 0;
	public static void main(String[] args) {
		int opcion = 2;
		int opcionMenu;
		for (int i = 0; i < bolos.length; i++) {
			bolos[i] = 1;
		}
		while (opcion != 0) {
			opcionMenu = menu();
			switch (opcionMenu) {
			case 0:
				System.out.println("Adios");
				System.exit(0);
				break;
			case 1:
				System.out.println("Vamos a seguir Jugando!");
				tirarbolos();
				break;
			default:
				System.out.println("Opcion no valida");
			}
		}
	}

//	public static int menu() {
//		String strmenu = "\nMenu" + "\n0- Dejar de Jugar" + "\n1- Para empezar a Jugar";
//		for (int i = 0; i < bolos.length; i++) {
//		}
//		int opcionMenu = Integer.parseInt(JOptionPane.showInputDialog(strmenu));
//		return opcionMenu;
//
//	}

	public static int menu() {
		String strmenu = "\nMenu" + "\n0- Para dejar de Jugar" + "\n1- Para seguir jugando";
		int opcionMenu = Integer.parseInt(JOptionPane.showInputDialog(strmenu));
		return opcionMenu;
	}

	public static int[] tirarbolos() {
		int contador = 0;
		int puntosRonda = 0;
		for (int i = 0; i < bolos.length; i++) {
			int probabilidadDerribo = Utils.obtenerNumeroAzar100();
			if (probabilidadDerribo <= 50 && bolos[i] == 1) {
				bolos[i] = 0;
				if (ronda == 0) {
					puntosRonda += 10;
				}
				if (ronda == 1) {
					puntosRonda += 5;
				}
				if (ronda == 2) {
					puntosRonda += 2;
				}
				if (ronda == 3) {
					puntosRonda += 1;
				}
				if (ronda >= 4) {
					puntosRonda += 0;
				}
			}
			if (bolos[i] == 1) {
				contador++;
			}

		}
		ronda ++;
		puntos = puntos + puntosRonda;
		if (contador == 0) {
			System.out.println("Fin del juego");
			System.out.println("Puntuacion total " + puntos);
			System.exit(0);
		}
		System.out.println();
		System.out.println(bolos[0] + "\t" + bolos[1] + "\t" + bolos[2] + "\t" + bolos[3] + "\n");
		System.out.println("     " + bolos[4] + "      " + bolos[5] + "      " + bolos[6] + "\n");
		System.out.println("         " + bolos[7] + "      " + bolos[8] + "\n");
		System.out.println("            " + bolos[9] + "\n");

		System.out.println("Has obtenido " + puntosRonda + " puntos ");

		return bolos;
	}

}
