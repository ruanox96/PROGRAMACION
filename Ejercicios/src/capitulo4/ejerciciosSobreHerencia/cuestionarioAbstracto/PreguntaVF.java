package capitulo4.ejerciciosSobreHerencia.cuestionarioAbstracto;

public class PreguntaVF extends Pregunta {

	String respuestaCorrecta;
	
	public PreguntaVF(String enunciado) {
		super(enunciado);
		
	}
	public void muestraEnPantalla(){
		System.out.println(this.enunciado + " Selecciona una respuesta correcta con V o F");
	}
	
	
	public boolean esCorrecta() {
		return true;
		
	}
	
	public PreguntaVF(String enunciado, String respuestaCorrecta) {
		super(enunciado);
		this.respuestaCorrecta = respuestaCorrecta;
	}
	
}
