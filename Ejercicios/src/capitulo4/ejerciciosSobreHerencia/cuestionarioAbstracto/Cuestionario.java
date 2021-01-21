package capitulo4.ejerciciosSobreHerencia.cuestionarioAbstracto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cuestionario {
	static List<Pregunta> preguntas = new ArrayList<Pregunta>();
	public static void main(String[] args) {
		
		PreguntaVF juegoTronos = new PreguntaVF("Juego de tronos tiene 8 temporadas", "V");
		preguntas.add(juegoTronos);
		
		PreguntaVF andalucia = new PreguntaVF("Andalucia tiene 6 provincias", "F");
		preguntas.add(andalucia);
		
		PreguntaVF madrid = new PreguntaVF("La capital de España es Madrid", "V");
		preguntas.add(madrid);
		
		PreguntaVF shakira = new PreguntaVF("Shakira es morena", "F");
		preguntas.add(shakira);
		
		//PreguntaOpcion pique = new PreguntaOpcion("Shakira esta casada con pique");
		//preguntas.add(pique);
		
		
		int aciertos = 0;
		
		for(Pregunta p : preguntas) {
			p.muestraEnPantalla();
			Scanner sc = new Scanner(System.in);
			String respuestaUsuario = sc.nextLine();
			//boolean correcta = p.respuestaCorrecta(respuestaUsuario);
			
		}
	}

}
