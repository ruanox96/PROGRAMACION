package capitulo4.ejerciciosSobreHerencia.circuitoElectronico;

public class Componente {
	
	String nombre;
	String circuitoAnterior;
	String circuitoSiguiente;
	
	public Componente(String nombre, String circuitoAnterior, String circuitoSiguiente) {
		super();
		this.nombre = nombre;
		this.circuitoAnterior = circuitoAnterior;
		this.circuitoSiguiente = circuitoSiguiente;
	}

	@Override
	public String toString() {
		return "Componente [nombre=" + nombre + ", circuitoAnterior=" + circuitoAnterior + ", circuitoSiguiente="
				+ circuitoSiguiente + "]";
	}
	



	

}
