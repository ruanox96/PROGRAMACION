package capitulo4.ejerciciosSobreHerencia.cuestionarioAbstracto;

import java.util.ArrayList;
import java.util.List;

public abstract class PreguntaOpcion extends Pregunta {

	List<String> respuesta = new ArrayList <String>();
	int respuestaCorrecta;
	
	
	
	public PreguntaOpcion(String enunciado) {
		super(enunciado);
		
		respuesta.add("A) 8");
	}
	
	public void muestraEnPantalla() {
		
	}
}
