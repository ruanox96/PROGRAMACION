package capitulo4.ejerciciosSobreHerencia.cuestionarioAbstracto;

public abstract class Pregunta {
	String enunciado;

	public abstract void muestraEnPantalla();

	
	public Pregunta(String enunciado) {
		super();
		this.enunciado = enunciado;
	}
	
	
	@Override
	public String toString() {
		return "Pregunta [enunciado=" + enunciado + "]";
	}

	public String getEnunciado() {
		return enunciado;
	}

	public void setEnunciado(String enunciado) {
		this.enunciado = enunciado;
	}

	public abstract boolean esCorrecta();
}
