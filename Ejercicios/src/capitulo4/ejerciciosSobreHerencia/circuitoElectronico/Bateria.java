package capitulo4.ejerciciosSobreHerencia.circuitoElectronico;

public class Bateria extends Componente {

	int voltaje;
	
	public Bateria(String nombre, String circuitoAnterior, String circuitoSiguiente) {
		super(nombre, circuitoAnterior, circuitoSiguiente);
		
	}

	public Bateria(String nombre, String circuitoAnterior, String circuitoSiguiente, int voltaje) {
		super(nombre, circuitoAnterior, circuitoSiguiente);
		this.voltaje = voltaje;
	}

	@Override
	public String toString() {
		return "Bateria [voltaje=" + voltaje + ", nombre=" + nombre + ", circuitoAnterior=" + circuitoAnterior
				+ ", circuitoSiguiente=" + circuitoSiguiente + "]";
	}



	
	
	
}
